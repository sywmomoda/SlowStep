package study.Java8New;


/**
 * @Description 函数式接口只包含一个抽象方法，但可以包含多个非抽象方法
 * @param
 * @return
 * @Date 9:34 2019/11/22
 * @Author shiyouwei
 */
@FunctionalInterface
public interface FunInterface {
    void anAbstarctMethod();
//    void anotherAbstactMethod();
    String toString(); //接口中的方法默认为abstract
}
