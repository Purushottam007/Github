package action;

import org.apache.struts.action.ActionForm;

/**
 * Created by PURUSHOTHAM on 02/05/2017.
 */
public class RegisterForm extends ActionForm {
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

    private String shipfrom;
    private String originstreet;
    private String origincity;
    private String originstate;
    private String origincountry;
    private String pickupstart;
    private String pickupend;

    private String shipto;
    private String destinationstreat;
    private String  destinationcity;
    private String  destinationstate;
    private String  destinationcountry;
    private String deliverystart;
    private String deliveryend;

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

    public String getShipfrom() {
        return shipfrom;
    }

    public void setShipfrom(String shipfrom) {
        this.shipfrom = shipfrom;
    }

    public String getOriginstreet() {
        return originstreet;
    }

    public void setOriginstreet(String originstreet) {
        this.originstreet = originstreet;
    }

    public String getOrigincity() {
        return origincity;
    }

    public void setOrigincity(String origincity) {
        this.origincity = origincity;
    }

    public String getOriginstate() {
        return originstate;
    }

    public void setOriginstate(String originstate) {
        this.originstate = originstate;
    }

    public String getOrigincountry() {
        return origincountry;
    }

    public void setOrigincountry(String origincountry) {
        this.origincountry = origincountry;
    }

    public String getPickupstart() {
        return pickupstart;
    }

    public void setPickupstart(String pickupstart) {
        this.pickupstart = pickupstart;
    }

    public String getPickupend() {
        return pickupend;
    }

    public void setPickupend(String pickupend) {
        this.pickupend = pickupend;
    }

    public String getShipto() {
        return shipto;
    }

    public void setShipto(String shipto) {
        this.shipto = shipto;
    }

    public String getDestinationstreat() {
        return destinationstreat;
    }

    public void setDestinationstreat(String destinationstreat) {
        this.destinationstreat = destinationstreat;
    }

    public String getDestinationcity() {
        return destinationcity;
    }

    public void setDestinationcity(String destinationcity) {
        this.destinationcity = destinationcity;
    }

    public String getDestinationstate() {
        return destinationstate;
    }

    public void setDestinationstate(String destinationstate) {
        this.destinationstate = destinationstate;
    }

    public String getDestinationcountry() {
        return destinationcountry;
    }

    public void setDestinationcountry(String destinationcountry) {
        this.destinationcountry = destinationcountry;
    }

    public String getDeliverystart() {
        return deliverystart;
    }

    public void setDeliverystart(String deliverystart) {
        this.deliverystart = deliverystart;
    }

    public String getDeliveryend() {
        return deliveryend;
    }

    public void setDeliveryend(String deliveryend) {
        this.deliveryend = deliveryend;
    }

    @Override
    public String toString() {
        return "RegisterForm{" +
                "ponumber=" + ponumber +
                ", poissuedate='" + poissuedate + '\'' +
                ", transresp='" + transresp + '\'' +
                ", desinatedmode='" + desinatedmode + '\'' +
                ", status='" + status + '\'' +
                ", duedate='" + duedate + '\'' +
                ", incorterns='" + incorterns + '\'' +
                ", carrier='" + carrier + '\'' +
                ", priority='" + priority + '\'' +
                ", seller='" + seller + '\'' +
                ", shiptogether=" + shiptogether +
                ", billto='" + billto + '\'' +
                ", shipfrom='" + shipfrom + '\'' +
                ", originstreet='" + originstreet + '\'' +
                ", origincity='" + origincity + '\'' +
                ", originstate='" + originstate + '\'' +
                ", origincountry='" + origincountry + '\'' +
                ", pickupstart='" + pickupstart + '\'' +
                ", pickupend='" + pickupend + '\'' +
                ", shipto='" + shipto + '\'' +
                ", destinationstreat='" + destinationstreat + '\'' +
                ", destinationcity='" + destinationcity + '\'' +
                ", destinationstate='" + destinationstate + '\'' +
                ", destinationcountry='" + destinationcountry + '\'' +
                ", deliverystart='" + deliverystart + '\'' +
                ", deliveryend='" + deliveryend + '\'' +
                '}';
    }
}
