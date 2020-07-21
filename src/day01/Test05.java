package day01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		char[] code = getCode();
		String ch = String.copyValueOf(code);
		System.out.println("验证码: " + Arrays.toString(code));
		Scanner console = new Scanner(System.in);
		System.out.println("输入验证码: ");
		String s = console.next();
		verify(s, ch);
	}
	public static char[] getCode(){
		Random random = new Random();
		char[] ch = new char[5];
		for (int i = 0; i < ch.length; i++) {
			double a = Math.random() * 2;
			if(a < 1){
				ch[i] = (char)(random.nextInt(26) + 97);
			}else{
				ch[i] = (char)(random.nextInt(26) + 65);
			}
		}
		return ch;
	}
	public static void verify(String s1,String s2){
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("验证成功！");
		}else{
			System.out.println("验证失败！请重新验证！");
		}
	}
}
