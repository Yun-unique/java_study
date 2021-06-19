package 实训.作业.作业7;

public class Person {
    private String name;
    private double balance;

    public Person() {
    }

    public Person(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void show(){
        System.out.println(this.name+"余额："+this.balance+"元");
    }
}
