package day17.arraylist;

import day17.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 川 on 2015/6/2.
 */
public class ArrayList1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Person p1 = new Person("lisi1", 21);

        ArrayList al = new ArrayList();
        al.add(p1);
        al.add(new Person("lisi2", 22));
        al.add(new Person("lisi3", 23));
        al.add(new Person("lisi4", 24));

        Iterator it = al.iterator();
        while (it.hasNext()) {
//			System.out.println(((Person) it.next()).getName()+"::"+((Person) it.next()).getAge());
            Person p = (Person) it.next();
            System.out.println(p.getName() + "--" + p.getAge());
        }
//		al.add(5);//al.add(new Integer(5));
    }

}
