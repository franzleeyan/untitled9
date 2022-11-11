package com.franzlearn.scanner;

/**
 * @author lin
 * @date 2022/11/03/19:46
 */
public class ArithmeticoperatorDemo3 {
    //主入口
    public static void main(String[] args) {
        //定义变量 b1 类型为 byte
        //定义变量 b2 类型为 byte
        byte b1 = 10;
        byte b2 = 20;
        //转换 b1 和 b2 格式为 int 并且公式相加
        // int result = b1 + b2;
        //（byte）b1 + b2 强转的是b1，并不是最终的结果
        byte result = (byte)(b1 + b2);
        System.out.println(result);
    }
}
