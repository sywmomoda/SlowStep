package study.Stack;

import java.util.Arrays;

/**
 * @author syw
 * @date 2020/4/19 - 23:33
 */

/**
 * 暴力法。-.- 不可取
 */
public class MaxInSlidingWin {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0) return new int[0];
        int[] res = new int[nums.length - k +1];
        for(int i=0;i<res.length;i++){
            res[i] = nums[i];
            for(int j=i;j<i+k;j++){
                res[i] = Math.max(res[i],nums[j]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] n = {1,3,-1,-3,5,3,6,7};
        Arrays.toString(maxSlidingWindow(n,3));
    }

    /**
     * 单调队列
     */
}
