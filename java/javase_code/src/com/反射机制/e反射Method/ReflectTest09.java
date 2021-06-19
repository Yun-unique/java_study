package com.反射机制.e反射Method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
*反射Method
* */
public class ReflectTest09 {
    public static void main(String[] args) throws Exception{
        Class userServiceClass = Class.forName("com.反射机制.e反射Method.UserService");
        //获取所有的Method
        Method[] methods =userServiceClass.getDeclaredMethods();
        //System.out.println(methods.length);//2

        //遍历Method
        for (Method method:methods){
            //获取方法的修饰符
            System.out.println(Modifier.toString(method.getModifiers()));
            //获取方法的返回值类型
            System.out.println(method.getReturnType().getSimpleName());
            //获取方法名
            System.out.println(method.getName());
            //方法的修饰符列表（一个方法的参数可能会有多个）
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType:parameterTypes){
                System.out.println(parameterType.getSimpleName());
            }

        }
    }
}
class UserService{
    /**
     * 登入方法
     * @param name  用户名
     * @param password  密码
     * @return  true表示登入成功，false表示登入失败
     */
    public boolean login(String name,String password){
        if ("admin".equals(name) && "123".equals(password)){
            return true;
        }
        return false;
    }
    public void logout(){
        System.out.println("系统安全退出");
    }
}
