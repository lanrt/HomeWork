package day09;
/**
 * 使用线程方式一创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Test01Thread t1 = new Test01Thread("你好");
        Test01Thread t2 = new Test01Thread("再见");

        t1.start();
        t2.start();
    }
}
