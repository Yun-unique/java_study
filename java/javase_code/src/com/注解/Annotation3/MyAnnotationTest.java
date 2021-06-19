package com.注解.Annotation3;
//如果一个注解的属性名字是value，并且只有一个属性的话，在使用的时候，该属性名可以省略
public class MyAnnotationTest {
    /*@MyAnnotation
    public void doSome(){}*/
    @MyAnnotation(value = "123")
    public void doSome(){}

    @MyAnnotation("123")
    public void doOther(){}
}
