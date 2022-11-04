package com.scanner;

//导入Scanner包
import java.util.Scanner;

/**
 * @author franzlee
 */
public class ScannerTest {
    /**
     * 主入口
     */
    public static void main(String[] args) {
        /*创建对象*/
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入第一个数字：");
        //接收number1数据
        int number1 = sc.nextInt();

        System.out.print("请输入第二个数字：");
        //接受number2数据
        int number2 = sc.nextInt();

        //输出number1 + number2 总和的数
        System.out.print(number1 + number2);
    }
}
