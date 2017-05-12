package comparator;

import addresses.Po;
import manage.Results;

import java.util.Comparator;

/**
 * Created by Abhishek on 10-05-2017.
 */
public class StatusComparator implements Comparator<Results> {
    @Override
    public int compare(Results o1, Results o2) {

        return o1.getStatus().compareToIgnoreCase(o2.getStatus());

    }
}