package study.Arrays;

import java.util.Arrays;

/**
 * @author syw
 * @date 2020/4/16 - 11:35
 */

/**
 * 输入整数数组 arr，找出其中最小的 k 个数
 */
public class LeastNumbers {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(Arrays.toString(getLeastNumbers(nums,2)));
        System.out.println(Arrays.toString(getLeastNumbers2(nums,2)));
    }

    public static int[] getLeastNumbers(int[] arr,int k){
        int[] res = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static int[] getLeastNumbers2(int[] arr,int k){
        int left = 0,right = arr.length-1;
        return quickSearch(arr,left,right,k);
    }

    private static int[] quickSearch(int[] arr,int left,int right,int k){
        int res = partition(arr,left,right);
        if(res == k) return Arrays.copyOf(arr,k);
        if(res > k ) return quickSearch(arr,left,res-1,k);
        return quickSearch(arr,res+1,right,k);
    }

    private static int partition(int[] arr,int left,int right){
        if(left >= right) return left;

        int pivot = arr[left];
        int l = left, r = right;

        while(l<r){
            while(l<r && arr[l]<=pivot) l++;
            while(l<r && arr[r]>=pivot) r--;

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }

        arr[l] = pivot;
        arr[left] = arr[r];

        return r;
    }

}
