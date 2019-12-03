package study.Arrays;

import java.util.Arrays;

/**
 * @ClassName plusOne
 * @Decription TODO
 * @Author shiyouwei
 * @Date 16:31 2019/11/21
 */
public class plusOne {
    public static int[] plusOne(int[] a){
        int i = a.length-1;
        while(i>=0){
            int sum = a[i] +1;
            a[i] = sum%10;
            if(a[i] != 0) {
                return a;
            }
            i--;
        }

        int[] b = new int[a.length+1];
        b[0] = 1;
        return b;
    }

    public static void main(String[] args) {
        int[] a = {9,9,9,8};

        System.out.println(Arrays.toString(plusOne(a)));
    }
}
