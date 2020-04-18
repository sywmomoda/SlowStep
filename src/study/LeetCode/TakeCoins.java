package study.LeetCode;

/**
 * @author syw
 * @date 2020/4/18 - 21:54
 */

/**
 * 拿硬币：
 * 桌上有n对银币，每堆的数量保存在数组 coins 中。我们每次可以任意选择一堆，
 * 拿走其中一枚或两枚，求拿完所有的银币的最小次数。
 */
public class TakeCoins {
    public static int minCount(int[] coins){
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            coins[i] = coins[i]%2 == 1 ? coins[i]/2+1 : coins[i]/2;
            count += coins[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] n = {4,2,1};
        System.out.println(minCount(n));
    }
}
