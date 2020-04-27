package study.Arrays;

import java.util.HashMap;

/**
 * @author syw
 * @date 2020/4/27 - 14:03
 */

/**
 * 在排序数组中查找数字
 */
public class SerachInSorted {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(search(nums,8));
    }

    /**
     * HashMap m
     * merge 方法、getOrDefault 方法、Integer::sum
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i],1,Integer::sum);
        }
        return map.getOrDefault(target,0);
    }
}
