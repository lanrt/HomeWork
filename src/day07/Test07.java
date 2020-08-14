package day07;

import java.io.*;
import java.util.Scanner;

/**
 * 要求用户输入一个文件，该文件应当是Test07程序生成的文件，然后将该文件中所有字符读取
 * 出来，并以UTF-8编码写入到另一个文件中，实现文件转码工作，该文件取名格式:原文件名_utf.txt。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("输入文件：");
        File file = new File(console.nextLine());
        OutputStreamWriter fos = new OutputStreamWriter(new FileOutputStream(file.toString().split("[.]")[0] + "_utf.txt"),"UTF-8");
        FileInputStream fis = new FileInputStream(file);
        int s = 0;
        while((s = fis.read()) != 0){
            fos.write(s);
        }
        fis.close();
        fos.close();
    }
}
