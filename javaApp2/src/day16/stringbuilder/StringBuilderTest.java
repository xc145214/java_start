package day16.stringbuilder;

/**
 * Created by 川 on 2015/6/1.
 */
public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("hello");
        StringBuilder s2 = new StringBuilder("java");

        show(s1, s2);

        System.out.println(s1 + "......." + s2);

    }

    private static void show(StringBuilder s1, StringBuilder s2) {

        s1.append(s2);
        s1 = s2;
    }

}
