package model;

/**
 * Created by PURUSHOTHAM on 02/05/2017.
 */
public class Destination {
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

    private String shipto;
    private String destinationstreat;
    private String  destinationcity;
    private String  destinationstate;
    private String  destinationcountry;
    private String deliverystart;
    private String deliveryend;

}
