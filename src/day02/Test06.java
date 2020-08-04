package day02;
/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        String regex = "[0-9]{3,4}-[0-9]{7,8}";
        String str = "0415-5561111";
        System.out.println(str.matches(regex));
    }
}
