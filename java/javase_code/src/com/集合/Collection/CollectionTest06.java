package com.集合.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合元素的remove
    重点：当集合的结构发生改变时，迭代器必须重新获取，如果还是用之前的迭代器，会出现
        异常：java.util.ConcurrentModificationException

    重点：在迭代集合元素的过程中，不能调用“集合对象”的remove方法，删除元素

    重点：在迭代元素的过程中，一定要使用迭代器Iterator的remove方法，删除元素，
        不要使用集合中的remove方法
 */
public class CollectionTest06 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);//Integer类型
        c.add(2);
        c.add(3);
        //获取迭代器：集合结构只要发生改变，迭代器必须重新获取
        Iterator it = c.iterator();
        while (it.hasNext()){
            //编写代码时next()方法返回值必须是Object
            Object o = it.next();
            System.out.println(o);
        }

        Collection c2 = new ArrayList();
        c2.add("abc");
        c2.add("def");
        c2.add("xyz");
        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            Object o2 = it2.next();
            //删除元素，删除之后，集合的结构发生了变化，应该重新去获取迭代器
            //但是，循环下一次的时候并没有重新获取迭代器，所以会
            // 出现异常：java.util.ConcurrentModificationException
            //c2.remove(o2);//集合对象的remove方法不可用
            //迭代器去删除时，会自动更新迭代器，并且更新集合（删除集合中的元素）
            it2.remove();   //删除的一定是迭代器指向的当前元素
            System.out.println(o2);
        }
        System.out.println(c2.size());//通过迭代器中的remove方法
    }
}
