package study.manyTest;

/**
 * @author syw
 * @date 2020/4/1 - 15:39
 */
public class Manager extends Employee {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setAge(12);
        System.out.println(manager.getAge());
    }
}
