package study.Arrays;

import java.util.Arrays;

/**
 * @author syw
 * @date 2020/3/11 - 11:21
 * @Description Suppose u have a long flowerbed in which some of the plots
 *             are planted and some are not.However,flowers cannot be planted
 *             in adjacent plots - they would compete for water and both would die.
 *
 *             Given a flowerbed(represented as an array contains 0 and 1, where 0
 *             means empty and 1 means not empty),and a number of n,return true if n new
 *             flowers can be panted in without violating the no-adjacent-rule.
 */

public class canPlaceFlowers {

    /**
     * 从左到右遍历数组，如果碰到0，且这个0的两侧都是0，那么这个位置就可以种花，此时
     * 将这个位置的0修改为1，并将计数器增加1.对于数组第一个和最后一个的位置，只需要
     * 考虑一侧是否为0.
     * time complexity:O(N), space complexity:(1)
     */
    public static boolean plant(int[] flowerbed,int n){
        int i = 0,count = 0;
        while(i < flowerbed.length){
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                count++;
            }
            i++;
        }
        return count >= n;
    }

    /**
     * 对常数进行优化，即在扫描数组时，若count的值已经达到n，那么可以直接跳出循环.
     */
    public static boolean greedy(int[] flowerebed,int n){
        int i = 0,count = 0;
        while(i < flowerebed.length){
            if(flowerebed[i] == 0 && (i == 0 || flowerebed[i-1] == 0) && i == flowerebed.length-1 || flowerebed[i+1] == 0){
                flowerebed[i] = 1;
                count++;
            }
            if(count >= n) return true;
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int a = (int)(Math.random()*10);
        int[] array =  new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = (int) (Math.random()*15 /10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(plant(array,1));
    }

}
