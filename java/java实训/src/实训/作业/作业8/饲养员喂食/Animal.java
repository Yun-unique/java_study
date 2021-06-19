package 实训.作业.作业8.饲养员喂食;

public class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat(Food food){
        System.out.println(this.name+"开始吃"+food.name);
    }
}
