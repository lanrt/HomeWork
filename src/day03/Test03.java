package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("输入生日，格式为 yyyy-MM-dd :");
        String str = console.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(str);
        long time1 = date.getTime();
        long time2 = (new Date()).getTime();
        long time = (time2 - time1) / (1000l * 60 * 60 * 24 * 7);
        System.out.println(time);
    }
}
