package com.常用类.枚举;

public class SwitchTest {
    public static void main(String[] args) {
        //switch语句支持枚举类型
        /*
        * 低版本的JDK，只支持int
        * 高版本的JDK，支持int、String、枚举。
        * byte short char也可以，存在自动类型转换*/
        switch (Season.AUTUMN) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}
enum Season {
    SPRING,SUMMER,AUTUMN,WINTER
}
enum Color {
    RED,BLUE,GREEN,YELLOW
}
