package day14.string;

/**
 * Created by 川 on 2015/6/1.
 */
public class StringConstructorDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

		/*
         * 将字节数组或者字符数组转成字符串可以通过String类的构造函数完成。
		 */

        stringConstructorDemo2();
    }

    private static void stringConstructorDemo2() {
        char[] arr = {'w', 'a', 'p', 'q', 'x'};
        String s = new String(arr, 1, 3);

        System.out.println("s=" + s);
    }

    public static void stringConstructorDemo() {
        String s = new String();//等效于String s = "";  不等效String s = null;

        byte[] arr = {97, 66, 67, 68};

        String s1 = new String(arr);
        System.out.println("s1=" + s1);

    }

}
