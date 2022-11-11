package com.franzlearn.logicoperator;

/**
 * @author FranzLee
 * @ClassName LogicoperatorDemo1
 * @date 2022/11/10 18:05
 * @Version 1.0
 */
public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //1.& 并且
        //两边都是真，结果才是真
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(true & false);
        System.out.println(false & true);

        //2.| 或者
        //两边都为假，结果才是假
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(true | false);
        System.out.println(false | true);
    }

}
