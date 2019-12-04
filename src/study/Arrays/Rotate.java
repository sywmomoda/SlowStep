package study.Arrays;

import java.util.Arrays;

/**
 * @ClassName Rotate
 * @Decription Give an array,rotate the array to the right by k steps,where k is non-negative
 * @Author shiyouwei
 * @Date 14:53 2019/12/3
 */
public class Rotate {

    /**
     * @Description violent solution , rotate [k] times; time complexity:O(n*k),space complexity:o(1)
     * @param a [],k
     * @return a[]
     * @Date 9:17 2019/12/4
     * @Author shiyouwei
     */
    public static int[] rotate(int[] a,int k){
        for (int i = 0; i < k; i++) {
            int pre = a[a.length-1];
            for (int j = 0; j < a.length; j++) {
                int temp = a[j];
                a[j] = pre;
                pre = temp;
            }
        }
        return a;
    }

    /**
     * @Description use a new array,time complexity:O(n),space complexity:O(n)
     * @param a [],k
     * @return a[]
     * @Date 15:06 2019/12/4
     * @Author shiyouwei
     */
    public static int[] rotateByNewArray(int[] a,int k){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(i+k)%a.length] = a[i];
        }
        return b;
    }

    /**
     * @Description Reverse all elements, then reserve the first k elements , at last reserve the last n-k elements.
     *              time complexity:O(n), space complexity:O(1).
     * @param a [],k
     * @return a[]
     * @Date 15:46 2019/12/4
     * @Author shiyouwei
     */
    public static int[] rotateByReverse(int[] a,int k){
        k %= a.length;
        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        return a;
    }

    public static void reverse(int[] a,int start,int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {1,2,3,4,5,6};
        int[] a3 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(rotate(a1,3)));
        System.out.println(Arrays.toString(rotateByNewArray(a2,3)));
        System.out.println(Arrays.toString(rotateByReverse(a3,3)));
    }
}
