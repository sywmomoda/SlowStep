package study.Arrays;

/**
 * @ClassName theBestTime
 * @Description TODO
 * @Author shiyouwei
 * @Date 14:29 2019/11/26
 */
public class theBestTime {
    public static int maxProfit(int[] price){
        int ans=0;
        for (int i = 0; i < price.length-1; i++) {
            for (int j = i+1; j < price.length; j++) {
                if(price[j]>price[i]){
                    ans = price[j] - price[i] > ans ? price[j]-price[i] : ans;
                }
            }
        }
        return ans;
    }

    /*
    总是谷值买入，峰值卖出，遍历，最小值比较，最大利润比较
     */
    public static int maxProfit1(int[] price){
        //define profit
        int ans =0;
        //
        int min = 0;
        for (int i = 1; i < price.length; i++) {
            if(price[i]<price[min]){
                price[min]  = price[i];
            }
            else if(price[i] - price[min] > ans){
                ans = price[i] - price[min];
            }
        }
        return ans;
    }





    public static void main(String[] args) {
        int[] a = {7,1,6,9,0,7};
//        System.out.println(a.length == 0);
        System.out.println(maxProfit(a));
        System.out.println(maxProfit1(a));
    }
}
