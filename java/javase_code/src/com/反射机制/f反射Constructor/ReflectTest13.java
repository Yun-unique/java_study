package com.反射机制.f反射Constructor;

import java.lang.reflect.Constructor;

/*
* 反射机制调用构造方法
* */
public class ReflectTest13 {
    public static void main(String[] args) throws Exception {
        //不使用反射机制怎么创建对象
        /*Vip v1 = new Vip();
        Vip v2 = new Vip(110,"张三","2001-10-11",true);*/

        //使用反射机制怎么创建对象
        Class vipClass = Class.forName("com.反射机制.f反射Constructor.Vip");
        //调用无参数构造方法
        /*Object obj = vipClass.newInstance();
        System.out.println(obj);*/

        //调用有参数的构造方法怎么办？
        //第一步：先获取到这个有参数的构造方法
        Constructor con = vipClass.getDeclaredConstructor(int.class, String.class, String.class, boolean.class);
        //第二步：调用构造方法new对象
        Object object = con.newInstance(110, "jackson", "1990-10-11", true);
        System.out.println(object);

        //获取无参数构造方法
        Constructor constructor = vipClass.getDeclaredConstructor();//无参数构造
        Object newObj = constructor.newInstance();
        System.out.println(newObj);
    }
}
