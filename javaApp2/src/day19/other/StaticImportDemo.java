package day19.other;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;
import static java.util.Collections.max;
import static java.util.Collections.sort;
//import static java.util.Collections.max;//静态导入，其实到入的是类中的静态成员。

/**
 * Created by 川 on 2015/6/2.
 */
public class StaticImportDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("abc3");
        list.add("abc7");
        list.add("abc1");

        out.println(list);

        sort(list);

        System.out.println(list);


        String max = max(list);
        System.out.println("max=" + max);

    }

}
