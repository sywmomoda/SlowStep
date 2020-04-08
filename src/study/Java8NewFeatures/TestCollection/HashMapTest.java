package study.Java8NewFeatures.TestCollection;

import java.util.HashMap;

/**
 * @author syw
 * @date 2020/4/3 - 19:25
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // get 一个不存在的 key 会抛出空指针异常
        //map.put("first",map.get("first")+1);

        // 使用 getOrDefault
        map.put("second",map.getOrDefault("second",0)+1);
        System.out.println(map.toString());

    }
}
