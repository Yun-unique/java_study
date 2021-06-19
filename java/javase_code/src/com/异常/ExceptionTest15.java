package com.异常;

/*
异常在方法覆盖中需要注意的点：
    重写之后的方法不能比重写之前的方法抛出更多（或更宽泛）的异常，可以更少
 */
public class ExceptionTest15 {
}

class Animal {
    public void doSome(){
    }

    public void doOther() throws Exception {
    }
}

class Cat extends Animal {
    //编译报错
    /*
    public void doSome () throws Exception {

    }
     */

    //编译正常
    //public void doOther(){}

    //编译正常
    //public void doOther() throws Exception{}

    //编译正常
    public void doOther() throws NullPointerException {}
}