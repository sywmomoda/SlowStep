package study.Arrays;

/**
 * @author syw
 * @date 2020/4/24 - 23:48
 */

/**
 * 旋转数组的最小数字：
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个
 * 递增的数组，输出旋转数组中的最小元素。
 */
public class MinOfRotated {
    public static void main(String[] args) {
        int[] num = {5,4,3,1,2};
        minArray(num);
    }

    public static int minArray(int[] numbers) {
        int ans = numbers[0];
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]) ans = numbers[i+1];
        }
        return ans;
    }
}
