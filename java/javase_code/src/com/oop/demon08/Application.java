package com.oop.demon08;
//多态
/*
多态注意事项：
    1、多态是指方法的多态，属性没有多态
    2、父类和子类，有联系     类型转换异常！：ClassCastException!
    3、存在条件：继承关系，子类方法要重写，父类的引用指向子类对象！ Father f1 = new Son();
    4、 static修饰的方法，属于类，不属于实例，不能重写
        final修饰的方法不能重写
        private修饰的方法不能重写

 */
public class Application {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new Student();
        //new Person();

        //可以指向的引用类型不确定：父类的引用指向子类对象
        //Student能调用的方法都是自己的或者继承父类的
        Student s1 = new Student();
        //Person  父类型，可以指向子类，但不能调用子类独有的方法
        Person s2 = new Student();//父类的引用指向子类对象
        Object s3 = new Student();

        s1.run();
        s2.run();//子类重写了父类的方法，执行子类的方法

        //对象能执行哪些方法，主要看对象左边的类型
        s1.eat();
        //s2.eat(); //Person  父类型，可以指向子类，但不能调用子类独有的方法
        ((Student)s2).eat();//s2父类型引用，强制转换成子类型，向下转型（强转）
    }
}
