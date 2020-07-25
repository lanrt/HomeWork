package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("输入员工信息：name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....");
        String str = console.nextLine();
        String regex1 = "[;]";
        String[] s = str.split(regex1);
        Collection<Emp> col = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            col.add(add(s[i]));
        }
        show(col);
    }

    public static void show (Collection<Emp> col){
        Calendar calendar = Calendar.getInstance();
        for (Emp e :col) {
            System.out.println(e);
            calendar.setTime(e.getHiredate());
            calendar.add(Calendar.MONTH,3);
            calendar.set(Calendar.DAY_OF_WEEK,6);
            Date date = calendar.getTime();
            System.out.println("转正仪式日期为:" + simpleDateFormat.format(date));
        }
    }

    public static Emp add(String s) throws ParseException {
        String regex2 = "[,]";
        String[] ss = s.split(regex2);
        Emp emp = new Emp();
        emp.setName(ss[0]);
        emp.setAge(Integer.parseInt(ss[1]));
        emp.setGender(ss[2]);
        emp.setSalary(Integer.parseInt(ss[3]));
        emp.setHiredate(simpleDateFormat.parse(ss[4]));
        return emp;
    }
}
