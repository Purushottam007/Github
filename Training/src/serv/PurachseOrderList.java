package serv;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.PurchaseOrder;
import manage.PoManage;

/**
 * Servlet implementation class PurachseOrderList
 */
@WebServlet("/PurachseOrderList")
public class PurachseOrderList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PurachseOrderList() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		RequestDispatcher view;
		PoManage poManage=new PoManage();
		List<PurchaseOrder> po=poManage.viewPurchaseOrder();
		Iterator<PurchaseOrder> iterator=po.iterator();
		while(iterator.hasNext())
		{
			PurchaseOrder p1=iterator.next();
			System.out.println(p1.getPo_number());
			System.out.println(p1.getSeller());
			System.out.println(p1.getDue_date());
			System.out.println(p1.getStatus());
			System.out.println(p1.getPriority());
			System.out.println(p1.getOrigin().getShip_from());
			System.out.println(p1.getDestination().getShip_to());
			System.out.println(p1.getTrans_resp());
			
		}
		request.setAttribute("purchase", po);
		view = request.getRequestDispatcher("purchase_order_list.jsp");
		view.forward(request, response);
	}

}
