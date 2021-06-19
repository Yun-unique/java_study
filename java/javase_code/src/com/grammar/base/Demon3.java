package com.grammar.base;

public class Demon3 {
    public static void main(String[] args) {
        //整数拓展:  进制    二进制0b  十进制  八进制0  十六进制0x

        int i =10;
        int i2 =010;
        int i3 =0x10;

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("======================================================");

        //==============================================================
        //浮点数拓展? 银行业务怎么表示？
        //BigDecimal  数学工具类
        //==============================================================
        //float     表现的数字有限  离散  有舍入误差
        //double
        //最好完全避免使用浮点数进行数字比较

        float f=0.1f;  //0.1
        double d=1.0/10;//0.1
        System.out.println(f==d);//false

        float d1=23131312312312313f;
        float d2=d1+1;
        System.out.println(d1==d2);//true

        //==============================================================
        //字符拓展？
        //==============================================================
        System.out.println("======================================================");
        char c1 ='a';
        char c2='中';
        System.out.println(c1);
        System.out.println((int)c1);    //强制类型转换
        System.out.println(c2);
        System.out.println((int)c2);

        //所有的字符本质还是数字
        //编码  Unicode表：（97=a  65=A）
        char c3='\u0061';
        System.out.println(c3);   //a

        //转义字符
        //\t    制表符
        //\n    换行符
        //......

        //布尔值拓展
        boolean flag=true;
        if(flag==true){}    //新手
        if (flag){}         //老手
        //代码要精简易读
    }
}
