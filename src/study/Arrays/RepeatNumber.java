package study.Arrays;

import java.util.HashSet;

/**
 * @author syw
 * @date 2020/4/10 - 23:06
 */
public class RepeatNumber {
    public static void main(String[] args) {
        int[] n = {0,1,2,3,4,11,6,7,8,9,10,11,12,13,14,15};
        System.out.println(findRepeatNumber(n));
        System.out.println(findRepeatNumber2(n));
    }

    public static int findRepeatNumber(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return 0;
    }

    /**
     * ??? set初始化为0 产生错误？？？
     * @param nums
     * @return
     */
    public static int findRepeatNumber2(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            return nums[i];
        }
        return 0;
    }
}
