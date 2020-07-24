package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("输入员工数量");
        int num = console.nextInt();
        Emp[] emps = new Emp[num];
        String[] s = new String[num];
        System.out.println("输入员工信息:(name,age,gender,salary,hiredate)");
        String regex = "[,]";
        x:for (int i = 0; i < num; i++) {
            s[i] = console.next();
            String[] ss = s[i].split(regex);
            if(i >= 1) {
                for (int j = 0; j < i; j++) {
                    if (emps[j].getName().equals(ss[0])) {
                        System.out.println("已存在!");
                        i --;
                        continue x;
                    }
                }
            }
            emps[i] = new Emp();
            add(emps[i],ss);
        }
        System.out.println(Arrays.toString(emps));
    }

    public static void add(Emp emp, String[] ss) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        emp.setName(ss[0]);
        emp.setAge(Integer.parseInt(ss[1]));
        emp.setGender(ss[2]);
        emp.setSalary(Integer.parseInt(ss[3]));
        emp.setHiredate(simpleDateFormat.parse(ss[4]));
    }
}
