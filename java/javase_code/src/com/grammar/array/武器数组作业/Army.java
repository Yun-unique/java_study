package com.grammar.array.武器数组作业;
/*
军队
 */
public class Army {
    //武器数组
    private Weapon[] weapons;

    /**
     * 创建军队的构造方法
     * @param count 武器的数量
     */
    public Army(int count){
        //动态初始化中每一个元素默认值为null，武器数组中还没有加入武器
        weapons = new Weapon[count];
    }

    public void addWeapon(Weapon weapon) throws AddWeaponException {
        for (int i = 0; i < weapons.length; i++) {
            if (null == weapons[i]){
                weapons[i] = weapon;
                System.out.println(weapon+"武器添加成功");
                return;
            }
        }
        throw new AddWeaponException("武器数量已达到上限！");
    }

    /*
    所有可攻击的攻击
     */
    public void attackAll(){
        //遍历数组
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Shootable){
                //调用子类特有的方法，向下转型
                Shootable shootable = (Shootable)weapons[i];
                shootable.shoot();
            }
        }
    }

    /*
    所有可移动的移动
     */
    public void moveAll(){
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Moveable){
                Moveable moveable = (Moveable)weapons[i];
                moveable.move();
            }
        }
    }

}
