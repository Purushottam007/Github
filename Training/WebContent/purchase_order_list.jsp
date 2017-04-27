<jsp:include page="header.jsp"/>
<%@ page import= "Model.PurchaseOrder"%>
<%@ page import="java.util.List" %>

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
				<% List<PurchaseOrder> purchaseOrder = (List<PurchaseOrder>) request.getAttribute("purchase"); 
				for (PurchaseOrder po: purchaseOrder){
				%>
				<tr>
					<td><input type="checkbox" ></td>
					<td><%=po.getPo_number() %></td>
					<td><%=po.getSeller() %></td>
					<td><%=po.getDue_date() %></td>
					<td><%=po.getStatus() %></td>
					<td><%=po.getPriority() %></td>
					<td><%=po.getOrigin().getShip_from() %></td>			
					<td><%=po.getDestination().getShip_to()%></td>
					<td><%=po.getTrans_resp()%></td>
					<td></td>
				</tr>
				<%} %>
			</table>
		</div>
	
	</div>
</body>
</html>