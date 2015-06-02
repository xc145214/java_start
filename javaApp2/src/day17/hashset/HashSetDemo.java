package day17.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by 川 on 2015/6/2.
 */
public class HashSetDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add("hehe");
//		hs.add("heihei");
        hs.add("hahah");
        hs.add("xixii");
        hs.add("hehe");

        Iterator it = hs.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
