package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Test02Thread run = new Test02Thread();
        Thread t1 = new Thread(run,"你好");
        Thread t2 = new Thread(run,"再见");

        t1.start();
        t2.start();
    }
}
