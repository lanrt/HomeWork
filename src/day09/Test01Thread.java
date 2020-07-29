package day09;

public class Test01Thread extends Thread{
    public Test01Thread(String name) {
        super(name);
    }

    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
