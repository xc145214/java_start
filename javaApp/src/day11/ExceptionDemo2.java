package day11;


/*

*/
class Demo {
    public int method(int[] arr, int index) {

        if (arr == null)
            throw new NullPointerException("数组的引用不能为空！");

        if (index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("数组的角标越界啦，哥们，你是不是疯了？：" + index);
        }
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("数组的角标不能为负数，哥们，你是真疯了！：" + index);
        }
        return arr[index];
    }
}

class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[3];

        Demo d = new Demo();
        int num = d.method(null, -30);
        System.out.println("num=" + num);
        System.out.println("over");
    }

}
