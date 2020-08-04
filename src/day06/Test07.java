package day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		System.out.println("输入文件名称");
		String s = console.next();
		copy1(s);
		copy2(s);
	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public static void copy1(String name) throws IOException {
		FileInputStream in = new FileInputStream(name);
		String[] ss = name.split("\\.");
		FileOutputStream out = new FileOutputStream(ss[0] + "_copy." + ss[1]);
		int i;
		while((i = in.read()) != -1){
			out.write(i);
		}
		in.close();
	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public static void copy2(String name){
		
	}
}
