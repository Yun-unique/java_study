package com.异常.测试;
/*
自定义异常类：
 */
public class IllegalNameException extends Exception {
    public IllegalNameException() {
    }

    public IllegalNameException(String message) {
        super(message);
    }
}
