package com.集合.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
测试contains方法
测试remove方法
总结：存放在一个集合中的类型，一定要重写equals方法
 */

public class CollectionTest05 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();
        //创建用户对象
        User user1 = new User("jack");
        User user2 = new User("jack");

        //加入集合
        c.add(user1);
        //判断集合中是否包含user2
        //System.out.println(c.contains(user2));//User中没重写equals方法为false
        System.out.println(c.contains(user2));

        Integer x = new Integer(1000);
        c.add(x);
        Integer y = new Integer(1000);
        System.out.println(c.contains(y));//true,Integer类中的equals方法重写了，比较的是内容

        Collection c1 = new ArrayList();
        String s1 = new String("hello");
        c.add(s1);
        String s2 = new String("hello");
        c1.remove(s2);//s2.equals(s1) java认为s1和s2是一样的。删除s2就是删除s1
        System.out.println(c1.size());//0，remove方法中也重写了equals方法
    }
}

class User{
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public boolean equals(Object o){
        if (o == null || !(o instanceof User)) return false;
        if (o == this) return true;
        User u = (User)o;
        return u.name.equals(this.name);
    }

}