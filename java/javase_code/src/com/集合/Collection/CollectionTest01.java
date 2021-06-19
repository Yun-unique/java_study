package com.集合.Collection;

import com.oop.demon08.Student;

import java.util.ArrayList;
import java.util.Collection;

/*
关于java.util.Collection接口中常用的方法.
    1、Collection中能存放什么元素？
        没有使用“泛型”之前，Collection中可以存储Object的所有子类型
        使用了“泛型”之后，Collection中只能存储某个具体的类型
        （集合中不能直接存储基本数据类型，也不能存java对象，只是存储java对象的内存地址）
    2、Collection中的常用方法
        boolean add(Object e)   向集合中添加元素
        int size()  获取集合中元素的个数
        void clear()    清空集合
        boolean contains(Object o)  判断当前集合中是否包含元素o，包含返回true，否则返回false
        boolean remove(Object o)    从该集合中删除指定元素的单个实例（如果存在）。
        boolean isEmpty()   判断该集合中元素个数是否为0，为0返回true，否则返回false
        Object[] toArray()  返回一个包含此集合中所有元素的数组。
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
        //Collection c = new Collection();//Collection是一个接口，接口是抽象的,无法实例化

        //多态    父类型引用指向子类型对象
        Collection c = new ArrayList();
        //测试Collection接口中的常用方法
        //1、向集合添加元素 boolean add(Object e)
        c.add(1200);//自动装箱，实际上是放进去了一个对象的内存地址。Integer x = new Integer(1200);
        c.add(3.14);
        c.add(new Object());
        c.add(new Student());
        c.add(true);//自动装箱  装箱成String类型

        //2、获取集合中元素的个数 int size()
        System.out.println("集合中元素的个数是："+c.size());//5

        //3、清空集合 void clear()
        c.clear();
        System.out.println("集合中元素的个数是："+c.size());

        //再向集合中添加元素
        c.add("hello");
        c.add("world");
        c.add("绿巨人");
        c.add("钢铁侠");

        //4、判断集合中是否有某一元素 boolean contains(Object o)
        boolean flag = c.contains("绿巨人");
        System.out.println(flag?"包含":"不包含");

        //5、删除集合中的某个元素
        //c.remove("蜘蛛侠");
        c.remove("绿巨人");
        System.out.println("集合中的元素个数为"+c.size());

        //6、判断集合是否为空 boolean	isEmpty()
        System.out.println(c.isEmpty());//false
        c.clear();
        System.out.println(c.isEmpty());//true

        //7、将集合中的元素用数组形式输出 Object[] toArray()
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add("HelloWorld");
        Object[] toArray = c.toArray();
        for (int i = 0; i < toArray.length; i++) {
            //System.out.println(toArray[i]);
            Object o = toArray[i];
            System.out.println(o);
        }
    }
}
