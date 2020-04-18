package study.DynamicProgrammming;

/**
 * @author syw
 * @date 2020/4/18 - 21:27
 */

/**
 * 求斐波那切数列的第n项
 * F(0) = 0
 */
public class Fibonacci {
    /**
     * 动态规划
     * @param n
     * @return
     */
    public static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < n+1; i++) {
            dp[i] = (dp[i-1]+dp[i-2]) %1000000007;
        }

        return dp[n];
    }

    /**
     *  优化的动态规划方法。由于只用到了前两项的值，所以只用声明两个变量表示前两项，
     *  然后不断更新即可。
     * @param n
     * @return
     */
    public static int fib2(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int first = 0,second = 1,res=0;

        for (int i = 2; i < n+1; i++) {
            res = (first + second) %1000000007;
            first = second;
            second = res;
        }

        return res;
    }

    /**
     * 递归
     * @param n
     * @return
     */
    public static int fib3(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib3(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(25));
        System.out.println(fib2(25));
        System.out.println(fib3(25));
    }
}
