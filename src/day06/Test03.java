package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("输入目录名称");
        String s = console.next();
        File file = new File(s);
        if(!file.exists()){
            file.mkdirs();
        }else{
            System.out.println("已存在");
            for(int i = 1;;i++){
                String str =  s + "_副本" + i;
                File file1 = new File(str);
                if(!file1.exists()){
                    file1.mkdirs();
                    break;
                }
            }
        }
    }
}
