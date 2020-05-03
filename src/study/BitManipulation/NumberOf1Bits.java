package study.BitManipulation;

/**
 * @author syw
 * @date 2020/4/8 - 16:35
 */

/**
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 1 的个数（也被称为汉明重量）
 */
public class NumberOf1Bits {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(hanmingWeight(n));
        System.out.println(hanmingWeight2(n));
        System.out.println(hanmingWeight3(n));
        System.out.println(hanmingWeight4(n));
        System.out.println(hanmingWeight5(n));
    }

    /**
     * 遍历数字的32位，如果某一位是1，则将计数器加1
     * @param n
     * @return
     */
    public static int hanmingWeight(int n){
        int count = 0;
        int flag = 1;
        while(flag != 0){
            if((flag & n) != 0){
                count++;
            }
            flag <<= 1;
        }
        return count;
    }

    /**
     * 优化的移位运算：不再检查数字的每一位，而是不断地把数字最后一个1反转，
     * 并把答案加1。当数字变成0的时候，我们就知道它没有1的位了，此时返回结果。
     * 原理是：对于任意数字 n，将 n 与 n-1 做与运算，会把最后的一个1变成0。
     * @param n
     * @return
     */
    public static int hanmingWeight2(int n){
        int sum = 0;
        while(n != 0){
            sum++;
            n &=  (n-1);
        }
        return sum;
    }

    /**
     * Integer 类中的 bitCount 方法
     */
    public static int hanmingWeight3(int n){
        return Integer.bitCount(n);
    }

    /**
     * 请实现一个函数，输入一个整数，输出该数二进制中1的个数
     */
    private static int hanmingWeight4(int n){
        int count = 0;
        while(n != 0){
            count += (n&1);
            n >>>= 1;
        }
        return count;
    }

    private static int hanmingWeight5(int n){
        int count = 0;
        while(n != 0){
            count++;
            n &= (n-1);
        }
        return count;
    }
}
