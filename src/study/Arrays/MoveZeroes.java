package study.Arrays;


import java.util.Arrays;

/**
 * @ClassName MoveZeroes
 * @Decription Given an array,write an function to move all zeroes to the end of it
 *             while maintaining the relative order of the non-zero elements.
 * @Author shiyouwei
 * @Date 10:07 2019/12/6
 */


/**
 * @Description
 * @param
 * @return
 * @Date 16:38 2019/12/9
 * @Author shiyouwei
 */

public class MoveZeroes {
    /**
     * Two pointers. time complexity:O(n), space complexity:O(1)
     * 定义两个指针，i,j 都从头开始向后移动，当i指向非0元素时，若j 指向0，则交换这两个元素
     * 然后j 向后移动，若j 不指向0 则可不交换，j直接向后移动。
     * 遍历一遍，依次将非0元素与前面的0元素交换。
     * @param a
     * @return
     */
    public static int[] move(int[] a){
        int j =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0){
                if(a[j] == 0){
                    a[j] = a[i];
                    a[i] = 0;
                }
                j++;
            }

        }
        return a;
    }

    public static void main(String[] args) {
        int[] array = {0,0,0,1,0,0,2,3,4,0,0,0,0,0,1,2,0};
        System.out.println(Arrays.toString(move(array)));
    }
}
