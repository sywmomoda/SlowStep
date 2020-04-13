package study.AboutString;


/**
 * @author syw
 * @date 2020/4/13 - 22:39
 */
public class FlipOrderOfWords {
    public static void main(String[] args) {
        String s = "hello  world!";
        System.out.println(reverseWords(s));
    }

    /**
     * 分割+倒序
     * @param s
     * @return
     */
    public static String reverseWords(String s){
        String[] str = s.trim().split(" ");//删除首尾空格并以空格分割
        StringBuffer sb = new StringBuffer();

        //倒序遍历分割后的数组
        for(int i = str.length-1;i>=0;i--){
            //以空格分割后，若两单词间有n>1个空格，则在单词数组中会有 n-1 个空单词(即"")
            //故遇到"" 时跳过
            if(str[i].equals("")) continue;
            sb.append(str[i]+" ");
        }
        return sb.toString().trim();

    }
}
