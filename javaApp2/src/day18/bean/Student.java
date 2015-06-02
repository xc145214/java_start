package day18.bean;

/**
 * Created by 川 on 2015/6/2.
 */
public class Student extends Person {

    public Student() {
        super();

    }

    public Student(String name, int age) {
        super(name, age);

    }

    @Override
    public String toString() {

        return "Student:" + getName() + ":" + getAge();
    }


}
