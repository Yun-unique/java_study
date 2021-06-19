package 实训.作业.作业8.饲养员喂食;

public class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void feeding(Animal animal,Food food){
        System.out.println("饲养员"+this.name+"喂"+animal.name+"吃"+food.name);
        animal.eat(food);
    }
}
