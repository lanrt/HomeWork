package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("输入三个日期(yyyy-MM-dd)");
        String str1 = console.next();
        String str2 = console.next();
        String str3 = console.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> c = new ArrayList<>();
        c.add(sdf.parse(str1));
        c.add(sdf.parse(str2));
        c.add(sdf.parse(str3));
        Collections.sort(c);
        System.out.println(c);

    }
}
