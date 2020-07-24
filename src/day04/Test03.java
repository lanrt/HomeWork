package day04;

import java.util.LinkedList;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        LinkedList<String> lin = new LinkedList<>();
        lin.add("one");
        lin.add("two");
        lin.add("three");
        lin.add("four");

        test1(lin);
        test2(lin);
        test3(lin);
        test4(lin);
    }

    public static void test1(LinkedList<String> lin){
        String str = lin.get(1);
        System.out.println(str);
    }

    private static LinkedList<String> test2(LinkedList<String> lin) {
        lin.set(2,"3");
        System.out.println(lin);
        return lin;
    }

    private static LinkedList<String> test3(LinkedList<String> lin) {
        lin.add(1,"2");
        System.out.println(lin);
        return lin;
    }

    private static LinkedList<String> test4(LinkedList<String> lin) {
        lin.remove(2);
        System.out.println(lin);
        return lin;
    }
}
