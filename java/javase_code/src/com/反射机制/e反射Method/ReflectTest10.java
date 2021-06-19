package com.反射机制.e反射Method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
* 反编译Method
*   反编译一个类的方法
* */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        //Class userServiceClass = Class.forName("com.反射机制.e反射Method.UserService");
        Class userServiceClass = Class.forName("java.lang.String");
        sb.append(Modifier.toString(userServiceClass.getModifiers())+" class "+
                userServiceClass.getSimpleName()+"{\n");

        Method[] methods = userServiceClass.getDeclaredMethods();
        for (Method method:methods){
            sb.append("\t");
            sb.append(Modifier.toString(method.getModifiers()));
            sb.append(" ");
            sb.append(method.getReturnType().getSimpleName());
            sb.append(" ");
            sb.append(method.getName());
            sb.append("(");
            //参数列表
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType:parameterTypes){
                sb.append(parameterType.getSimpleName());
                sb.append(",");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("){}\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
