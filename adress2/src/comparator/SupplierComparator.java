package comparator;

import addresses.Po;
import manage.Results;

import java.util.Comparator;

/**
 * Created by Abhishek on 10-05-2017.
 */
public class SupplierComparator implements Comparator<Results> {
    @Override
    public int compare(Results o1, Results o2) {

        return o1.getSeller().compareToIgnoreCase(o2.getSeller());

    }
}