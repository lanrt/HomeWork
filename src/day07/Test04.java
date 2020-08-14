package day07;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * 读取当前项目根目录下所有后缀为.obj的文件，将这些Emp对象读取出来
 * 并存入到一个List集合中，然后按照员工工资从多到少的顺序依次输出员工信息
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File(".");
        File[] files = file.listFiles(pathname -> pathname.toString().endsWith(".obj"));

        List<Emp> emps = new LinkedList<>();
        for (int i = 0; i < files.length; i++) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(files[i]));
            Emp emp = (Emp)(ois.readObject());
            emps.add(emp);
            ois.close();
        }
        emps.sort((o1, o2) -> o2.getSalary() - o1.getSalary());

        System.out.println(emps);
    }

}
