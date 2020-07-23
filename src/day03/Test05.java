package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("输入身份证号:");
        String str1 = console.next();
        String regex = "[0-9]{18}";
        String str2 = str1.substring(6,14);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyyMMdd");
        Date date = simpleDateFormat1.parse(str2);
        System.out.println("出生日期:" + simpleDateFormat.format(date));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR,20);
        date = calendar.getTime();
        System.out.println("20岁生日:" + simpleDateFormat.format(date));
        calendar.set(Calendar.DAY_OF_WEEK,4);
        date = calendar.getTime();
        System.out.println("当周的周三为:" + simpleDateFormat.format(date));
    }
}
