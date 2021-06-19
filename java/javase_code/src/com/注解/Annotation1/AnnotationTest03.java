package com.注解.Annotation1;
//表示这个类已过时
//这个注解主要是向其它程序员传达一个信息，告知已过时，有更好的解决方案存在。
@Deprecated
public class AnnotationTest03 {
    @Deprecated
    public void doSome(){
        System.out.println("do something");
    }
    public void doOther(){
        System.out.println("do other...");
    }
}
class T{
    public static void main(String[] args) {
        AnnotationTest03 at = new AnnotationTest03();
        at.doSome();
        at.doOther();
    }
}
