package day07;

import java.io.*;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("myfile_cp.txt");
        InputStream is = new FileInputStream("myfile.txt");
        int i;
        while((i = is.read()) != -1){
            os.write(i);
        }
        os.close();
        is.close();
    }
}
