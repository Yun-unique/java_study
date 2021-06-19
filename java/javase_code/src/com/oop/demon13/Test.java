package com.oop.demon13;

//面向对象思想
public class Test {
    public static void main(String[] args) {
        //没有名字初始化类，不用将实例保存到变量中
        new Apple().eat();

        /*UserService userService = new UserService() {
            @Override
            public void hello() {

            }
        };*/
    }
}

class Apple{
    public void eat(){

    }
}

interface UserService{
    void hello();
}
