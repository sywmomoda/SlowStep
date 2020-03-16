package study.Arrays;

import java.util.Arrays;

/**
 * @ClassName matrixReshape
 * @Description Given a matrix represented by a two-dimensional array,and two positive integers r and c representing the
 *             two number and column number of the wanted reshape matrix,respectively.
 * @Author shiyouwei
 * @Date 14:01 2019/12/26
 */
public class matrixReshape {

    /**
     * 暴力遍历：定义新矩阵，用两个初始为0的变量表示行和列，遍历原矩阵依次填充进新矩阵
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public static int[][] reshapeMatrix(int[][] nums,int r,int c){
        if( r*c != nums.length*nums[0].length) {
            return nums;
        }
        int[][] ans = new int[r][c];
        int x = 0,y = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                ans[x][y] = nums[i][j];
                y++;
                if(y == c){
                   x = x+1;
                   y = 0;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        //Arrays.deepToString() 多维数组的toString方法
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(reshapeMatrix(a,4,1)));
    }
}
