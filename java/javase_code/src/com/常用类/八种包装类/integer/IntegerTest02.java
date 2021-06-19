package com.常用类.八种包装类.integer;
/*
1、8种基本数据类型对应的包装类型名是什么？
    基本数据类型              包装类型
    ---------------------------------------
    byte                    java.lang.Byte（父类是Number）
    short                   java.lang.Short（父类是Number）
    int                     java.lang.Integer（父类是Number）
    long                    java.lang.Long（父类是Number）
    float                   java.lang.Float（父类是Number）
    double                  java.lang.Double（父类是Number）
    boolean                 java.lang.Boolean（父类是Object）
    char                    java.lang.Character（父类是Object）
2、以上八种包装类，重点以java.lang.Integer为代表进行学习，其他的类型照葫芦画瓢就行

3、八种包装类其中6个都是数字对应的包装类，它们的父类都是Number，可以先研究一下Number种公共的方法：
    Number是一个抽象类，无法实例化对象.
    Number类中有这样的方法：涉及装箱、拆箱问题
    byte byteValue()      以byte形式返回指定的数值
    short shortValue()    以short形式返回指定的数值
    int intValue()        以int形式返回指定的数值
    long longValue()      以long形式返回指定的数值
    float floatValue()    以float形式返回指定的数值
    double doubleValue()  以double形式返回指定的数值
 */
public class IntegerTest02 {
    public static void main(String[] args) {
        //123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换
        //基本数据类型--(转换为)-->引用数据类型（装箱）
        Integer i = new Integer(123);
        System.out.println(i);

        //将引用数据类型--(转换为)-->基本数据类型（拆箱）
        float f = i.floatValue();
        System.out.println(f);//123.0

    }
}
