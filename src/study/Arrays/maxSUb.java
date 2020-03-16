package study.Arrays;

import java.util.Arrays;

/**
 * @ClassName maxSUb
 * @Description TODO
 * @Author shiyouwei
 * @Date 15:33 2019/11/21
 */
public class maxSUb {
    public static int maxSubArray(int[] nums){
        int sum = 0;
        int ans = nums[0];
        for(int num:nums){
            if(sum>0){
                sum += num;
            }else{
                sum = num;
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            n[i] = (int)(Math.random()*10) - 5;
        }
        System.out.println(Arrays.toString(n));
        System.out.println(maxSubArray(n));
    }
}
