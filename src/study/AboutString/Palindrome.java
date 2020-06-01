package study.AboutString;

/**
 * @author syw
 * @date 2020/5/31 - 22:02
 */

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写
 * 本题中，将空字符串定义为有效的回文串
 */
public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome2(s));

    }

    /**
     * 正则 + StringBuffer
     * @param s
     * @return
     */
    private static boolean isPalindrome(String s){
        if(s == null) return false;
        if(s.length() == 0) return true;

        s = s.replaceAll("[^a-z0-9A-Z]","");
        String reverse = String.valueOf(new StringBuffer(s).reverse());
        return s.equalsIgnoreCase(reverse);
    }

    /**
     * 正则+双指针
     * @param s
     * @return
     */
    private static boolean isPalindrome2(String s){
        if(s == null) return false;
        if(s.length() == 0) return true;

        s = s.replaceAll("[^a-zA-Z0-9]","");
        char[] c = s.toUpperCase().toCharArray();

        int i = 0, j =c.length-1;
        while(i<j){
            if(c[i] == c[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
