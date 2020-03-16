package study.Arrays;

import java.util.Arrays;

/**
 * @ClassName arrayPairSum
 * @Description Given an array of 2n integers, your task is to group these integers into n pairs of integers ,
 *             say(a1,b1),(a2,b2)....(an,bn) which makes sum of min(ai,bi)for all i from 1 to n as large as possible.
 * @Author shiyouwei
 * @Date 9:45 2019/12/26
 */
public class arrayPairSum {

    /**
     * sort. Time complexity:O(n*log(n)) , Space complexity:O(1)
     * @param nums
     * @return
     */
    public static int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1,4,3,2};
        System.out.println(arrayPairSum(a));
    }
}
