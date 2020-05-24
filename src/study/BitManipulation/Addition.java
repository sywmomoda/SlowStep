package study.BitManipulation;

/**
 * @author syw
 * @date 2020/5/24 - 22:07
 */

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用四则运算符
 */
public class Addition {
    public static void main(String[] args) {
        int res = add(5,6);
        System.out.println(res);
    }

    /**
     * ^ ：相当与无进位的求和，如9+1=10，无进位求和就是1；
     * & ：相当于每位的进位数
     */
    private static int add(int a,int b){
        while(b != 0){
            int carry = (a & b) << 1;
            a ^= b;
            b = carry;
        }

        return a;
    }
}
