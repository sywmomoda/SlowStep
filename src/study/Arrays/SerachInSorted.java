package study.Arrays;

import java.util.HashMap;

/**
 * @author syw
 * @date 2020/4/27 - 14:03
 */

/**
 * 在排序数组中查找数字
 */
public class SerachInSorted {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,10};
        System.out.println(search(nums,8));
        System.out.println(search2(nums,8));
    }

    /**
     * HashMap
     * merge 方法、getOrDefault 方法、Integer::sum
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i],1,Integer::sum);
        }
        return map.getOrDefault(target,0);
    }

    /**
     * 二分查找。 两遍二分，分别找出左边界和右边界
     *
     */
    public static int search2(int[] nums,int target){
        int i=0,j=nums.length-1;
        int h =0;

        //当 i > j时跳出循环，即求出了边界开区间，估结果为 right - left - 1
        while(i<=j){
            h = (i+j)/2;
            if(nums[h] < target){
                i = h+1;
            }else if(nums[h] == target){
                i = h+1;
            }else if(nums[h] > target){
                j = h-1;
            }
        }
        int right = i;

        i=0;j=nums.length-1;
        while(i<=j){
            h = (i+j)/2;
            if(nums[h] < target){
                i = h+1;
            }else if(nums[h] == target){
                j = h-1;
            }else if(nums[h] > target){
                j = h-1;
            }
        }
        int left = j;

        return right - left - 1;
    }
}
