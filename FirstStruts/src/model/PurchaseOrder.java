package model;

/**
 * Created by PURUSHOTHAM on 02/05/2017.
 */
public class PurchaseOrder {
    public int getPonumber() {
        return ponumber;
    }

    public void setPonumber(int ponumber) {
        this.ponumber = ponumber;
    }

    public String getPoissuedate() {
        return poissuedate;
    }

    public void setPoissuedate(String poissuedate) {
        this.poissuedate = poissuedate;
    }

    public String getTransresp() {
        return transresp;
    }

    public void setTransresp(String transresp) {
        this.transresp = transresp;
    }

    public String getDesinatedmode() {
        return desinatedmode;
    }

    public void setDesinatedmode(String desinatedmode) {
        this.desinatedmode = desinatedmode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
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

    public boolean isShiptogether() {
        return shiptogether;
    }

    public void setShiptogether(boolean shiptogether) {
        this.shiptogether = shiptogether;
    }

    public String getBillto() {
        return billto;
    }

    public void setBillto(String billto) {
        this.billto = billto;
    }

    private int ponumber;
    private String poissuedate;
    private String transresp;
    private String desinatedmode;
    private String status;
    private String duedate;
    private String incorterns;
    private String carrier;
    private String priority;
    private String seller;
    private boolean shiptogether;
    private String billto;
    private Origin origin;
    private Destination destination;

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
}
