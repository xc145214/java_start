package day18.generic;

/**
 * Created by 川 on 2015/6/2.
 */
public class GenericDefineDemo4 {


    /**
     * @param args
     */
    public static void main(String[] args) {


        Tool<String> tool = new Tool<String>();

        tool.show(new Integer(4));
        tool.show("abc");
        tool.print("hahah");
//		tool.print(new Integer(8));
        Tool.method("haha");
        Tool.method(new Integer(9));
    }


}
