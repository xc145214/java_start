package day18.comparator;

import day18.bean.Person;

import java.util.Comparator;

/**
 * Created by 川 on 2015/6/2.
 */
public class ComparatorByName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        int temp = o1.getName().compareTo(o2.getName());
        return temp == 0 ? o1.getAge() - o2.getAge() : temp;
    }

}
