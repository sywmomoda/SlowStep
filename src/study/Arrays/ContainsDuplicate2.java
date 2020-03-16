package study.Arrays;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @ClassName ContainsDuplicate2
 * @Description Find if the array contains any duplicates(array[i] == array[j]) and  |i-j| <= k.
 * @Author shiyouwei
 * @Date 9:54 2019/12/5
 */



public class ContainsDuplicate2 {

    /**
     * @Description Use HashSet of size k. time complexity:O(n) ,space complexity:O(n)
     * @param a ,k
     * @return boolean
     * @Date 15:47 2019/12/5
     * @Author shiyouwei
     */
    public static boolean containsDuplicate(int[] a,int k){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if(set.contains(a[i])){return true;}
            set.add(a[i]);
            if(set.size() > k) {
                set.remove(a[i-k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
        }
//        int[] array = {1,2,3,4,5,6,7,8,9,1};
        System.out.println(Arrays.toString(array));
        System.out.println(containsDuplicate(array,3));
    }
}
