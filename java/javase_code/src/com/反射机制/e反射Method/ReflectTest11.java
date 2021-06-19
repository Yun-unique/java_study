package com.反射机制.e反射Method;

import java.lang.reflect.Method;

/*
* 重点：必须掌握
*   通过反射机制怎么调用一个对象的方法
*
* 反射机制，让代码很具有通用型，可变化的内容都是写到配置文件当中，
* 将来修改配置文件之后，创建的对象不一样了，调用的方法也不同了。
* 但是java代码不需要做任何改动。这就是反射的作用
* */
public class ReflectTest11 {
    public static void main(String[] args) throws Exception{
        //不适用反射机制调用方法
        /*
        * 要素分析：
        *   要素1：对象userService
        *   要素2：login方法名
        *   要素3：实参列表
        *   要素4：返回值
        * */
        /*UserService userService = new UserService();
        boolean login = userService.login("admin", "123");
        System.out.println(login?"登入成功":"登入失败");*/

        //使用反射机制调用方法
        Class userService = Class.forName("com.反射机制.e反射Method.UserService");
        //创建对象
        Object o = userService.newInstance();
        //获取Method
        Method login = userService.getDeclaredMethod("login", String.class, String.class);
        /*
        * 反射机制调用Method也有四要素：
        *   1、login方法
        *   2、o对象
        *   3、"admin","123"实参
        *   4、retValue返回值
        * */
        Object retValue = login.invoke(o, "admin", "123");
        System.out.println((boolean)retValue?"登入成功":"登入失败");
    }
}
