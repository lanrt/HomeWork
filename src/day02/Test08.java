package day02;

import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("输入若干员工信息，格式为:name,age,gender,salary;name,age,gender,salary;....");
        String str = console.nextLine();
        String regex1 = "[;]";
        String regex2 = "[,]";
        String[] s = str.split(regex1);
        String[][] ss = new String[s.length][4];
        for (int i = 0; i < ss.length; i++) {
            String[] s1 = s[i].split(regex2);
            for (int j = 0; j < ss[i].length; j++) {
                ss[i][j] = s1[j];
            }
        }
        Person[] people = new Person[s.length];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
            people[i].setName(ss[i][0]);
            people[i].setAge(Integer.parseInt(ss[i][1]));
            people[i].setGender(ss[i][2]);
            people[i].setSalary(Integer.parseInt(ss[i][3]));
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
