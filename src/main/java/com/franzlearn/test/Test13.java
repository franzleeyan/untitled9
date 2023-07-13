package com.franzlearn.test;

/**
 * @author FranzLee
 * @ClassName Test13
 * @date 2022/11/21 14:29
 * @Version 1.0
 */
public class Test13 {
    public static void main(String[] args) {
        /* 需求：在实际开发中，需要重复执行的代码，会选择循环实现。
            比如：玩游戏的时候，如果网不好那么会经常断线重连。
            那么断线重连这个业务逻辑就需要重复执行。
            假设现在公司要求，断线重连的业务逻辑最多只写5次。
            请用代码实现。
            备注：断线重连的业务逻辑可以用输出语句替代。
         */

        //分析：
        //1.因为我们需要重复执行某段代码，所以需要用循环解决
        //循环的次数 5 次
        //开始条件：1
        //结束条件：5

        for (int i = 1; i <= 5; i++ ) {
            System.out.println("第"+ i + "执行断线重连的业务逻辑");
        }
    }

}