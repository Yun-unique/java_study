package com.集合.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Collection接口的子接口：List
测试List接口中常用的方法：
    1、List集合存储元素特点：有序可重复
        有序：List集合中的元素有下标，从0开始，以1递增
        可重复：存储的元素可以相同
    2、List既然是Collection接口的子接口，那么肯定List接口有自己“特色”的方法：
        以下只列出List接口特有的常用的方法：
            void add(int index,Object element)
            Object get(int index)
            int indexOf(Object o)
            int lastIndexOf(Object o)
            Object remove(int index)
            Object set(int index,Object element)    修改指定位置元素
 */
public class ListTest01 {
    public static void main(String[] args) {
        //创建List类型的集合
        List myList = new ArrayList();
        //添加元素：默认都是向集合末尾添加元素
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("C");
        myList.add("D");
        //1、在列表的指定位置添加元素。这个方法使用不多，因为对于ArrayList集合来说效率较低，涉及元素位移
        myList.add(1,"hello");

        //迭代
        Iterator it = myList.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        //2、根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println(firstObj);
        //因为有下标，所以List集合有自己特有的遍历方法
        //通过下标遍历
        for (int i = 0; i < myList.size(); i++) {
            Object object = myList.get(i);
            System.out.println(object);
        }

        //3、获取指定对象第一次出现处的索引(下标)
        System.out.println(myList.indexOf("C"));//3

        //4、获取指定对象最后一次出现处的索引
        System.out.println(myList.lastIndexOf("C"));//4

        //5、删除指定下标位置的元素
        myList.remove(3);

        //6、修改指定位置元素
        myList.set(1,"钢铁侠");
        Object object1 = myList.get(1);
        System.out.println(object1);

        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }
    }
}
