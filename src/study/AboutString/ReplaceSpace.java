package study.AboutString;

/**
 * @author syw
 * @date 2020/4/18 - 22:08
 */

/**
 * 替换空格：
 * 请实现一个函数，把字符串中的每个空格替换成 "%20"
 */
public class ReplaceSpace {
    public static String replaceSpace(String s) {
        StringBuffer sb = new StringBuffer();
        char[] c = s.toCharArray();
        for(char i:c){
            if(i == ' ') sb.append("%20");
            else sb.append(i);
        }
        return sb.toString();
    }

    /**
     * String 类的 replace 方法
     * @param s
     * @return
     */
    public static String replaceSpace2(String s){
        return s.replace(" ","%20");
    }

    public static void main(String[] args) {
        String s = "i love u";
        System.out.println(replaceSpace(s));
        System.out.println(replaceSpace2(s));
    }


}
