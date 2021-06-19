package com.异常;
/*
java语言中异常是以什么形式存在的呢？
    1、异常在java中以类的形式存在，每一个异常类都可以创建异常对象
    2、异常对应的现实生活中是怎样的？
        如：
            火灾（异常类）：
                2008年8月8日，小明家着火了（异常对象）
                2008年8月9日，小刚家着火了（异常对象）
                2008年9月8日，小红家着火了（异常对象）

            类是模板    对象是实际存在的个体

            钱包丢了（异常类）
            2008年1月8日，小明的钱包丢了（异常对象）
            2008年1月9日，小芳的钱包丢了（异常对象）
            ......

 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        //通过“异常类”实例化“异常对象”
        NumberFormatException nfe = new NumberFormatException("数字格式化异常！");
        //java.lang.NumberFormatException:数字格式化异常
        System.out.println(nfe.toString());

        NullPointerException npe = new NullPointerException("空指针异常发生了！");
        System.out.println(npe);

    }
}
