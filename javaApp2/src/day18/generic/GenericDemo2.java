package day18.generic;


import day18.bean.Person;
import day18.comparator.ComparatorByName;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by 川 on 2015/6/2.
 */
public class GenericDemo2 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());
        ts.add(new Person("lisi8", 21));
        ts.add(new Person("lisi3", 23));
        ts.add(new Person("lisi", 21));
        ts.add(new Person("lis0", 20));

        Iterator<Person> it = ts.iterator();

        while (it.hasNext()) {
            Person p = it.next();
            System.out.println(p.getName() + ":" + p.getAge());
        }
    }

}
