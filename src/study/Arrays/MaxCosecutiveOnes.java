package study.Arrays;

/**
 * @ClassName MaxCosecutiveOnes
 * @Decription Give a binary array,find the maximum number of consecutive 1s in the array.
 * @Author shiyouwei
 * @Date 13:55 2019/12/16
 */
public class MaxCosecutiveOnes {
    /**
     * count: 记录当前连续1的起始位置，ans记录当前最大个数
     * time complexity:O(n) ,space complexity:O(1)
     * @param array
     * @return
     */
    public static int findMaxCosecutiveOnes(int[] array){
        int ans = 0;
        int tag = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                tag = i+1;
            }
            //ans = Math.max(ans,i - tag + 1);
            ans = i-tag+1>ans ? i-tag+1:ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,1,1,1,0,0,1,1,1,1};
        System.out.println(findMaxCosecutiveOnes(a));
    }
}
