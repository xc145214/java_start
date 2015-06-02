package day18.treemap;

import day18.bean.Student;
import day18.comparator.ComparatorByName;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by 川 on 2015/6/2.
 */
public class TreeMapDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {

        TreeMap<Student, String> tm = new TreeMap<Student, String>(new ComparatorByName());

        tm.put(new Student("lisi", 38), "北京");
        tm.put(new Student("zhaoliu", 24), "上海");
        tm.put(new Student("xiaoqiang", 31), "沈阳");
        tm.put(new Student("wangcai", 28), "大连");
        tm.put(new Student("zhaoliu", 24), "铁岭");


        Iterator<Map.Entry<Student, String>> it = tm.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Student, String> me = it.next();
            Student key = me.getKey();
            String value = me.getValue();

            System.out.println(key.getName() + ":" + key.getAge() + "---" + value);
        }

    }

}
