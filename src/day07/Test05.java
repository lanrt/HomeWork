package day07;

import java.io.*;

/**
 * 使用字符流复制当前程序的源文件到当前项目根目录下。
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("")));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("Test05.java")),true);
        String s = "";
        while((s = br.readLine()) != null){
            pw.println(s);
        }
        br.close();
        pw.close();
    }
}
