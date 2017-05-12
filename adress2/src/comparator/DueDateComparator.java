package comparator;

import addresses.Po;
import manage.Results;

import java.util.Comparator;

/**
 * Created by Abhishek on 10-05-2017.
 */
public class DueDateComparator implements Comparator<Results> {
    @Override
    public int compare(Results o1, Results o2) {

        return o1.getDueDate().compareTo(o2.getDueDate());

    }
}