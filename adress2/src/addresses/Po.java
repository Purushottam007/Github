package addresses;

import javax.persistence.*;
import java.util.*;

/**
 * Created by PURUSHOTHAM on 05/05/2017.
 */
@Entity
public class Po {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer poNum;
    @Column
    private String status;
    @Column
    private String priority;
    @Column
    private Date issueDate;
    @Column
    private Date dueDate;
    @Column
    private String seller;
    @Column
    private String billTo;
    @Column
    private String transResp;
    @Column
    private String incoTerns;
    private String designateMode;
    @Column
    private String carier;
    @Column
    private boolean ship_together;

    @OneToMany(cascade = CascadeType.ALL)
    List<SourceAddress> originAddressList;

    @OneToMany(cascade = CascadeType.ALL)
    List<DestinationAddress> destinationAddressList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPoNum() {
        return poNum;
    }

    public void setPoNum(Integer poNum) {
        this.poNum = poNum;
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

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBillTo() {
        return billTo;
    }

    public void setBillTo(String billTo) {
        this.billTo = billTo;
    }

    public String getTransResp() {
        return transResp;
    }

    public void setTransResp(String transResp) {
        this.transResp = transResp;
    }

    public String getIncoTerns() {
        return incoTerns;
    }

    public void setIncoTerns(String incoTerns) {
        this.incoTerns = incoTerns;
    }

    public String getDesignateMode() {
        return designateMode;
    }

    public void setDesignateMode(String designateMode) {
        this.designateMode = designateMode;
    }

    public String getCarier() {
        return carier;
    }

    public void setCarier(String carier) {
        this.carier = carier;
    }

    public boolean isShip_together() {
        return ship_together;
    }

    public void setShip_together(boolean ship_together) {
        this.ship_together = ship_together;
    }

    public List<SourceAddress> getOriginAddressList() {
        return originAddressList;
    }

    public void setOriginAddressList(List<SourceAddress> originAddressList) {
        this.originAddressList = originAddressList;
    }

    public List<DestinationAddress> getDestinationAddressList() {
        return destinationAddressList;
    }

    public void setDestinationAddressList(List<DestinationAddress> destinationAddressList) {
        this.destinationAddressList = destinationAddressList;
    }

    @Override
    public String toString() {
        return "Po{" +
                "id=" + id +
                ", poNum=" + poNum +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate +
                ", seller='" + seller + '\'' +
                ", billTo='" + billTo + '\'' +
                ", transResp='" + transResp + '\'' +
                ", incoTerns='" + incoTerns + '\'' +
                ", designateMode='" + designateMode + '\'' +
                ", carier='" + carier + '\'' +
                ", ship_together=" + ship_together +
                ", originAddressList=" + originAddressList +
                ", destinationAddressList=" + destinationAddressList +
                '}';
    }
}
