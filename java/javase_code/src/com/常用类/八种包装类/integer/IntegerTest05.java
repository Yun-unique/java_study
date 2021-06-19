package com.常用类.八种包装类.integer;
/*
好消息：在JDK1.5之后，支持自动拆箱和自动装箱了
    自动装箱：基本数据类型自动转换成包装类
    自动拆箱：包装类自动转换成基本数据类型

    有了自动拆箱之后，Number类种的方法就用不着了

    自动装箱和拆箱的好处：方便编程
 */
public class IntegerTest05 {
    public static void main(String[] args) {
        //自动装箱(int-->Integer)
        //Integer x = new Integer(100);不需要用了
        Integer x = 100;//底层等同于：Integer x = new Integer(100);
        System.out.println(x);

        //自动拆箱(Integer-->int)
        //int y = x.intValue();用不着了
        int y = x;
        System.out.println(y);

        //z是一个引用，z是一个变量，z还是保存了一个对象的内存地址
        Integer z = 999;
        //+两边要求是基本数据类型的数字，z是包装类，不属于基本数据类型，这里会进行自动拆箱，将z转换成基本数据类型
        System.out.println(z+1);

        Integer a = 1000;
        Integer b = 1000;
        //==比较的是对象的内存地址，a和b两个引用种保存的对象内存地址不同
        //==这个运算符不会触发自动拆箱机制，（只有+ - * /等运算的时候才会）
        System.out.println(a==b);//false
    }
}
