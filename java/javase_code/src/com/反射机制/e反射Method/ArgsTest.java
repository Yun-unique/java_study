package com.反射机制.e反射Method;
/*
* 可变长参数
*   int... args 这就是可变长参数
*       语法是：类型...(注意：一定是3个点)
*   注意点：
*       1、可变长参数要求的参数个数是：0~N个
*       2、可变长参数在参数列表中必须在最后一个位置上，而且可变长参数只能有1个
*       3、可变长参数可以看作是一个数组
* */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,20);
        //m("abc");类型不对
        m3("jack","kitty","rose");

        String[] strings = {"a","b","c"};
        m3(strings);

        m3(new String[]{"我","是","中","国","人"});
    }
    public static void m(int... args){
        System.out.println("m方法执行了");
    }
    //public static void m2(int... args2,String... args2){}

    public static void m2(int a,String... args1){}

    public static void m3(String... args){
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+" "+"\n");
        }
    }
}
