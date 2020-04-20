package study.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 数组中出现次数超过一半的数字：
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
 * 假设数组非空，且多数元素总是存在
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
     * boyer-moore , time complexity:O(n),space complexity:O(1)
     * 摩尔投票法。核心思想为正负抵消，计众数的票数为 +1，非众数的票数为 -1，
     * 因为众数个数大于一半，所以一定有所有票数和>0。
     * @param a
     * @return res
     * @Date 14:01 2019/12/3
     * @Author shiyouwei
     */
    public static int morre(int[] a){
        int res = 0,count = 0;
        for (int i : a) {
            //票数为0后，下一个数为新的众数
            if(count == 0){
                res = i;
            }
            //res 与上个数相等，则 count+1，否则 -1
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
