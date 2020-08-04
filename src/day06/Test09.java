package day06;

import java.io.*;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        Writer fos = new OutputStreamWriter(new FileOutputStream("note.txt"));
        Scanner console = new Scanner(System.in);
        System.out.println("输入(exit退出): ");
        String s = "";
        while(!s.equals("exit")){
            s = console.next();
            if(!s.equals("exit")) {
                fos.write(s);
            }
        }
        fos.close();
    }
}
