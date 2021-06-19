package com.异常.测试;

public class Test {
    public static void main(String[] args) {
        //创建userService对象
        UserService userService = new UserService();
        try {
            userService.register("jack","123");
        } catch (IllegalNameException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
