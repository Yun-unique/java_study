package com.IO流.标准输出流.日志工具;
/*
* 日志工具类测试
* */
public class LogTest {
    public static void main(String[] args) {
        //测试日志工具类
        Logger.log("调用了System类的gc()方法，建议启动垃圾回收");
        Logger.log("调用了UserService的doSome()方法");
        Logger.log("用户尝试进行登入，验证失败！");
    }
}
