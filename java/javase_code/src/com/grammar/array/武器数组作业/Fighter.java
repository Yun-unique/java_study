package com.grammar.array.武器数组作业;
/*
战斗机，可移动，可射击
 */
public class Fighter extends Weapon implements Shootable,Moveable {

    @Override
    public void move() {
        System.out.println("战斗机移动");
    }

    @Override
    public void shoot() {
        System.out.println("战斗机开炮");
    }
}
