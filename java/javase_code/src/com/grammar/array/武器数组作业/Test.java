package com.grammar.array.武器数组作业;
/*
题目：
写一个类Army，代表一支军队，这个类有一个属性Weapon数组w（用来存储该军队所拥有的所有武器），
该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量，
并用这一大小来初始化数组

该类还提供一个方法addWeapon(Weapon wa)，表示把参数wa所代表的武器加入到数组w中，
在这个类中还定义两个方法attackAll()，让w数组中的所有武器攻击：
以及moveAll()让w数组中的所有可移动的武器移动

提示：
    Weapon是一个父类，有许多子类武器。这些子武器应该有的是可移动的，有些是可攻击的
    还有既可以移动又能攻击的。
 */
public class Test {
    public static void main(String[] args) {
        //创建一个军队
        Army army = new Army(4);//军队武器为4
        //创建武器对象
        Tank tank = new Tank();
        Fighter fighter = new Fighter();
        Fighter fighter2 = new Fighter();
        GaoShePao gaoShePao = new GaoShePao();
        WuZiFeiJi wuZiFeiJi = new WuZiFeiJi();
        //添加武器
        try {
            army.addWeapon(wuZiFeiJi);
            army.addWeapon(tank);
            army.addWeapon(fighter);
            army.addWeapon(gaoShePao);
            army.addWeapon(fighter2);
        } catch (AddWeaponException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        //让所有可移动的移动
        army.moveAll();

        //让所有可攻击的攻击
        army.attackAll();
    }
}
