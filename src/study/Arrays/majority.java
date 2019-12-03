package study.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName majority
 * @Decription find the majority element in an array of size n ,
 *             the majority element is the element that appears more than [n/2] times
 * @Author shiyouwei
 * @Date 9:08 2019/12/3
 */
public class majority {

    /**
     * @Description hashMap, time complexity:O(n), space complexity: O(n)
     * @param a
     * @return map
     * @Date 11:35 2019/12/3
     * @Author shiyouwei
     */
    public static HashMap<Integer,Integer> countNums(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(!map.containsKey(a[i])){
                map.put(a[i],1);
            }else{
                int count = map.get(a[i]);
                map.put(a[i],++count);
            }
        }
        return map;
    }

    /**
     * @Description after sorting, get a[n/2] ,time complexity: n*log(n), space complexity O(1)
     * @param a
     * @return a[n/2]
     * @Date 11:47 2019/12/3
     * @Author shiyouwei
     */
    public static int marjorityelement(int[] a){
        Arrays.sort(a);
        return a[a.length/2];
    }


    /**
     * @Description boyer-moore , time complexity:O(n),space complexity:O(1)
     * @param a
     * @return res
     * @Date 14:01 2019/12/3
     * @Author shiyouwei
     */
    public static int morre(int[] a){
        int res = 0,count = 0;
        for (int i : a) {
            if(count == 0){
                res = i;
            }
            count += res == i ? 1 :-1;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,1,0,2,3,3,5,5,6,7,7,0,0,0,0,3,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(countNums(a));
        HashMap<Integer, Integer> count = countNums(a);
        Map.Entry<Integer,Integer> entry = null;
        for (Map.Entry<Integer,Integer> m : count.entrySet()) {
            if(entry == null || m.getValue()>entry.getValue()){
                entry = m;
            }
        }

        System.out.println("多数元素为："+entry.getKey());

        System.out.println(marjorityelement(a));

        System.out.println(morre(a));
    }
}
