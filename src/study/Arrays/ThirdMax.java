package study.Arrays;


import java.util.TreeSet;

/**
 * @ClassName ThirdMax
 * @Description Given an non-empty array of integers , return third maximum in this array ,
 *             If it does not exist , return the maximum number.The time complexity must be in O(n).
 * @Author shiyouwei
 * @Date 9:51 2019/12/10
 */
public class ThirdMax {
    /**
     * TreeSet of size 3. Time complexity:O(n). Space complexity:O(3).
     * @param a
     * @return
     */
    public static int thirdMax(int[] a){
        TreeSet<Integer> set = new TreeSet<>();
        for(int i:a){
            set.add(i);
            if(set.size() > 3){
                set.remove(set.first());
            }
        }
        if(set.size() < 3){
            return set.last();
        }
        return set.first();

    }

    /**
     * Store the first,second and third with Three variables.
     * Time complexity:O(n) , Space complexity:(1).
     * @param a
     * @return
     */
    public static int thirdMax1(int[] a){
        int min = Integer.MIN_VALUE;
        int p1=a[0],p2=min,p3=min;
        for (int i : a) {
            //与p1,p2,p3相同的元素跳过
            if(i == p1 || i == p2 || i == p3){
                continue;
            }
            if(i>p1){
                p3 = p2;
                p2 = p1;
                p1 = i;
            }else if(i>p2){
                p3 = p2;
                p2 = i;
            }else if(i>p3){
                p3 = i;
            }
        }
        //若没有第三大的元素，则返回最大值
        if(p3 == min){
            return p1;
        }
        return p3;
    }

    public static void main(String[] args) {
        int[] array = {2,8,9,9,1};
        System.out.println(thirdMax(array));
        System.out.println(thirdMax1(array));
    }
}
