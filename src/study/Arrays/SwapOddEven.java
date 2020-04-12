package study.Arrays;

import java.util.Arrays;

/**
 * @author syw
 * @date 2020/4/12 - 22:46
 */

/**
 * 调整数组顺序使奇数位于偶数的前面
 * 输入一个整数数组，实现一个函数来调整数组中数字的顺序，使得所有奇数
 * 位于数组的前半部分，所有偶数位于数组的后半部分。
 */
public class SwapOddEven {

    /**
     * 快排思想,使用双指针双向遍历，交换奇偶
     * 时间复杂度；O(n)， 空间复杂度：O(1)
     * @param nums
     * @return
     */
    public static int[] exchange(int[] nums) {
        int i = 0,j = nums.length-1;
        while(i<j){
            while(nums[i]%2 == 1 && (i<j)) i++;
            while(nums[j]%2 == 0 && (i<j)) j--;

            if(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(exchange(nums)));
    }
}
