package study.Arrays;

import java.util.Arrays;

/**
 * @author syw
 * @date 2020/3/13 - 18:25
 * @Decription Given an integer array,find there numbers whose product is maximum
 *             and output this product.
 */

public class thereNumbers {

    /**
     * 将数组进行排序，若所有元素都是非负数，那么最后三个数的乘积即为所求。若含有两个以上的负数，
     * 那么只需要将第一、第二和最后一个数的乘积与最后三个数的乘积相比，取两者中较大值即可。
     * 不需要考虑正数、0、负数的个数问题，因为上述两种结果已经包含了所有情况。
     * time complexity:O(N*logN),  space complexity:O(N*logN)
     *
     * @param nums
     * @return
     */
    public static int sortFirst(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[length - 1], nums[length - 1] * nums[length - 2] * nums[length - 3]);
    }

    /**
     * 上述方法中，实际上只需要找到最大的三个数和最小的两个数，因此可以不用排序，遍历一次即可。
     * time complexity:O(n) , space complexity:O(1)
     * @param nums
     * @return
     */
    public static int findNumbersByScan(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {
                min2 = n;
            }

            if (n >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {
                max3 = n;
            }
        }

        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = (int) (Math.random()*10-5);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println(sortFirst(array));
        System.out.println(findNumbersByScan(array));
    }
}