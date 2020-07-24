package day04;

import java.util.ArrayList;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        Integer[] i = al.toArray(new Integer[5]);
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }

    }
}
