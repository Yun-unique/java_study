package com.grammar.base;

public class Demon8 {


    //类变量  static修饰
    static double salary=2500;

    //属性：变量


    static {
        //代码块
    }

    //实例变量：从属于对象；如果不自行初始化，这个类型的默认值为 0  0.0
    //布尔值：默认值是false
    //出了基本类型，其余的默认值都是null;
    String name;
    int age;

    //main方法，程序入口
    public static void main(String[] args) {

        //局部变量；必须先声明数据类型和初始化值（否则系统赋默认值）
        int i=10;
        System.out.println(i);

        //变量类型 变量名字=new com.yun.base.Demon8();
        Demon8 demon8=new Demon8();
        System.out.println(demon8.age);
        System.out.println(demon8.name);

        //类变量
        System.out.println(salary);

    }

    //其他方法
    public void add(){

    }

}
