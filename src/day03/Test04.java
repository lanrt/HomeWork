package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("输入生产日期格式:yyyy-MM-dd");
        String str = console.next();
        System.out.println("输入保质期的天数:");
        int day = console.nextInt();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,day);
        calendar.add(Calendar.WEEK_OF_YEAR,-2);
        calendar.set(Calendar.DAY_OF_WEEK,4);
        Date date1 = calendar.getTime();
        System.out.println("促销日期为:" + simpleDateFormat.format(date1));
    }
}
