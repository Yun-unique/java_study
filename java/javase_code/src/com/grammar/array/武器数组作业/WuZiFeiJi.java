package com.grammar.array.武器数组作业;
/*
物资运输机，可移动，不能射击
 */
public class WuZiFeiJi extends Weapon implements Moveable{
    @Override
    public void move() {
        System.out.println("物资机起飞");
    }
}
