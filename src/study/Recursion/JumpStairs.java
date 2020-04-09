package study.Recursion;

/**
 * @author syw
 * @date 2020/4/9 - 22:30
 */

/**
 * 青蛙跳台阶问题：
 * 一只青蛙一次可以跳上 1 级台阶，也可跳上 2 级台阶。求该青蛙跳上一个 n 级的台阶共有多少种跳法。
 * 答案需要取模 1e9+7。
 */
public class JumpStairs {
    public static void main(String[] args) {
        System.out.println(numWays(44));
    }

    /**
     *  设跳上 n 级台阶有 f(n) 种跳法，其中分为最后一步跳 1 级和最后跳 2 级两种情况下；
     *  故 f(n) = f(n-1) + f(n-2), 递归求解。
     * @param n
     * @return
     */
    public static int numWays(int n){
        if(n == 0 || n == 1) return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }
        return dp[n];
    }
}
