package model;

/**
 * Created by PURUSHOTHAM on 02/05/2017.
 */
public class Origin {
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

    private String shipfrom;
    private String originstreet;
    private String origincity;
    private String originstate;
    private String origincountry;
    private String pickupstart;
    private String pickupend;

}
