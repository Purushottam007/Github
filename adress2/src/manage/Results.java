package manage;

import java.util.Date;

/**
 * Created by PURUSHOTHAM on 12/05/2017.
 */
public class Results {
    private int poNum;
    private String seller;
    private Date dueDate;
    private String status;
    private String priority;
    private String shipFrom;
    private String shipTo;
    private String transResp;

    public int getPoNum() {
        return poNum;
    }

    public void setPoNum(int poNum) {
        this.poNum = poNum;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getShipFrom() {
        return shipFrom;
    }

    public void setShipFrom(String shipFrom) {
        this.shipFrom = shipFrom;
    }

    public String getShipTo() {
        return shipTo;
    }

    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }

    public String getTransResp() {
        return transResp;
    }

    public void setTransResp(String transResp) {
        this.transResp = transResp;
    }

    @Override
    public String toString() {
        return "Results{" +
                "poNum=" + poNum +
                ", seller='" + seller + '\'' +
                ", dueDate=" + dueDate +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                ", shipFrom='" + shipFrom + '\'' +
                ", shipTo='" + shipTo + '\'' +
                ", transResp='" + transResp + '\'' +
                '}';
    }
}
