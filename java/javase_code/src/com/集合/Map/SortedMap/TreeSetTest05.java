package com.集合.Map.SortedMap;

import java.util.TreeSet;

/*
* 先按照年龄升序，如果年龄一样再按照姓名升序
* */
public class TreeSetTest05 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();
        vips.add(new Vip("zhangsi",20));
        vips.add(new Vip("zhangsan",20));
        vips.add(new Vip("king",18));
        vips.add(new Vip("jack",17));
        for (Vip v : vips){
            System.out.println(v);
        }
    }
}
class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Vip vip) {
        if (this.age == vip.age){
            //年龄相同时按照名字排序
            //姓名是String类型，可以直接比，调用compareTo方法来完成比较。
            return this.name.compareTo(vip.name);
        }else{
            //年龄不一样按年龄排
            return this.age-vip.age;
        }
    }
}