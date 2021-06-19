package com.集合.Map.SortedMap;

import java.util.TreeSet;
/*
* 自定以类型实现Comparable接口
* */
public class TreeSetTest04 {
    public static void main(String[] args) {
        Customer c1 = new Customer(32);
        Customer c2 = new Customer(20);
        Customer c3 = new Customer(30);
        Customer c4 = new Customer(25);

        //创建TreeSet集合
        TreeSet<Customer> customers = new TreeSet<>();
        //添加元素
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);

        //遍历
        for (Customer c:customers){
            System.out.println(c);
        }
    }

}
//放在TreeSet集合中的元素需要实现java.lang.Comparable接口
//并且实现comparableTo方法，equals方法可以不写，需要重写toString方法。
class Customer implements Comparable<Customer>{
    int age;

    public Customer(int age) {
        this.age = age;
    }

    //需要在这个方法中编写比较的逻辑，或者说比较的规则，按照什么进行比较？
    @Override
    public int compareTo(Customer customer) {
        return this.age-customer.age;//这里按照年龄升序
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                '}';
    }
}
