package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("输入文件名称");
        String s = console.next();
        String[] ss = s.split("\\.");
        File file = new File(s);
        if(!file.exists()){
            file.createNewFile();
        }else{
            System.out.println("已存在");
            for(int i = 1;;i++){
                String str = ss[0] + "_副本" + i + "." + ss[1];
                File file1 = new File(str);
                if(!file1.exists()){
                    file1.createNewFile();
                    break;
                }
            }
        }
    }
}
