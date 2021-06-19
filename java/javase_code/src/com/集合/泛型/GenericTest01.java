package com.集合.泛型;

import com.oop.demon07.B;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1、JDK5.0之后推出的新特性：泛型
2、泛型这种机制，只在程序编译阶段起作用，只是给编译器参考的。（运行阶段泛型不起作用）
3、使用泛型的好处:
    第一：集合中存储的元素类型统一了
    第二：从集合中取出的元素类型是泛型指定的类型，不需要进行大量的“向下转型”
4、泛型的缺点：
    导致集合中存储的元素缺乏多样性
 */
public class GenericTest01 {
    public static void main(String[] args) {
       /* //不使用泛型机制，分析程序存在缺点
        List myList = new ArrayList();
        //准备对象
        Cat c = new Cat();
        Bird b = new Bird();
        //将对象添加到集合当中去
        myList.add(c);
        myList.add(b);

        //遍历集合，取出每个Animal，让它move
        Iterator it = myList.iterator();
        while(it.hasNext()){
            //没有这个语法，通过迭代器取出的就是Object
            //Animal a = it.next();

            Object object = it.next();
            //object中没有move方法，无法调用，需要向下转型
            if (object instanceof Animal){
                Animal a = (Animal)it.next();
                a.move();
            }
        }*/

        //使用JDK5之后的泛型机制
        //使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据
        //用泛型来指定集合中存储的数据类型
        List<Animal> animalList = new ArrayList<Animal>();
        Cat cat = new Cat();
        Bird bird = new Bird();

        //指定List集合中只能存储Animal，那么存储String就会编译报错了
        //animalList.add("123");

        animalList.add(cat);
        animalList.add(bird);
        //这个迭代器迭代的是Animal类型
        Iterator<Animal> animalIterator = animalList.iterator();
        while(animalIterator.hasNext()){
            //使用泛型机制之后，每一次迭代返回的数据都是Animal类型
            /*Animal a = animalIterator.next();
            a.move();*/

            //调用子类特有的方法还是需要向下转型的
            Animal a = animalIterator.next();
            if (a instanceof Cat){
                Cat cat1 = (Cat)a;
                cat1.catchMouse();
            }
            if (a instanceof Bird){
                Bird bird1 = (Bird)a;
                bird1.fly();
            }
        }

    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿在飞翔");
    }
}