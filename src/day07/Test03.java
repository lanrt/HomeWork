package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("输入员工人数：");
        int num = console.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("s输入第" + (i + 1) + "个员工");
            String e = console.next();
            String[] split = e.split(",");
            Emp emp = new Emp();
            emp.setName(split[0]);
            emp.setAge(Integer.parseInt(split[1]));
            emp.setGender(split[2]);
            emp.setSalary(Integer.parseInt(split[3]));
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            emp.setHiredate(s.parse(split[4]));
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(split[0] + ".obj"));
            oos.writeObject(emp);
            oos.close();
        }
    }
}
