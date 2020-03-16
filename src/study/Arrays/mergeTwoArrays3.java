package study.Arrays;

import java.util.Arrays;

/**
 * @ClassName mergeTwoArrays3
 * @Description TODO
 * @Author shiyouwei
 * @Date 9:23 2019/11/26
 */
public class mergeTwoArrays3 {
    public static void merge(int[] a, int m, int[] b,int n){
        int p=m+n-1,p1=m-1,p2=n-1;
        while(p1>=0 && p2>=0){
            a[p--] = a[p1] > b[p2] ? a[p1--]:b[p2--];
        }
        while(p1>=0) {a[p--] = a[p1--];}
        while(p2>=0) {a[p--] = b[p2--];}
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,0,0,0};
        int[] b = {0,1,4};

        merge(a,3,b,3);
    }
}
