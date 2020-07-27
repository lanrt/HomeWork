package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("输入员工信息：name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....");
        String str = console.nextLine();
        String regex1 = "[;]";
        String[] s = str.split(regex1);
        ArrayList<Emp> col = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            col.add(add(s[i]));
        }
        Collections.sort(col, new Comparator<Emp>(){
            @Override
            public int compare(Emp o1, Emp o2) {
                return o2.getHiredate().compareTo(o1.getHiredate());
            }
        });
        System.out.println(col);
    }

    public static Emp add(String s) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
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
