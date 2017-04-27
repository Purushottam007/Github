package serv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Destination;
import Model.Origin;
import Model.PurchaseOrder;
import manage.PoManage;

/**
 * Servlet implementation class PurchaseOrder
 */
@WebServlet("/purchaseorder")
public class PurchaseOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PurchaseOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("inside dopost");

		String ponumber = request.getParameter("ponumber");
		System.out.println(request.getParameter("ponumber"));
		String status = request.getParameter("status");
		String priority = request.getParameter("priority");
		System.out.println(request.getParameter("priority"));
		String poissuedate = request.getParameter("poissuedate");
		String duedate = request.getParameter("duedate");
		String seller = request.getParameter("seller");
		System.out.println(request.getParameter("seller"));
		String transresp = request.getParameter("transresp");
		String incoterms = request.getParameter("incoterms");
		String billto = request.getParameter("billto");
		System.out.println(request.getParameter("billto"));
		String designatedmode = request.getParameter("designatedmode");
		String carrier = request.getParameter("carrier");
		System.out.println(request.getParameter("carrier"));
		String shiptogether = request.getParameter("shiptogether");
		
		
		
		
		String shipfrom = request.getParameter("shipfrom");
		String originstreet = request.getParameter("originstreet");
		String origincity = request.getParameter("origincity");
		String originstate = request.getParameter("originstate");
		String origincountry = request.getParameter("origincountry");
		String pickupstart = request.getParameter("pickupstart");
		String pickupend = request.getParameter("pickupend");
		
		
		
		
		String shipto = request.getParameter("shipto");
		String destinationstreat = request.getParameter("destinationstreat");
		String destinationcity = request.getParameter("destinationcity");
		String destinationstate = request.getParameter("destinationstate");
		String destinationcountry = request.getParameter("destinationcountry");
		String deliverystart = request.getParameter("deliverystart");
		String deliveryend = request.getParameter("deliveryend");
		
		
		Origin orgAdress=new Origin();
		
		orgAdress.setShip_from(shipfrom);
		orgAdress.setStreet_adress(originstreet);
		orgAdress.setCity(origincity);
		orgAdress.setState(originstate);
		orgAdress.setCountry(origincountry);
		orgAdress.setPickup_start(pickupstart);
		orgAdress.setPickup_end(pickupend);
		
		
		
		Destination desAdress=new Destination();
		
		desAdress.setShip_to(shipto);
		desAdress.setStreet_adress(destinationstreat);
		desAdress.setCity(destinationcity);
		desAdress.setState(destinationstate);
		desAdress.setCountry(destinationcountry);
		desAdress.setDelivery_start(deliverystart);
		desAdress.setDelivery_end(deliveryend);
		
		
		
		PurchaseOrder po=new PurchaseOrder();
		
		po.setDesinated_mode(designatedmode);
		po.setDestination(desAdress);
		po.setDue_date(duedate);
		po.setIncorterns(incoterms);
		po.setOrigin(orgAdress);
		po.setPo_issue_date(poissuedate);
		po.setPo_number(Integer.parseInt(ponumber));
		po.setShip_together(Boolean.parseBoolean(shiptogether));
		po.setStatus(status);
		po.setTrans_resp(transresp);
		po.setBillto(billto);
		po.setCarrier(carrier);
		po.setPriority(priority);
		po.setSeller(seller);
		
		PoManage manage = new PoManage();
				manage.createPurchaseOrder(po);
				
				RequestDispatcher view=request.getRequestDispatcher("PurachseOrderList");
				view.forward(request, response);
				return;
		
		
		
		
		
		
		
		
		
		
		
	}

}
