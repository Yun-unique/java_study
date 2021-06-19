package com.反射机制.d反射Field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
* 反射Student类当中所有的Field
* */
public class ReflectTest06 {
    public static void main(String[] args) throws Exception{
        //获取整个类
        Class studentClass = Class.forName("com.反射机制.d反射Field.Student");
        //getFields()可以获取类中所有的public 修饰的Field
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);
        for (Field field:fields){
            System.out.println(field);//public int com.反射机制.d反射应用.Student.id
            System.out.println(field.getName());//
        }
        System.out.println("=============================");
        //获取所有的Field
        Field[] declaredFields = studentClass.getDeclaredFields();
        System.out.println(declaredFields.length);
        for (Field declaredField:declaredFields){
            //获取属性的修饰符列表
            //System.out.println(i);//返回修饰符是一个数字，每个数字是修饰符对应的代号
            int i = declaredField.getModifiers();
            String modifierString = Modifier.toString(i);
            System.out.println(modifierString);
            //获取属性的类型
            Class fieldType = declaredField.getType();
            //获取属性的名字
            //String fieldName = fieldType.getName();
            String fieldName = fieldType.getSimpleName();
            System.out.println(fieldName);
        }
    }
}
//反射属性Field
class Student{
    //Field翻译为字段，其实就是属性/成员
    //4个Field，分别采用了不同的访问控制权限修饰符
    public int id;
    private String name;
    protected int age;
    boolean sex;
}
