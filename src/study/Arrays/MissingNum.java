package study.Arrays;

/**
 * @author syw
 * @date 2020/4/14 - 21:48
 */


/**
 * 0~n-1 中缺失的数字：
 * 一个长度为 n-1 的递增排序数组中的所有数字都是唯一的，并且每个数字都在
 * 范围 0~n-1 之内。在范围 0~n-1 内的 n 个数字中有且只有一个数字不在该
 * 数组中，请找出这个数字。
 */
public class MissingNum {
    public static void main(String[] args) {
        int[] n = {0,1,3};
        System.out.println(missingNumber(n));
        System.out.println(missingNumber2(n));
        System.out.println(missingNumber3(n));
    }

    /**
     * 差值法。0~n-1 等差数列求和，与 nums[] 总和求插值即可
     * @param nums
     * @return
     */
    public static int missingNumber(int[] nums){
        int length = nums.length;
        int n = length + 1;
        int ans = n*length/2;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += nums[i];
        }
        return ans - sum;

    }

    /**
     * 遍历异或法。遍历数组元素与其下标值异或比较，第一个不同的元素即为所求
     * @param nums
     * @return
     */
    public static int missingNumber2(int[] nums){
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i] ^ i) != 0){
                return i;
            }
        }
        return length;
    }

    /**
     * 二分查找。若下标 mid 与 nums[mid] 相等，则说明缺失的在右边，反之则在左边。
     * @param nums
     * @return
     */
    public static int missingNumber3(int[] nums){
        int left = 0 , right = nums.length-1;
        int mid = 0;
        while(left<right) {
            mid = (left + right) / 2;
            if (mid == nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
