package comparator;

import addresses.Po;
import manage.Results;

import java.util.Comparator;

/**
 * Created by Abhishek on 10-05-2017.
 */
public class NumberComparator implements Comparator<Results>{
    @Override
    public int compare(Results o1, Results o2) {

        if(o1.getPoNum()==o2.getPoNum())
            return 0;
        else if(o1.getPoNum()>o2.getPoNum())
            return 1;
        else
            return -1;

    }
}
