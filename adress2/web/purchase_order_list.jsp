<jsp:include page="header.jsp"/>
<%@ page import="java.util.List" %>

<%--<%@ page import="com.grailsbrains.action.POListAction"%>--%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="forms.*" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="addresses.Po"%>
<%@ page import="java.util.Map" %>
<%@ page import="manage.Results" %>


<div class="container-fluid">
		<div class="row bg-grey">
			<div class="para">
				<p>PURCHASE ORDER LIST</p>
			</div>
		</div>
		<div >
			<table class="nav nav-pills nav-justified table-condensed table-striped">
				<Form action="sort.do">
				<tr class="textcolour" style="background-color:#0080ff;">
					<td><input type="checkbox" name="selectall" id="selectall" ></td>
					<td><input type="submit" name="act" value="P.O. Number"></td>
					<td><input type="submit" name="act" value="Supplier"></td>
					<td><input type="submit" name="act" value="Due Date"></td>
					<td><input type="submit" name="act" value="P.O. Status"></td>
					<td><input type="submit" name="act" value="Priority"></td>
					<td><input type="submit" name="act" value="Item(s)"></td>
					<td><input type="submit" name="act" value="Ship From"></td>
					<td><input type="submit" name="act" value="Ship To"></td>
					<td><input type="submit" name="act" value="Trans. Resp."></td>
				</tr>
				</Form>
			
				<%
					ArrayList <Results> arrList = (ArrayList) request.getAttribute("poList");
						for(Results obj : arrList){
							//Map po = (Map) obj;


					%>
				<tr>
					<td><input type="checkbox" class="checkbox" name="check[]" ></td>
					<td><%= obj.getPoNum() %></td>
					<td><%= obj.getSeller() %></td>
					<td><%= obj.getDueDate() %></td>
					<td><%= obj.getStatus() %></td>
					<td><%= obj.getPriority() %></td>
					<td></td>
					<td><%= obj.getShipFrom()%></td>
					<td><%= obj.getShipTo()%></td>
					<td><%= obj.getTransResp()%></td>
				</tr>
				<%
				}%>
			</table>
		</div>
		<br><br>
		<div class="row" style="text-align: left;">
				<div class="col-lg-offset-7 col-md-offset-7 col-sm-offset-6 col-xs-offset-4 col-lg-1 col-md-1 col-sm-2 col-xs-3">
					
						<div class="col-md-6 ">
							<button class="btn btn-primary" name="edit" id="edit">Edit</button>
						</div>
					
				</div>
				<div class="col-lg-1 col-md-1 col-sm-2 col-xs-3">
					
						<div class="col-md-6 ">
							<button class="btn btn-primary" name="delete" id="delete">Delete</button>
						</div>
					
				</div>	
			</div>
	
	</div>
<form action="next.do" >
	<input type="submit" value="NEXT">

</form>
	<script  type="text/javascript">
	var select_all = document.getElementById("select_all"); //select all checkbox
	var checkboxes = document.getElementsByClassName("checkbox"); //checkbox items

	//select all checkboxes
	select_all.addEventListener("change", function(e){
	    for (i = 0; i < checkboxes.length; i++) { 
	        checkboxes[i].checked = select_all.checked;
	    }
	});


	for (var i = 0; i < checkboxes.length; i++) {
	    checkboxes[i].addEventListener('change', function(e){ //".checkbox" change 
	        //uncheck "select all", if one of the listed checkbox item is unchecked
	        if(this.checked == false){
	            select_all.checked = false;
	        }
	        //check "select all" if all checkbox items are checked
	        if(document.querySelectorAll('.checkbox:checked').length == checkboxes.length){
	            select_all.checked = true;
	        }
	    });
	}
	</script>
</body>
</html>