package study.Arrays;

import java.util.HashSet;

/**
 * @author syw
 * @date 2020/4/10 - 23:06
 */

/**
 * 数组中重复的数字：
 * 在一个长度为 n 的数组nums 里的所有数字都在0~n-1的范围内。
 * 数组中某些数字是重复的，但不知道重复有几个数字重复了，
 * 也不知道重复了几次。请找出数组中任意一个重复的数字。
 */
public class RepeatNumber {
    public static void main(String[] args) {
        int[] n = {0,1,2,3,4,11,6,7,8,9,10,11,12,13,14,15};
        System.out.println(findRepeatNumber(n));
    }

    /**
     * 遍历一次，使用 HashSet ，时间复杂度 O(n)，空间复杂度：O(n)
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int ans = -1;
        for(int num:nums){
            if(!set.add(num)){
                ans = nums[num];
                break;
            }
        }
        return ans;
    }

}
