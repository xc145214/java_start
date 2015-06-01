package day03;

/**
 * Created by 川 on 2015/5/31.
 */
public class Test {
    public static void main(String[] args) {
        /*
        3000米长的绳子，每天减一半，问，需要多少天，绳子会小于5米？
		思路：
		1,绳子长度在变化，定义变量记录绳子长度的变化，而且这个变量的初始化值时3000.
		  既然不考虑小数部分，所以可以定义int类型变量
		2,多少天,不确定,是一个变量.
		3,每天减一半，这时对绳子长度的运算，只要可以减一半，就算一天。
			这就让我想到了一个小思想，就是传说中的计数器思想。
		4,天数的递增，减一半的动作在重复的执行，使用循环结构。
		5,直到小于5米，重复动作结束。这就是循环的条件。

		*/

        int day = 0;

        for (int x = 3000; x >= 5; x = x / 2) {
            day++;

        }

        System.out.println("day=" + day);


        System.out.println("Hello World!");


        //将这个运算过程画出来。 你从这个代码运算规律中发现了什么？总结了什么思想？


        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
