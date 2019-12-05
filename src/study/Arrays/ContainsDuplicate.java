package study.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @ClassName ContainsDuplicate
 * @Decription Given an array of integers,find if the array contains any duplicates.
 *             Return true if any values appears at least twice in the array, else return false.
 * @Author shiyouwei
 * @Date 9:05 2019/12/5
 */
public class ContainsDuplicate {

    /**
     * @Description HashMap. time complexity:O(n) , space complexity:O(n)
     * @param a []
     * @return boolean
     * @Date 9:25 2019/12/5
     * @Author shiyouwei
     */
    public static boolean containsDuplicate(int[] a){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])){return true;}
            map.put(a[i],i);
        }
        return false;
    }

    /**
     * @Description Sort the array,then find if it contains any consequent duplicates.
     *              time complexity:O(n*log(n)), space complexity:O(1)
     * @param a []
     * @return boolean
     * @Date 9:42 2019/12/5
     * @Author shiyouwei
     */
    public static boolean bySortFirst(int[] a){
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] == a[i+1]) {return true;}
        }
        return false;
    }

    public static boolean byHashSet(int[] a){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if(set.contains(a[i])) {return true;}
            set.add(a[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
//        int[] array = new int[10];
//        for (int i = 0; i < 10; i++) {
//            array[i] = (int)(Math.random()*10);
//        }
        System.out.println(Arrays.toString(array));
        System.out.println(containsDuplicate(array));
        System.out.println(bySortFirst(array));
        System.out.println(byHashSet(array));
    }
}
