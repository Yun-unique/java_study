package com.grammar.array.武器数组作业;
/*
高射炮，是武器，可射击，不能移动
 */
public class GaoShePao extends Weapon implements Shootable{

    @Override
    public void shoot() {
        System.out.println("高射炮开炮");
    }
}
