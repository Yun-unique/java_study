package com.多线程.f线程安全.synchronized的理解;

public class AccountThread extends Thread{
    private Account act;
    public AccountThread(Account act) {
        this.act = act;
    }
    @Override
    public void run() {
        double money = 5000;
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName()+"对"+act.getActno()+"取款"+money+"成功，余额："+act.getBalance());
    }
}
