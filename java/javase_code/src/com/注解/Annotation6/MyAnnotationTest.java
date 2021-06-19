package com.注解.Annotation6;

import java.lang.reflect.Method;

//通过反射获取注解对象的属性值
public class MyAnnotationTest {

    @MyAnnotation(username = "admin",password = "123")
    public void doSome(){}

    public static void main(String[] args) throws Exception{
        //获取MyAnnotationTest的doSome()方法上面的注解信息
        //首先获取这个方法所在的类
        Class c = Class.forName("com.注解.Annotation6.MyAnnotationTest");
        //获取doSome()方法
        Method doSome = c.getDeclaredMethod("doSome");
        //判断该方法上是否存在这个注解
        if (doSome.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnnotation = doSome.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.username());
            System.out.println(myAnnotation.password());
        }
    }
}
