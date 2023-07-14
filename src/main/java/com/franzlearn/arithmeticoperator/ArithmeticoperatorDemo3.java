package com.franzlearn.arithmeticoperator;

/**
 * @author FranzLee
 * @ClassName ArithmeticoperatorDemo3
 * @date 2023/7/14 11:34
 * @Version 1.0
 */
public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        byte b1 = 100;
        byte b2 = 100;
        //现在我们要转换的是谁？
        //b1 + b2计算之后的结果。
        //（byte）b1 + b2 强转的是b1，并不是最终的结果
        byte result = (byte)(b1 + b2);
        System.out.println(result);
        //b1 = 10 和 b2 = 20的情况下，结果 = 30
        //b1 =100 和 b2 = 100的情况下，结果就发生错误，因为要转换的数据过大。
    }

}
