package com.oop.demon01;
//静态方法  static修饰
//非静态方法     new后调用
//静态和非静态方法的调用方式不同
public class Demon02 {
    public static void main(String[] args) {
        Student.say();

        //实例化这个Student new个对象
        //对象类型  对象名 = 对象值;
        Student student = new Student();
        student.play();
    }

  /*  //和类一起加载的
    public static void a(){//静态方法
        b();
    }
    //类实例化 之后才存在
    public void b(){//非静态方法

    }*/
}
