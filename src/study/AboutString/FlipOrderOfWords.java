package study.AboutString;


/**
 * @author syw
 * @date 2020/4/13 - 22:39
 */
public class FlipOrderOfWords {
    public static void main(String[] args) {
        String s = "hello  world!";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords2(s));
    }

    /**
     * split() 分割+倒序
     * 时间复杂度：O(n)， 空间复杂度：O(n)
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

    /**
     * 双指针，倒序遍历字符串，记录单词左右边界索引，添加到 StringBuffer。
     * 时间复杂度：O(n)， 空间复杂度：O(n)
     */
    public static String reverseWords2(String s){
        s = s.trim();
        int i = s.length()-1,j = i;
        StringBuffer sb = new StringBuffer();
        while(i>=0){
            while((i>=0) && s.charAt(i) != ' ') i--;
            sb.append(s.substring(i+1,j+1)+" ");
            while((i>=0) && s.charAt(i) == ' ') i--;
            j = i;
        }
        return sb.toString().trim();
    }
}
