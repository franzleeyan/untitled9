package com.franzlearn.logicoperator;

/**
 * @author FranzLee
 * @ClassName LogicoperatorDemo2
 * @date 2022/11/10 18:42
 * @Version 1.0
 */
public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        // ^ 异或
        //相同为FALSE，不同为true
        //了解一下即可
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        //! 逻辑非 取反
        //提示：
        //取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println(!false);
        System.out.println(!true);
    }

}
