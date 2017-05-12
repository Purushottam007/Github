package manage;

import actions.RetreiveAction;
import addresses.Po;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by PURUSHOTHAM on 06/05/2017.
 */
public class PoManage {
    private static final SessionFactory ourSessionFactory;

    static {
        try {


            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }
    Session session= getSession();
Transaction tx = session.beginTransaction();
List<?> list=new ArrayList<>();


    public  int createPurchaseOrder(Po po){


        try {

            session.save(po);
          tx.commit();
          session.close();
        }catch (Exception e){
            System.err.println("Error creating User:"+e.getMessage());
            tx.rollback();
            return  0;
        }
        return 0;

    }
    public List<Results> viewPo() {
        List<Results> list=new ArrayList<>();
        String sql="select poO.id,poO.poNum,poO.seller,poO.dueDate,poO.status,poO.priority,poO.transResp,sourceAddr.shipFrom,des.shipTo\n" +
                "from po poO \n" +
                "join po_source_address poSource on poO.id=poSource.Po_id\n" +
                "join source_address sourceAddr on sourceAddr.ID=poSource.Po_id\n" +
                "join po_destination_address pod on poO.id=pod.Po_id\n" +
                "join destination_address des on des.ID=pod.destinationAddressList_ID;";
        SQLQuery query = session.createSQLQuery(sql);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);


       // Query query = session.createSQLQuery(sql);
       /* query.setFirstResult(RetreiveAction.count*5);
        RetreiveAction.count++;
        query.setMaxResults(5);*/
        List gets = query.list();

        System.out.println("==============="+gets.toString());

        for(Object po:gets){
            Map m=(Map)po;
            Results results=new Results();
            results.setPoNum((int)m.get("poNum"));
            results.setSeller(m.get("seller").toString());
            results.setDueDate((Date)m.get("dueDate"));
            results.setStatus(m.get("status").toString());
            results.setPriority(m.get("priority").toString());
            results.setShipFrom(m.get("shipFrom").toString());
            results.setShipTo(m.get("shipTo").toString());
            results.setTransResp(m.get("transResp").toString());
            list.add(results);
        }


        return list;


    }
}
