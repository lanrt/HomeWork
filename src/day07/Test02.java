package day07;

import java.io.*;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myfile_cp2.txt"));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myfile.txt"));

        int i;
        while((i = bis.read()) != -1){
            bos.write(i);
        }
        bos.close();
        bis.close();
    }
}
