package study.Java8NewFeatures.TestCollection.TestMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author syw
 * @date 2020/4/3 - 19:28
 */
public class TestHashMap {
    private Condition condition1;
    private Condition condition2;
    private Lock mylock = new ReentrantLock();

    private Condition condition3;

    public TestHashMap(){
        condition1 = mylock.newCondition();


    }

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        //map.put(null,null);

        System.out.println("ok");
    }



}
