package com.注解.Annotation7;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception{
        //获取类
        Class c = Class.forName("com.注解.Annotation7.User");
        //判断这个类上面是否存在Id注解
        if (c.isAnnotationPresent(Id.class)){
            //当一个类上面有@Id注解的时候，要求类中必须存在int类型的id属性
            //如果没有int类型的id属性则报异常
            //获取类的属性
            Field[] fields = c.getDeclaredFields();
            boolean isRight = false;//给一个默认的标记
            for (Field field:fields){
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())) {
                    //表示这个类是合法的类，有@Id注解，则这个类中必须存在int类型的id
                    isRight = true;//表示合法
                    break;
                }
            }
            //判断是否合法
            if (!isRight) {
                throw new HasNotIdPropertyException("被@Id注解标注的类中必须要有一个int类型的id属性");
            }
        }
    }
}
