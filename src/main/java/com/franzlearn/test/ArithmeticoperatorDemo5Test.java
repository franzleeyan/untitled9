package com.franzlearn.test;

/**
 * @author FranzLee
 * @ClassName ArithmeticoperatorDemo5Test
 * @date 2023/7/20 10:41
 * @Version 1.0
 */
public class ArithmeticoperatorDemo5Test {
    public static void main(String[] args) {
        //赋值 x = 10
        int x = 10;

        //后++: 先用后加
        //先把x变量中的值拿出来，赋值给y，然后再进行自增
        //赋值给y的值是自增前的。
        int y = x++;// x = 11 y = 10

        //先把x进行自增，然后把自增的结果赋值给左边的变量
        //先把x自增，变成12，然后再把自增后的12复制给z
        int z = ++x;// x = 12 z = 12

        //分别输出x，y，z的数值
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("z:" + z);
    }

}
