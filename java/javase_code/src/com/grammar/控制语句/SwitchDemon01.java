package com.grammar.控制语句;

public class SwitchDemon01 {
    public static void main(String[] args) {
        //case穿透  //switch匹配一个具体的值
        char grade = 'B';

        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;//可选
            case 'B':
                System.out.println("良好");
            case 'C':
                System.out.println("及格");
            case 'D':
                System.out.println("再接再厉");
            case 'E':
                System.out.println("挂科");
            default:
                System.out.println("未知等级");
        }
    }
}
