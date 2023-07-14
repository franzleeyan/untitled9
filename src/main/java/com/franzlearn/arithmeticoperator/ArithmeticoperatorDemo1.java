package com.franzlearn.arithmeticoperator;

/**
 * @author FranzLee
 * @ClassName ArithmeticoperatorDemo1
 * @date 2023/7/13 18:49
 * @Version 1.0
 */
public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        //+
        System.out.println(3 + 2);
        //结果= 5

        //-
        System.out.println(5 - 1);
        //结果= 4

        //*（shift + 数字8）
        System.out.println(7 * 9);
        //结果= 63

        //如果在计算的时候有小数参与
        //结论：
        //在代码中，如果有小数参与计算，结果可能不精确的
        //为什么呢？
        //暂时只要知道这个结论就可以了。
        //具体的原因，我们到了JavaSE的时候，再详细的讲解
        System.out.println(1.1 + 1.1);
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
    }

}
