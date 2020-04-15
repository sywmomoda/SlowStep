package study.Arrays;

/**
 * @author syw
 * @date 2020/4/15 - 21:43
 */
public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray2(nums));
        System.out.println(maxSubArray3(nums));
    }

    /**
     * 暴力法。对每个元素，找出以这个元素为首元素的所有子数组。
     * 时间复杂度：O(n^2), 空间复杂度：O(1)
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums){
        int ThisSum = 0, MaxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            ThisSum = 0;
            for(int j=i;j<nums.length;j++){
                ThisSum += nums[j];
                MaxSum = Math.max(ThisSum,MaxSum);
            }
        }
        return MaxSum;
    }

    /**
     * 动态规划。声明一个 dp[n] 数组，dp[i]表示以元素nums[i]为结尾的连续子数组的最大和。
     * 从dp[i]连续递推到dp[i+1]，若dp[i]>0，则dp[i+1] = dp[i]+nums[i+1]，若dp[i]<0，
     * 则说明dp[i]对dp[i-1]为负贡献，即dp[i]=nums[i]。在dp数组中找出最大值即为所求。
     * 的数组的最大连续子数组
     * 时间复杂度：O(n)， 空间复杂度：O(n)
     * @param nums
     * @return
     */
    public static int maxSubArray2(int[] nums){
        int length = nums.length;
        int[] dp = new int[length];
        int sum = nums[0];
        dp[0] = nums[0];

        for (int i = 1; i < length; i++) {
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            sum = Math.max(dp[i],sum);
        }
        return sum;
    }

    /**
     * 优化的动态规划方法。由于dp[i]和dp[i-1]只与nums[i]有关，因此可以将原数组nums用作dp数组。
     * 这样可以将空间复杂度降为：O(1)
     */

    public static int maxSubArray3(int[] nums){
        int length = nums.length;
        int sum = nums[0];

        for (int i = 1; i < length; i++) {
            nums[i] = Math.max(nums[i],nums[i-1]+nums[i]);
            sum = Math.max(nums[i],sum);
        }
        return sum;
    }

}
