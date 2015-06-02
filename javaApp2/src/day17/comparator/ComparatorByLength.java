package day17.comparator;

import java.util.Comparator;

/**
 * Created by 川 on 2015/6/2.
 */
public class ComparatorByLength implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        String s1 = (String) o1;
        String s2 = (String) o2;

        int temp = s1.length() - s2.length();

        return temp == 0 ? s1.compareTo(s2) : temp;
    }

}
