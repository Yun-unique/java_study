package 实训.作业.作业8.饲养员喂食;

public class Application {
    public static void main(String[] args) {
        Animal animal = new Animal("熊猫");
        Animal animal1 = new Animal("兔子");
        Food food = new Food("竹子");
        Food food1 = new Food("胡萝卜");
        Person person = new Person("小张");
        person.feeding(animal,food);
        person.feeding(animal1,food1);
    }
}
