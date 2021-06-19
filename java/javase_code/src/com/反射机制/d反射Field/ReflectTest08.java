package com.反射机制.d反射Field;

import java.lang.reflect.Field;

/*
* 必须掌握：
*   怎么通过反射机制访问一个Java对象的属性？
*       给属性赋值set
*       获取属性的值get
* */
public class ReflectTest08 {
    public static void main(String[] args) throws Exception{
        //不使用反射机制，怎么去访问一个对象的属性呢？
        Student s = new Student();
        //三要素：给s对象的id属性赋值1111
        //要素1：对象s   要素2：id属性    要素3：1111
        s.id = 1111;
        System.out.println(s.id);

        //使用反射机制，怎么去访问一个对象的属性（set get）
        Class studentClass = Class.forName("com.反射机制.d反射Field.Student");
        Object object = studentClass.newInstance();//object就是Student对象（底层调用无参数构造方法）

        //获取具体属性（根据属性的名称来获取Field）
        Field id = studentClass.getDeclaredField("id");
        //给object对象（Student对象）具体属性赋值
        id.set(object,2222);//给object对象的id属性赋值2222

        //读取具体属性的值
        System.out.println(id.get(object));

        //可以访问私有的属性吗？
        Field name = studentClass.getDeclaredField("name");
        //需要打破封装才可以（反射机制的缺点：打破封装，可能会给不法分子留下机会）
        //这样设置完之后，在外部也是可以访问private的
        name.setAccessible(true);//打破封装

        name.set(object,"jack");
        System.out.println(name.get(object));
    }
}
