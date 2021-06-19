package com.oop.demon06;

//Student is 人  ：派生类，子类
//子类继承了父类，就会拥有父类的全部方法和属性,私有的无法继承
public class Student extends Person {
    public Student() {
        //隐藏代码：调用了父类的无参构造
        super();//必须在第一行
        System.out.println("Student无参执行了");
    }

    private String name = "李四";

    public void test(String name){
        System.out.println(name);//王二
        System.out.println(this.name);//李四
        System.out.println(super.name);//张三
    }

    public void print(){
        System.out.println("Student");
    }

    public void test1(){
        print();//Student
        this.print();//Student
        super.print();//Person
    }
}
