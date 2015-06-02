package day19.comparator;

import java.util.Comparator;

/**
 * Created by 川 on 2015/6/2.
 */
public class ComparatorByLength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {

        int temp = o1.length() - o2.length();

        return temp == 0 ? o1.compareTo(o2) : temp;
    }

}
