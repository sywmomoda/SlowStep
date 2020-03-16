package study.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName YhTriangle
 * @Description 给定一个非负整数n，生成杨辉三角的前n行。
 * @Author shiyouwei
 * @Date 13:54 2019/11/26
 */
public class YhTriangle {
    public static List<List<Integer>> generate(int n){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(new ArrayList<>(Arrays.asList(1)));
        list.add(new ArrayList<>(Arrays.asList(1,1)));
        for (List<Integer> res : list) {
            System.out.println(res);
        }
        return list;
    }

    public static void main(String[] args) {
        generate(2);
    }
}
