package study.Arrays;

import java.util.Arrays;

/**
 * @author syw
 * @date 2020/3/7 - 17:39
 */

public class findUnsortedSub {
    public static void main(String[] args) {
        //int[] nums = {2,6,4,8,10,9,15};
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(findUnsortedSubarray(nums));

       //System.out.println(Arrays.sort(nums).toString(nums));
        System.out.println(compareAfterSorting(nums));
    }

    /**
     * 依次从前向后和从后往前遍历，确认每个数的位置是否正确；
     * 找出前后两个位置错误的数，即为最小无序数组的起始与结束位置。
     * time complexity:O(n^2), space complexity:O(1);
     * @param nums
     * @return
     */
    public static int findUnsortedSubarray(int[] nums) {
        int left=0,right=0;
        boolean findleft = false,findright = false;
        for(int i=0;i<nums.length-1;i++){
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    left = i;
                    findleft = true;
                    break;
                }
            }
            if(findleft) break;
        }
        for(int i=nums.length-1;i>=1;i--){
            for (int j = i-1;j >=0; j--) {
                if(nums[i] < nums[j]){
                    right = i;
                    findright = true;
                    break;
                }
            }
            if(findright) break;
        }
        if(right == 0 && left == 0){
            return 0;
        }
        return right-left + 1;
    }

    /**
     * 先将数组进行排序，将排序好的数与原数组尽心比较，找出最左最右两个不匹配的元素
     * 即为要求的最短无序子数组的边界。
     * time complexity O(nlogn) , space complexity O(n)
     * @param nums
     * @return
     */
    public static int compareAfterSorting(int[] nums){
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        System.out.println(Arrays.toString(sortedNums));
        int left = nums.length,right = 0;
        for (int i = 0; i < nums.length; i++) {
            if(sortedNums[i] != nums[i]){
                left = Math.min(left,i);
                right = Math.max(right,i);
            }
        }

        return (right - left >= 0) ? right - left + 1 : 0;
    }
}
