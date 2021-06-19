package com.反射机制.a反射创建对象;
/*
* 获取到Class能干什么？
*   通过Class的newInstance()方法来实例化对象。
*   注意：newInstance()方法内部实际上调用了无参数构造方法，必须保证无参构造方法存在才可以
* */
public class ReflectTest02 {
    public static void main(String[] args) {
        //这是不使用反射机制，创建对象
        /*User user = new User();
        System.out.println(user);*/

        //下面这段代码是以反射机制的方式创建对象
        try {
            //通过反射机制，获取Class，通过Class来实例化对象
            //c代表User类型
            Class c = Class.forName("com.反射机制.a反射创建对象.User");

            //newInstance()这个方法会调用User这个类的“无参数构造方法”，完成对象的创建
            //重点是：newInstance()调用的是无参数构造，必须保证无参数构造是存在的。
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
