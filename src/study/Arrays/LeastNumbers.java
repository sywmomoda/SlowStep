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
        int[] nums = {0,1,2,1};
        System.out.println(Arrays.toString(getLeastNumbers(nums,1)));
        System.out.println(Arrays.toString(getLeastNumbers2(nums,1)));
    }

    /**
     * 直接排序，从前往后取出k个数
     * 排序所需时间复杂度：O(n log n)，排序所需额外空间复杂度：O(log n)
     * @param arr
     * @param k
     * @return
     */
    public static int[] getLeastNumbers(int[] arr,int k){
        int[] res = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    /**
     * 快速选择。不断划分，直至左半边元素个数等于 k
     * 时间复杂度：期望为 O(n)，最坏为 O(n^2)；空间复杂度：期望为 O(log n)，
     * 递归调用的期望深度为 O(log n)，每层需要的空间为 O(1)，只有常数个变量。
     * 最坏情况下的空间复杂度为：O(n)，即划分n次，递归调用 n-1 层。
     * @param arr
     * @param k
     * @return
     */
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
            while(l<r && arr[r]>=pivot) r--;
            while(l<r && arr[l]<=pivot) l++;

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }

        arr[left] = arr[r];
        arr[r] = pivot;

        return r;
    }

}
