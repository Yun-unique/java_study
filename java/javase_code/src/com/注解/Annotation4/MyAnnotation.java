package com.注解.Annotation4;

public @interface MyAnnotation {
    /*
    * 注解当中的属性可以是哪种类型？
    *   属性的类型可以是：
    *       byte short int long float double boolean char
    *       以及以上每一种的数组形式
    * */
    int value();
    String value2();
    int[] value3();
    String[] value4();
    Season value5();
    Season[] value6();
    Class parameterType();
    Class[] parameterTypes();
}
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}
