package action;

import connection.ConnectionManage;
import model.Destination;
import model.Origin;
import model.PurchaseOrder;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PURUSHOTHAM on 02/05/2017.
 */
public class RegisterDo {
    Connection con=null;
    PreparedStatement pstmt=null;


    public  int save(PurchaseOrder po){
        int insert=0;
        con= ConnectionManage.getConnection();

        try {

            pstmt=(PreparedStatement) con.prepareStatement("insert into origintable (id, ship_From, street_adress, city, state, country, pickup_start, pickup_end )"
                    +"values(null,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            System.out.println(pstmt);
            Origin orgAdress=po.getOrigin();
            pstmt.setString (1,orgAdress.getShipfrom());
            pstmt.setString (2,orgAdress.getOriginstreet());
            pstmt.setString (3,orgAdress.getOrigincity());

            pstmt.setString (4,orgAdress.getOriginstate());
            pstmt.setString (5,orgAdress.getOrigincountry());
            pstmt.setString (6,orgAdress.getPickupstart());
            pstmt.setString (7,orgAdress.getPickupend());

            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            rs.next();
            int orgAddId = rs.getInt(1);


            Destination desAdress=po.getDestination();
            pstmt=(PreparedStatement)con.prepareStatement("insert into destination(id, ship_to, street_adress, city, state, country, delivery_start, delivery_end )"
                    +"values(null,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, desAdress.getShipto());
            pstmt.setString(2, desAdress.getDestinationstreat());
            pstmt.setString(3, desAdress.getDestinationcity());
            pstmt.setString(4, desAdress.getDestinationstate());
            pstmt.setString(5, desAdress.getDestinationcountry());
            pstmt.setString(6, desAdress.getDeliverystart());
            pstmt.setString(7, desAdress.getDeliveryend());

            pstmt.executeUpdate();
            rs=pstmt.getGeneratedKeys();
            rs.next();
            int desAdressId=rs.getInt(1);

            pstmt=con.prepareStatement("insert into purchase_order(id,po_number,po_issue_date,trans_resp,designated_mode,status,due_date,Incoterns,"
                    + "carrier,priority,seller,ship_together,billto,origin_id,destinatin_id)"
                    +"values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pstmt.setInt(1,po.getPonumber());
            pstmt.setString(2,po.getPoissuedate());
            pstmt.setString(3,po.getTransresp());
            pstmt.setString(4,po.getDesinatedmode());
            pstmt.setString(5,po.getStatus());
            pstmt.setString(6,po.getDuedate());
            pstmt.setString(7,po.getIncorterns());
            pstmt.setString(8,po.getCarrier());
            pstmt.setString(9,po.getPriority());
            pstmt.setString(10,po.getSeller());
            pstmt.setBoolean(11,po.isShiptogether());
            pstmt.setString(12,po.getBillto());
            pstmt.setInt(13,orgAddId);
            pstmt.setInt(14,desAdressId);
            // ""
            int n= pstmt.executeUpdate();
            System.out.println(n+"   row inserted");









        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



        return 0;
    }
    public List<PurchaseOrder> viewPurchaseOrder(String st)
    {

        System.out.println("enter the view purchase order");
        List<PurchaseOrder> poList=new ArrayList<PurchaseOrder>();
        try{
            System.out.println("in try");
            con=ConnectionManage.getConnection();
            pstmt=con.prepareStatement(st);
            System.out.println(pstmt);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("before while");
            while(rs.next())
            {
                System.out.println("while started");
                PurchaseOrder purchaseOrder=new PurchaseOrder();
                purchaseOrder.setPonumber(rs.getInt("po_number"));
                purchaseOrder.setSeller(rs.getString("seller"));
                purchaseOrder.setDuedate(rs.getString("due_date"));
                purchaseOrder.setStatus(rs.getString("status"));
                purchaseOrder.setPriority(rs.getString("priority"));
                purchaseOrder.setTransresp(rs.getString("trans_resp"));
                System.out.println(rs.getInt("po_number"));

                Origin origin=new Origin();
                origin.setShipfrom(rs.getString("ship_from"));
                purchaseOrder.setOrigin(origin);

                Destination destination=new Destination();
                destination.setShipto(rs.getString("ship_to"));
                purchaseOrder.setDestination(destination);

                poList.add(purchaseOrder);
            }

        }catch(Exception e)
        {

        }finally{
            try{
                con.close();
            }catch(SQLException e)
            {
                System.out.println("excetion occured while closing connection");
            }
        }
        return poList;
    }
}
