package Model;

public class PurchaseOrder 
{
	private int id;
	private int po_number;
	private String po_issue_date;
	private String trans_resp;
	private String desinated_mode;
	private String status;
	private String due_date;
	private String incorterns;
	private String carrier;
	private String priority;
	private String seller;
	private boolean ship_together;
	private String billto;
	private Origin origin;
	private Destination destination;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPo_number() {
		return po_number;
	}
	public void setPo_number(int po_number) {
		this.po_number = po_number;
	}
	public String getPo_issue_date() {
		return po_issue_date;
	}
	public void setPo_issue_date(String po_issue_date) {
		this.po_issue_date = po_issue_date;
	}
	public String getTrans_resp() {
		return trans_resp;
	}
	public void setTrans_resp(String trans_resp) {
		this.trans_resp = trans_resp;
	}
	public String getDesinated_mode() {
		return desinated_mode;
	}
	public void setDesinated_mode(String desinated_mode) {
		this.desinated_mode = desinated_mode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public String getIncorterns() {
		return incorterns;
	}
	public void setIncorterns(String incorterns) {
		this.incorterns = incorterns;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public boolean isShip_together() {
		return ship_together;
	}
	public void setShip_together(boolean ship_together) {
		this.ship_together = ship_together;
	}
	public String getBillto() {
		return billto;
	}
	public void setBillto(String billto) {
		this.billto = billto;
	}
	public Origin getOrigin() {
		return origin;
	}
	public void setOrigin(Origin origin) {
		this.origin = origin;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	public PurchaseOrder(int id, int po_number, String po_issue_date, String trans_resp, String desinated_mode,
			String status, String due_date, String incorterns, String carrier, String priority, String seller,
			boolean ship_together, String billto, Origin origin, Destination destination) {
		super();
		this.id = id;
		this.po_number = po_number;
		this.po_issue_date = po_issue_date;
		this.trans_resp = trans_resp;
		this.desinated_mode = desinated_mode;
		this.status = status;
		this.due_date = due_date;
		this.incorterns = incorterns;
		this.carrier = carrier;
		this.priority = priority;
		this.seller = seller;
		this.ship_together = ship_together;
		this.billto = billto;
		this.origin = origin;
		this.destination = destination;
	}
	public PurchaseOrder()
	{
	}
	
	

	
}
