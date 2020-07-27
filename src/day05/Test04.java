package day05;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入该学生成绩: ");
        String str = s.nextLine();
        String[] split = str.split(";");
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(":");
            map.put(split1[0], Integer.parseInt(split1[1]));
        }
        System.out.println(map.get("物理"));
        map.put("化学",96);
        map.remove("英语");

        Set<String> strings = map.keySet();
        for (String s1 : strings) {
            Integer value = map.get(s1);
            System.out.println(s1 + "=" + value);
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry: entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        Collection<Integer> values = map.values();
        for (Integer i: values) {
            System.out.println(i);
        }
    }
}
