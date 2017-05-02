<jsp:include page="header.jsp"/>
<%@ page import= "model.PurchaseOrder"%>
<%@ page import="java.util.List" %>
<%@ page import="action.RegisterForm" %>
<%@ page import="java.util.ArrayList" %>

<div class="container-fluid">
		<div class="row bg-grey">
			<div class="para">
				<p>PURCHASE ORDER LIST</p>
			</div>
		</div>
		<div >
			<table class="nav nav-pills nav-justified table-condensed table-striped">
				<tr class="textcolour" style="background-color:#0080ff;">
					<td><input type="checkbox" name="selectall" id="selectall" ></td>
					<td>po_number</td>
					<td>seller</td>
					<td>due_date</td>
					<td>status</td>
					<td>priority</td>
					<td>ship_from</td>
					<td>ship_to</td>
					<td>trans_resp</td>
				</tr>
				<% ArrayList arrayList=(ArrayList)request.getAttribute("registerDo");
				if(arrayList!=null){

				    for(int i=0;i<arrayList.size();i++){
				        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX"+ arrayList.get(i).toString());
						PurchaseOrder po=(PurchaseOrder)arrayList.get(i);


				%>
				<tr>
					<td><input type="checkbox" ></td>
					<td><%=po.getPonumber() %></td>
					<td><%=po.getSeller() %></td>
					<td><%=po.getDuedate() %></td>
					<td><%=po.getStatus() %></td>
					<td><%=po.getPriority() %></td>
					<td><%=po.getOrigin().getShipfrom() %></td>
					<td><%=po.getDestination().getShipto()%></td>
					<td><%=po.getTransresp()%></td>
					<td></td>
				</tr>
				<%} }%>
			</table>
		</div>
	
	</div>
</body>
</html>