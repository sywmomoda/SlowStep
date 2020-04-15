package study.AboutHash;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author syw
 * @date 2020/4/15 - 15:25
 */
public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "abbcdea";
        System.out.println(firstUniqChar(s));
        System.out.println(firstUniqChar2(s));
    }

    /**
     * HashMap，key为字符元素，value 为 Boolean 类型，遍历数组将字符存入 HashMap，
     * 若字符不是第一次出现，则将 value 置为 false；再遍历一次查找出首次出现的唯一元素。
     * @param s
     * @return
     */
    public static char firstUniqChar(String s){
        HashMap<Character, Boolean> map = new HashMap<>();
        char[] sc = s.toCharArray();

        for(char c : sc){
            map.put(c,!map.containsKey(c));
        }

        for(char c : sc){
            if(map.get(c)) return c;
        }

        return ' ';
    }

    /**
     * 使用 LinkedHashMap，能够保证有序，可以优化第二次遍历。
     * LinkedHashMap 按照插入顺序进行排序，即第二次遍历时可以
     * 遍历 map 而不用遍历原数组。
     */
    public static char firstUniqChar2(String s){
        LinkedHashMap<Character, Boolean> map = new LinkedHashMap<>();
        char[] sc = s.toCharArray();

        for(char c : sc){
            map.put(c,!map.containsKey(c));
        }

        for(Map.Entry<Character,Boolean> m : map.entrySet()){
            if(m.getValue()) return m.getKey();
        }
        return ' ';
    }
}
