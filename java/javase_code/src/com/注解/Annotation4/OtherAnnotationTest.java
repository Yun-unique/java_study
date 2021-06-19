package com.注解.Annotation4;

public class OtherAnnotationTest {
    //数组是大括号
    @OtherAnnotation(age = 25,email = {"zhangsan@123","zhangsan@sohu.com"},season = {Season.SPRING})
    public void doSome(){}

    //如果数组中只有1个元素，大括号可以省略
    @OtherAnnotation(age = 25,email = "zhangsan@123.com",season = {Season.SPRING,Season.SUMMER,Season.AUTUMN,Season.WINTER})
    public void doOther(){}
}
