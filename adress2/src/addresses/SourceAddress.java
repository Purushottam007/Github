package addresses;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by PURUSHOTHAM on 06/05/2017.
 */
@Entity
@Table(name = "source_address")
@PrimaryKeyJoinColumn(name = "ID")
public class SourceAddress extends POAddress{
    @Column
    private String shipFrom;
    @Column
    private Date pickupStart;
    @Column
    private Date PickupEnd;

    public String getShipFrom() {
        return shipFrom;
    }

    public void setShipFrom(String shipFrom) {
        this.shipFrom = shipFrom;
    }

    public Date getPickupStart() {
        return pickupStart;
    }

    public void setPickupStart(Date pickupStart) {
        this.pickupStart = pickupStart;
    }

    public Date getPickupEnd() {
        return PickupEnd;
    }

    public void setPickupEnd(Date pickupEnd) {
        PickupEnd = pickupEnd;
    }

    @Override
    public String toString() {
        return "SourceAddress{" +
                "shipFrom='" + shipFrom + '\'' +
                ", pickupStart=" + pickupStart +
                ", PickupEnd=" + PickupEnd +
                '}';
    }
}
