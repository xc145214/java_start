package day16.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 川 on 2015/6/1.
 */
public class ListDemo1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        show(list);
    }

    public static void show(List list) {

        //添加元素
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        System.out.println(list);

        //插入元素。
//		list.add(1,"abc9");

        //删除元素。
//		System.out.println("remove:"+list.remove(2));

        //修改元素。
//		System.out.println("set:"+list.set(1, "abc8"));

        //获取元素。
//		System.out.println("get:"+list.get(0));

        //获取子列表。
//		System.out.println("sublist:"+list.subList(1, 2));


        System.out.println(list);


    }


}
