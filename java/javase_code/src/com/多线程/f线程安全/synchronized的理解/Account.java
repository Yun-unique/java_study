package com.多线程.f线程安全.synchronized的理解;
public class Account {
    private String actno;
    private double balance;
    public Account() {
    }
    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }
    public String getActno() {
        return actno;
    }
    public void setActno(String actno) {
        this.actno = actno;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
    * 在实例方法上可以使用synchronized吗？可以的
    *   synchronized出现在实例方法上，一定所的是this，不能是其它的对象
    *   所以这种方式不灵活。
    *
    * 另外还有一个缺点：synchronized出现在实例方法上，表示整个方法体都需要同步
    * 可能会无故扩大同步的范围，导致程序的执行效率变低。所以这种方式不常用。
    *
    * synchronized使用在实例方法上有什么优点？
    *   代码写的少了，节俭了。
    * 如果共享的对象就是this，并且需要同步的代码块是整个方法体，建议使用这种方式。
    * */
    public synchronized void withdraw(double money){
        synchronized (this){
            double balance = this.getBalance();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(balance-money);
        }
    }
}
