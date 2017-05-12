package comparator;

import addresses.DestinationAddress;
import manage.Results;

import java.util.Comparator;

/**
 * Created by Abhishek on 10-05-2017.
 */
public class ShipToComparator implements Comparator<Results> {
    @Override
    public int compare(Results o1, Results o2) {

        return o1.getShipTo().compareToIgnoreCase(o2.getShipTo());

    }
}