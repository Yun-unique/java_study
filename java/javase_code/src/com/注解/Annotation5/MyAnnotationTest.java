package com.注解.Annotation5;
@MyAnnotation("上海浦东区")
public class MyAnnotationTest {
    //@MyAnnotation //该注解定义只能注解类和方法
    int i;
    //@MyAnnotation //该注解不能注解Constructor
    public MyAnnotationTest() {
    }
    @MyAnnotation
    public void doSome(){
        //@MyAnnotation //该注解不能注解局部变量
        int j;
    }
}
