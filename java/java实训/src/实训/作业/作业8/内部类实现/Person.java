package 实训.作业.作业8.内部类实现;

public class Person {
    public class Heart{
        public void beat(){
            System.out.println("心脏持续跳动");
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person.Heart ph = person.new Heart();
        ph.beat();
    }
}
