package study.Arrays;

import java.util.Arrays;

/**
 * @ClassName mergeTwoArrays2
 * @Description TODO
 * @Author shiyouwei
 * @Date 14:53 2019/11/22
 */
public class mergeTwoArrays2 {
    public static int[] merge(int[] a,int m,int[] b,int n){
        int i=0,j=0,l=0;
        int[] temp = new int[m]; //第一个数组的复制
        System.arraycopy(a,0,temp,0,m);
        System.out.println(Arrays.toString(temp));
        while(j<n && l<m){
//            if(j<n && l<m && b[j]<=temp[l]){
//                a[i++] = b[j++];
//            }
//            if(j<n && l<m && temp[l]<=b[j]){
//                a[i++] = temp[l++];
//            }
            a[i++] = b[j] < temp[l] ? b[j++] : temp[l++];
        }
        while(l<m){
            a[i++] = temp[l++];
        }
        while(j<n){
            a[i++] = b[j++];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {4,0,0,0,0};
        int[] b = {1,2,3,5};
        System.out.println(Arrays.toString(merge(a,1,b,4)));
    }
}
