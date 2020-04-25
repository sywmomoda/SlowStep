package study.Arrays;

import java.util.Arrays;

/**
 * @author syw
 * @date 2020/4/25 - 22:01
 */

/**
 * 打印从从1到最大n位数
 * 输入数字n，按顺序从1打印到最大的十进制n位数
 */
public class printNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNum(3)));
    }

    //毫无意义只写法
    private static int[] printNum(int n){
        if(n == 0) return new int[0];
        int length = power(10,n) - 1;
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
        }
        return nums;
    }

    /**
     * 递归实现幂运算 m^n
     * @param m
     * @param n
     * @return
     */
    private static int power(int m,int n){
        if(n == 1){
            return m;
        }else{
            return power(m*10,n-1);
        }
    }

    /**
     * 考虑大数问题
     */
}
