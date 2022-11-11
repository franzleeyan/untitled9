package com.franzlearn.ifdemo;

/**
 * @author FranzLee
 * @ClassName IfDemo2
 * @date 2022/11/11 20:39
 * @Version 1.0
 */

/**
    if(关系表达式){
        语句体;
    }

    if的重点：
        1.大括号的开头可以另起一行书写，但是建议写在第一行的末尾
        2.在语句中，如果只有一句代码，大括号可以省略不写
        3.如果对一个布尔类型的变量进行判断，不要用==号。直接把变量写在小括号即可
 */

public class IfDemo2 {
    public static void main(String[] args) {
//        int number = 10;
//        if (number >= 10) {
//            System.out.println("number大于等于10");
//        }

        boolean flag = false;
        if (flag == true) {
            System.out.println("flag的值为true");
        }
    }

}
