package manage;

import database.ConnectionManage;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.Destination;
import Model.Origin;
import Model.PurchaseOrder;

public class PoManage 
{
	PreparedStatement pstmt;
	Connection con;
	public int createPurchaseOrder(PurchaseOrder po)
	{
		
		con=ConnectionManage.getConnection();
		
		try {
			
			pstmt=(PreparedStatement) con.prepareStatement("insert into origintable (id, ship_From, street_adress, city, state, country, pickup_start, pickup_end )"
	                 +"values(null,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
			System.out.println(pstmt);
			Origin orgAdress=po.getOrigin();			
			pstmt.setString (1,orgAdress.getShip_from());
			pstmt.setString (2,orgAdress.getStreet_adress());
			pstmt.setString (3,orgAdress.getCity());
			
			pstmt.setString (4,orgAdress.getState());
			pstmt.setString (5,orgAdress.getCountry());
			pstmt.setString (6,orgAdress.getPickup_start());
			pstmt.setString (7,orgAdress.getPickup_end());
			
			pstmt.executeUpdate();
	ResultSet rs = pstmt.getGeneratedKeys();
	rs.next();
	int orgAddId = rs.getInt(1);
	
	
			Destination desAdress=po.getDestination();
			pstmt=(PreparedStatement)con.prepareStatement("insert into destination(id, ship_to, street_adress, city, state, country, delivery_start, delivery_end )"
		            +"values(null,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, desAdress.getShip_to());
			pstmt.setString(2, desAdress.getStreet_adress());
			pstmt.setString(3, desAdress.getCity());
			pstmt.setString(4, desAdress.getState());
			pstmt.setString(5, desAdress.getCountry());
			pstmt.setString(6, desAdress.getDelivery_start());
			pstmt.setString(7, desAdress.getDelivery_end());
			
			pstmt.executeUpdate();
			 rs=pstmt.getGeneratedKeys();
			 rs.next();
			 int desAdressId=rs.getInt(1);
			 
			 pstmt=con.prepareStatement("insert into purchase_order(id,po_number,po_issue_date,trans_resp,designated_mode,status,due_date,Incoterns,"
				 		+ "carrier,priority,seller,ship_together,billto,origin_id,destinatin_id)"
						+"values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			 pstmt.setInt(1,po.getPo_number());
			 pstmt.setString(2,po.getPo_issue_date());
			 pstmt.setString(3,po.getTrans_resp());
			 pstmt.setString(4,po.getDesinated_mode());
			 pstmt.setString(5,po.getStatus());
			 pstmt.setString(6,po.getDue_date());
			 pstmt.setString(7,po.getIncorterns());
			 pstmt.setString(8,po.getCarrier());
			 pstmt.setString(9,po.getPriority());
			 pstmt.setString(10,po.getSeller());
			 pstmt.setBoolean(11,po.isShip_together());
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
	public List< PurchaseOrder> viewPurchaseOrder()
	{
		
		System.out.println("enter the view purchase order");
		List<PurchaseOrder> poList=new ArrayList<PurchaseOrder>();
		try{
			System.out.println("in try");
			con=ConnectionManage.getConnection();
			pstmt=con.prepareStatement("select p.po_number,p.seller,p.due_date,p.status,p.priority,o.ship_from,d.ship_to,p.trans_resp "
					+ "from purchase_order p,origintable o,destination d "
					+ "where p.origin_id=o.id and p.destinatin_id=d.id;" );
			System.out.println(pstmt);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("before while");
			while(rs.next())
			{
				System.out.println("while started");
				PurchaseOrder purchaseOrder=new PurchaseOrder();
				purchaseOrder.setPo_number(rs.getInt("po_number"));
				purchaseOrder.setSeller(rs.getString("seller"));
				purchaseOrder.setDue_date(rs.getString("due_date"));
				purchaseOrder.setStatus(rs.getString("status"));
				purchaseOrder.setPriority(rs.getString("priority"));
				purchaseOrder.setTrans_resp(rs.getString("trans_resp"));
				System.out.println(rs.getInt("po_number"));
				
				Origin origin=new Origin();
				origin.setShip_from(rs.getString("ship_from"));
				purchaseOrder.setOrigin(origin);
				
				Destination destination=new Destination();
				destination.setShip_to(rs.getString("ship_to"));
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
