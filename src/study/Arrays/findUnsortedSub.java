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
    }

    /**
     * 定义两个变量，依次从前向后和从后往前遍历，确认每个数的位置是否正确；
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
}
