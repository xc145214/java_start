package day18.generic;

/**
 * Created by 川 on 2015/6/2.
 */
public class GenericDemo5 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        InterImpl in = new InterImpl();
        in.show("abc");

        InterImpl2<Integer> in2 = new InterImpl2<Integer>();
        in2.show(5);
    }

}


//泛型接口，将泛型定义在接口上。
interface Inter<T> {
    void show(T t);
}


class InterImpl2<Q> implements Inter<Q> {
    public void show(Q q) {
        System.out.println("show :" + q);
    }
}


class InterImpl implements Inter<String> {
    public void show(String str) {
        System.out.println("show :" + str);
    }
}