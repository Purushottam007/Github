import addresses.Po;
import comparator.*;
import manage.PoManage;
import manage.Results;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;

/**
 * Created by PURUSHOTHAM on 11/05/2017.
 */
public class Sort extends org.apache.struts.action.Action {


    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        PoManage poManage=new PoManage();
        List<Results> gets=poManage.viewPo();

        if(request.getParameter("act").equalsIgnoreCase("P.O. Number"))
            Collections.sort(gets,new NumberComparator());
        if(request.getParameter("act").equalsIgnoreCase("Supplier"))
            Collections.sort(gets,new SupplierComparator());
        if(request.getParameter("act").equalsIgnoreCase("Due Date"))
            Collections.sort(gets,new DueDateComparator());
        if(request.getParameter("act").equalsIgnoreCase("P.O. Status"))
            Collections.sort(gets,new StatusComparator());
        if(request.getParameter("act").equalsIgnoreCase("Priority"))
            Collections.sort(gets,new PriorityComparator());
       /* if(request.getParameter("act").equalsIgnoreCase("Item(s)"))
            Collections.sort(gets,new ItemComparator());*/
        if(request.getParameter("act").equalsIgnoreCase("Ship From"))
         //   Collections.sort(gets,new ShipFromComparator());
        if(request.getParameter("act").equalsIgnoreCase("Ship To"))
          //  Collections.sort(gets,new ShipToComparator());
        if(request.getParameter("act").equalsIgnoreCase("Trans. Resp."))
            Collections.sort(gets,new TransComparator());

        request.setAttribute("poList",gets);
        return mapping.findForward("success");





        /*String sql = "FROM Purchaseorder ";
        org.hibernate.query.Query query = session.createQuery(sql);
        query.setFirstResult(Insert2DB.count * 3);
        Insert2DB.count++;
        System.out.println("*&*&*&*&*&*&*&*&*&");
        query.setMaxResults(3);
        List<Purchaseorder> gets = query.list();
        List<Purchaseorder>po=new ArrayList<>();
        for(int i=0;i<gets.size();i++){
            System.out.println("qwertyuiopasdfghjkl:"+i);
            Purchaseorder por=(Purchaseorder)gets.get(i);
            po.add(por);
        }
        Collections.sort(po);*/


        //Pagination






    }



}
