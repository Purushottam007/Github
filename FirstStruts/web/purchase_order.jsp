<jsp:include page="header.jsp"/>
	<div class="row bg-grey">
		<div class="para">
			<p>NEW PURCHASE ORDER</p>
		</div>
	</div>
	<br> <br>
	<div class="container">
		<form action="/purchaseorder.do" method="post">
			<div class="row" style="text-align: left;">
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>P.O. Number </label>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
							<input type="text" class="form-control" name="ponumber" id="ponumber">
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Status</label>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
							<input type="text" class="form-control" name="status" id="status">
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Priority</label>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
							<input type="text" class="form-control" name="priority" id="priority">
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="text-align: left;">
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<div class="row">
						<div
							class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>P.O. Issue Date </label>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
							<input type="text" class="form-control" name="poissuedate" id="poissuedate">
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<div class="row">
						<div
							class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>*Due Date</label>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
							<input type="text" class="form-control" name="duedate" id="duedate">
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<div class="row">
						<div
							class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label> Seller / Vendor</label>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
							<input type="text" class="form-control" name="seller" id="seller">
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="text-align: left;">
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<div class="row">
						<div
							class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Trans Resp </label>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
							<input type="text" class="form-control" name="transresp" id="transresp">
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<div class="row">
						<div
							class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label> Incoterms </label>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
							<input type="text" class="form-control" name="incoterms" id="incoterms">
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<div class="row">
						<div
							class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label> Bill To </label>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
							<input type="text" class="form-control" name="billto" id="billto">
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="text-align: left;">
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Designated Mode </label>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
							<input type="text" class="form-control" name="designatedmode" id="designatedmode">
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label> Carrier </label>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
							<input type="text" class="form-control" name="carrier" id="carrier">
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label> Must Ship Together ? </label>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
							<input type="checkbox" name="shiptogether" id="shiptogether" style="height: 20; width: 20;">
						</div>
					</div>
				</div>
			</div>
			<hr>
			<div class="row" style="text-align: left;">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<h4 style="color: blue; margin-left: 50px;">ORIGIN</h4>
						</div>
					</div>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<h4 style="color: blue; margin-left: 50px;">DESTINATION</h4>
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="text-align: left;">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Ship From</label>
						</div>
						<div class=" col-md-6 ">
							<input type="text" class="form-control" name="shipfrom" id="shipfrom">
						</div>
					</div>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Ship To</label>
						</div>
						<div class="col-md-6 ">
							<input type="text" class="form-control" name="shipto" id="shipto">
						</div>
					</div>
				</div>	
			</div>
			<div class="row" style="text-align: left;">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Street Address </label>
						</div>
						<div class="col-md-6 ">
							<input type="text" class="form-control" name="originstreet" id="originstreet">
						</div>
					</div>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Street Address </label>
						</div>
						<div class="col-md-6 ">
							<input type="text" class="form-control" name="destinationstreat" id="destinationstreat">
						</div>
					</div>
				</div>	
			</div>
			<div class="row" style="text-align: left;">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
					   		<label>City</label>
						</div>
						<div class="col-md-6 ">
							<input type="text" class="form-control" name="origincity" id="origincity">
						</div>
					</div>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>city</label>
						</div>
						<div class="col-md-6 ">
							<input type="text" class="form-control" name="destinationcity" id="destinationcity">
						</div>
					</div>
				</div>	
			</div>
			<div class="row" style="text-align: left;">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row"> 
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>State </label>
						</div>
						<div class="col-md-6 ">
							<input type="text" class="form-control" name="originstate" id="originstate">
						</div>
					</div>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>State</label>
						</div>
						<div class="col-md-6 ">
							<input type="text" class="form-control" name="destinationstate" id="destinationstate">
						</div>
					</div>
				</div>	
			</div>
			<div class="row" style="text-align: left;">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Country</label>
						</div>
						<div class="col-md-6 ">
							<input type="text" class="form-control" name="origincountry" id="origincountry">
						</div>
					</div>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Country </label>
						</div>
						<div class="col-md-6 ">
							<input type="text" class="form-control" name="destinationcountry" id="destinationcountry">
						</div>
					</div>
				</div>	
			</div>
			<div class="row" style="text-align: left;">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Pickup Start</label>
						</div>
						<div class="col-md-6 ">
							<input type="text" class="form-control" name="pickupstart" id="pickupstart">
						</div>
					</div>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Delivery Start</label>
						</div>
						<div class="col-md-6 ">
							<input type="text" class="form-control" name="deliverystart" id="deliverystart">
						</div>
					</div>
				</div>	
			</div>
			<div class="row" style="text-align: left;">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Pickup End</label>
						</div>
						<div class="col-md-6 ">
							<input type="text" class="form-control" name="pickupend" id="pickupend">
						</div>
					</div>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<div class="row">
						<div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
							<label>Delivery End</label>
						</div>
						<div class="col-md-6 ">
							<input type="text" class="form-control" name="deliveryend" id="deliveryend">
						</div>
					</div>
				</div>	
			</div>
			<br><br>
			<div class="row" style="text-align: left;">
				<div class="col-lg-offset-5 col-md-offset-5 col-sm-offset-4 col-xs-offset-3 col-lg-1 col-md-1 col-sm-2 col-xs-3">
					
						<div class="col-md-6 ">
							<input type="submit" class="btn btn-primary" name="pickupend" id="pickupend">
						</div>
					
				</div>
				<div class="col-lg-1 col-md-1 col-sm-2 col-xs-3">
					
						<div class="col-md-6 ">
							<button class="btn btn-primary" name="deliveryend" id="deliveryend">Reset</button>
						</div>
					
				</div>	
			</div>
		</form>
	</div>
</body>

</html>