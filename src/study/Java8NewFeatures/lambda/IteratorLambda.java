package study.Java8NewFeatures.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author syw
 * @date 2020/4/2 - 18:21
 */
public class IteratorLambda {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.toString());


        StringBuffer sb = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");
        StringBuffer sb3 = new StringBuffer("hello");
        StringBuffer sb4 = new StringBuffer("hello");
        List<StringBuffer> stringList = new ArrayList<>();
        stringList.add(sb);
        stringList.add(sb2);
        stringList.add(sb3);
        stringList.add(sb4);
        System.out.println(stringList.toString());

        //使用 forEachRemaining 方法 和 lambda 表达式对list元素进行操作
        List<Integer> result = new ArrayList<>(4);
        System.out.println(result.toString());

        Iterator<Integer> iterator = list.iterator();
        Iterator<StringBuffer> stringIterator = stringList.iterator();

        //iterator.forEachRemaining(element -> System.out.print(element.equals(1)+" "));

        System.out.println();
        //只能使用依次，再次使用时已经到集合末尾，无 next，所以无法遍历
        iterator.forEachRemaining(element -> result.add(element));

        System.out.println("list="+list.toString());
        System.out.println("result="+result.toString());

        stringIterator.forEachRemaining(element -> element.append(" world!"));
        System.out.println(stringList.toString());

    }
}
