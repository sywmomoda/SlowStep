package study.Arrays;

import java.util.Arrays;

/**
 * @ClassName mergeTwoArrays
 * @Description TODO
 * @Author shiyouwei
 * @Date 13:53 2019/11/22
 */
public class mergeTwoArrays {
    public static int[] merge(int[] a,int[] b){
        int[] res = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(i<a.length && j<b.length && a[i] <= b[j]){
                res[k++] = a[i++];
            }
            if(i<a.length && j<b.length && b[j] <= a[i]){
                res[k++] = b[j++];
            }
        }
        if(i<a.length){
            res[k++] = a[i++];
        }
        if(j<b.length){
            res[k++] = b[j++];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,5,7};
        int[] b = {2,4,5,6,7};
        System.out.println(Arrays.toString(merge(a,b)));
    }
}
