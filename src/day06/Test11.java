package day06;

import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 * @author Bonnie
 *
 */
public class Test11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File(".");
        File[] files = file.listFiles(pathname -> pathname.toString().endsWith(".emp"));

        List<Emp> emps = new LinkedList<>();
        for (int i = 0; i < files.length; i++) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(files[i]));
            Emp emp = (Emp)(ois.readObject());
            emps.add(emp);
            ois.close();
        }
        emps.sort((o1, o2) -> o2.getAge() - o1.getAge());

        System.out.println(emps);
    }
}
