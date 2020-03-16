package study.Arrays;

import java.util.Arrays;

/**
 * @ClassName MissingNumber
 * @Description Given an array contains n distinct numbers taken from 0,1,2 ... n , find this one that is missing from this array
 * @Author shiyouwei
 * @Date 16:44 2019/12/5
 */
public class MissingNumber {

    /**
     * Add 0,1,2 ... and n, add a[0],a[1] ... a[n], then subtract these two value.
     * @param a
     * @return
     */
    public static int missingNumber(int[] a){
        int sum = 0 , ans = 0 , j = 0;
        sum = (a.length+1)*a.length/2;
        for (int i : a) {
            ans += i;
        }
        return sum - ans;
    }


    /**
     * Sort the array first.  time complexity:O(n*logn),space complexity:O(1)
     * @param a
     * @return
     */
    public static int missingNumber2(int[] a){
        Arrays.sort(a);
        if(a[0] != 0) {return 0;}
        if(a[a.length-1] != a.length) {return a.length;}
        for (int i = 1; i < a.length; i++) {
            if(a[i] != i) {return i;}
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8};
        System.out.println(missingNumber(array));
        System.out.println(missingNumber2(array));
    }
}
