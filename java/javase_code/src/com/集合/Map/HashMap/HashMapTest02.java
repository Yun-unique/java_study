package com.集合.Map.HashMap;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
* 1、向Map集合中存，以及从Map集合中取，都是先调用key的hashCode方法，然后再调用equals方法！
*   equals方法有可能调用，也可能不调用
*       拿put(k,v)举例，什么时候equals不会调用？
*           k.hashCode()方法得到哈希值
*           哈希值经过哈希算法转换成数组下标。
*           数组下标位置上如果是null(没有单向链表)，equals方法不需要调用，直接把这个节点放入哈希表中
*       拿get(k)举例，什么时候equals不会调用？
*           k.hashCode()方法得到哈希值
*           哈希值经过哈希算法转换成数组下标。
*           数组下标位置上如果是null(没有单向链表)，直接返回null，equals方法不需要调用。
* 2、注意：如果一个类的equals方法重写了。那么hashCode方法必须重写！
*       并且equals方法如果返回结果是true，hashCode方法返回的值必须一样。
*       equals方法返回true表示两个对象相同，在同一个单向链表上比较。
*       那么对于同一个单向链表上的节点来说，它们的哈希值都是相同的。
*       所以hashCode方法的返回值也应该相同。
* 3、hashCode方法和equals方法可以使用IDEA工具直接生成，但是这两个方法需要同时生成。
*
* 4、终极结论：
*       放在HashMap集合key部分的，以及放在HashSet集合中的元素，需要同时重写hashCode方法和equals方法
* */
public class HashMapTest02 {
    public static void main(String[] args) {
        student student1 = new student("张三");
        student student2 = new student("张三");
        //重写equals方法之前是false
        //System.out.println(student1.equals(student2));
        //重写equals方法之后是true
        System.out.println(student1.equals(student2));

        //重写hashCode方法之前
        //student1的hashCode=764977973
        //student2的hashCode=1534030866
        /*System.out.println("student1的hashCode="+student1.hashCode());
        System.out.println("student2的hashCode="+student2.hashCode());*/

        //student1.equals(student2)结果已经是true了，表示student1和student2是一样的，相同的，那么往HashSet集合中放的话，
        //按说只能放进去1个。（HashSet集合特点：无序不可重复）
        /*Set<student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students.size());*///这个结果应该是1，但结果是2，显然不符合HashSet集合存储特点

        //重写hashCode方法之后
        System.out.println("student1的hashCode="+student1.hashCode());
        System.out.println("student2的hashCode="+student2.hashCode());
        Set<student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students.size());
    }
}
class student{
    private String name;

    public student(String name) {
        this.name = name;
    }

    public student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}