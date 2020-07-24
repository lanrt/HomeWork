package day04;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }

        ArrayList<Integer> al1 = test1(al);
        test2(al1);
        System.out.println(al);
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(i > 6) {
                it.remove();
            }
        }
        System.out.println(al);
    }

    private static void test2(ArrayList<Integer> al1) {
        for (int i = 0; i < al1.size(); i++) {
            al1.set(i,al1.get(i) * 10);
        }
        System.out.println(al1);
    }

    private static ArrayList<Integer> test1(ArrayList<Integer> al) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 3; i < 7; i++) {
            arrayList.add(al.get(i));
        }
        System.out.println(arrayList);
        return arrayList;
    }

}
