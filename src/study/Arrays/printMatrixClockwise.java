package study.Arrays;

import java.util.Arrays;

/**
 * @author syw
 * @date 2020/4/8 - 13:18
 */

/**
 * 输入一个矩阵，按照从外向里的顺序依次打印出每个数字
 */
public class printMatrixClockwise {
    /**
     * 四条边，四个边界，每遍历完一条边就将相应的边界向内缩小1
     * @param matrix
     * @return
     */
    public static int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];
        int[] ans = new int[matrix.length*matrix[0].length];
        int upon = 0, left = 0, under = matrix.length - 1,right = matrix[0].length - 1;
        int k =0;
        while(true){
            for(int i = left; i <= right; i++){
                ans[k++] = matrix[upon][i];
            }
            if(++upon > under) break;

            for(int i = upon; i <= under; i++){
                ans[k++] = matrix[i][right];
            }
            if(--right < left) break;

            for(int i = right; i >= left; i--){
                ans[k++] = matrix[under][i];
            }
            if(--under < upon) break;

            for(int i = under;i >= upon;i--){
                ans[k++] = matrix[i][left];
            }
            if(++left > right) break;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println(Arrays.toString(spiralOrder(mat)));
    }
}
