package day06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有的员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入Map。其中key为该员工的名字，value为该员工的emp对象。
 * 然后，要求用户输入一个员工名字，若该员工存在，则输出该员工的名字，年龄，工资，以及入职20周年的纪念日当周的周六的日期。
 * 即:输入名字"张三"
 * 若该员工存在，则输出如下格式:
 * 张三,25,5000,2006-02-14
 * 入职20周年纪念日派对日期: 2026-02-14  （注:若入职日期为:2006-02-14）
 * 若该员工不存在，则输出:"查无此人"
 * @author Bonnie
 *
 */
public class Test12 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File(".");
        File[] files = file.listFiles(pathname -> pathname.toString().endsWith(".emp"));

        Map<String, Emp> maps = new HashMap<>();
        for (int i = 0; i < files.length; i++) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(files[i]));
            Emp emp = (Emp) (ois.readObject());
            maps.put(emp.getName(), emp);
            ois.close();
        }

        Scanner console = new Scanner(System.in);
        System.out.println("输入员工姓名：");
        String sname = console.next();

        if (maps.get(sname) != null){
            System.out.println(maps.get(sname));
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(maps.get(sname).getHiredate());
            calendar.add(Calendar.YEAR, 20);
            calendar.set(Calendar.DAY_OF_WEEK, 7);
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("入职20周年纪念日派对日期: " + s.format(calendar.getTime()));
        }else{
            System.out.println("查无此人");
        }
    }
}
