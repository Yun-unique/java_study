package com.反射机制.a反射创建对象;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
* 验证反射机制的灵活性。
*   java代码写一遍，再不改变java源代码的基础上，可以做到不同对象的实例化。
*   非常之灵活。（符合OCP开闭原则：对扩展开放，对修改关闭）
*
* 后期学习的高级框架如：
*   ssh ssm
*   Spring SpringMVC MyBatis
*   Struts Hibernate
*   ...
*   这些高级框架底层实现原理：都采用了反射机制，所以反射机制是很重要的。
*   学会了反射机制有利于理解框架底层的源代码。
* */
public class ReflectTest03 {
    public static void main(String[] args) {
        //这种方式代码就是写死的，只能创建一个User类型的对象
        //User user = new User();

        //以下代码是灵活的，代码不需要改动，可以修改配置文件，配置文件修改之后，可以创建出不同的实例对象。
        FileReader reader = null;
        try {
            //通过IO读取classinfo.properties文件
            reader = new FileReader("C:\\Users\\86187\\Desktop\\Java\\java\\javase_code\\classinfo.properties");
            //创建属性类对象Map
            Properties pro = new Properties();//key，value都是String
            //加载
            pro.load(reader);
            //通过key获取value
            String className = pro.getProperty("className");
            System.out.println(className);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
