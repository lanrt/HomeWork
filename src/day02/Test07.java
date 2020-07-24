package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("输入一个计算表达式：");
        String str = console.nextLine();
        String regex = "[+*/-]";
        String[] s = str.split(regex);
        Double sum1 = Double.parseDouble(s[0]);
        Double sum2 = Double.parseDouble(s[1]);
        char ch = str.charAt(s[0].length());
        Double r = result(ch,sum1,sum2);
        System.out.println(str + "=" + r);
    }

    public static Double result(char ch,Double sum1,Double sum2){
        if(ch == '+') {
            return sum1 + sum2;
        }else if(ch == '*'){
            return sum1 * sum2;
        }else if(ch == '-'){
            return sum1 - sum2;
        }else{
            return sum1 / sum2;
        }
    }
}
