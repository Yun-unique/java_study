package com.grammar.方法;

public class Demon01 {
    //main方法
    public static void main(String[] args) {

        //实际参数：实际调用传递给他的参数
        int sum = add(1,2);

        System.out.println(sum);

        //test();
    }

    //加法
    //形式参数，用来定义作用的
    public static int add(int a, int b){
        return a+b;
    }

    public static void test(){      //打印九九乘法表
        for (int i=1;i<=9;i++){//行
            for (int j=1;j<=i;j++) {//列
                System.out.print(j + "*" + i+ "=" + (i * j)+"\t");
            }
            System.out.println();
        }
    }

}
