package study.AboutString;

/**
 * @author syw
 * @date 2020/4/26 - 21:42
 */

/**
 * 左旋字符串
 *字符串的左旋操作是把字符串前面的前n个字符串转移到字符串的尾部。
 * 如：输入 “abcdefg" 和数字 2 ，该函数将返回 ”cdefgab“
 *
 */
public class ReverseLeftWords {
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reverseLeft(s,2));
    }

    public static String reverseLeft(String s, int n) {
        if(n==0) return s;
        StringBuffer sb = new StringBuffer();
        char[] c = s.toCharArray();
        for(int i=n;i<c.length;i++){
            sb.append(c[i]);
        }
        for(int i=0;i<n;i++){
            sb.append(c[i]);
        }
        return sb.toString();
    }
}
