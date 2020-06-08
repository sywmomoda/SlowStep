package study.AboutString;

/**
 * @author syw
 * @date 2020/6/8 - 20:40
 */

/**
 * 给定一个非空字符串s，最多删除一个字符。判断是否能成为回文字符串。
 * 字符串只包含 a-z 的小写字母，字符串的最大长度是5000。
 */
public class PalindromeII {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(vaildPalindrome(s));
    }

    /**\
     * 双指针，从两个方向验证字符是否相同。当两个字符不同时，则分别跳过这两个字符，
     * 对两个子串继续进行验证，若这两个子串中至少有一个是回文串，则说明原字符串删除
     * 一个字符之后就可以成为回文串。
     */
    private static boolean vaildPalindrome(String s){
        int low=0,hight=s.length()-1;
        while(low < hight){
            char left = s.charAt(low), right = s.charAt(hight);
            if(left == right){
                low++;
                hight--;
            }else{
                boolean flag1 = true , flag2 = true;
                for (int i = low, j = hight - 1; i < j; i++, j--) {
                    char l2 = s.charAt(i) , r2 = s.charAt(j);
                    if(l2 != r2){
                        flag1 = false;
                        break;
                    }
                }

                for (int i = low + 1, j = hight; i < j; i++,j--) {
                    char l2 = s.charAt(i), r2 = s.charAt(j);
                    if(l2 != r2){
                        flag2 = false;
                        break;
                    }
                }
                return flag1 || flag2;
            }
        }
        return true;
    }
}
