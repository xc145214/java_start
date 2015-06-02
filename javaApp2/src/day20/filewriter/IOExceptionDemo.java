package day20.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 川 on 2015/6/2.
 */
public class IOExceptionDemo {
    private static final String LINE_SEPARATOR = System
            .getProperty("line.separator");

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) {

        FileWriter fw = null;
        try {

            fw = new FileWriter("k:\\demo.txt");

            fw.write("abcde" + LINE_SEPARATOR + "hahaha");

        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if (fw != null)
                try {
                    fw.close();
                } catch (IOException e) {
                    // code....
                    throw new RuntimeException("关闭失败");
                }
        }

    }

}
