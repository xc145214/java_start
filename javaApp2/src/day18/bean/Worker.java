package day18.bean;

/**
 * Created by 川 on 2015/6/2.
 */
public class Worker extends Person {
    public Worker() {
        super();

    }

    public Worker(String name, int age) {
        super(name, age);

    }

    @Override
    public String toString() {

        return "Worker:" + getName() + ":" + getAge();
    }


}
