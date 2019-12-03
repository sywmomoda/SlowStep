package study.Arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName twoSum
 * @Decription two sum in Ordered Array
 * @Author shiyouwei
 * @Date 13:57 2019/11/29
 */
public class twoSum {
    /**
     * @Description double cycle. time complexity:O(n^2)
     * @param a,target
     * @return new int[] {index1+1,index2+1}
     */
    public static int[] twoSum(int[] a,int target){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]+a[j] == target) {
                    return new int[] {i+1,j+1};
                }
            }
        }
        return null;
    }

    /**
     * @Description hashMap. time complexity:O(n),space complexity:O(n)
     * @param a,target
     * @return new int[] {index1+1,index2+1}
     * @Date 14:45 2019/11/29
     * @Author shiyouwei
     */
    public static int[] twoSum1(int[] a, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length-1; i++) {
            if(map.containsKey(target - a[i])){
                return new int[] {map.get(target - a[i])+1,i+1};
            }
            map.put(a[i],i);
        }
        return null;
    }

    /**
     * @Description Two Pointers. time complexity:O(n),space complexity:O(1)
     * @param a,target
     * @return new int[] {index1+1,index2+1}
     * @Date 14:50 2019/11/29
     * @Author shiyouwei
     */
    public static int[] twoSum2(int[] a,int target){
        int i=0,j=a.length-1;
        while(i<j){
            if(a[i]+a[j] == target){
                return new int[] {i+1,j+1};
            }
            else if(a[i]+a[j] < target){
                i++;
            }
            else{
                j--;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] a = new int[1000];
        for (int i = 0; i < 1000; i++) {
            a[i] = (int)(Math.random()*1000);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
//        int[] a ={2,2,11,15};
        long s1 = System.currentTimeMillis();
        System.out.println(Arrays.toString(twoSum(a,1088)));
        long s2 = System.currentTimeMillis();
        System.out.println(s2-s1);

        long s3 = System.currentTimeMillis();
        System.out.println(Arrays.toString(twoSum1(a,1088)));
        long s4 = System.currentTimeMillis();
        System.out.println(s4-s3);

        long s5 = System.currentTimeMillis();
        System.out.println(Arrays.toString(twoSum2(a,1088)));
        long s6 = System.currentTimeMillis();
        System.out.println(s6-s5);
    }
}
