package com.多线程.f线程安全.线程安全_不使用线程同步机制;
/*
* 银行账户
*   不使用线程同步机制，多线程对同一个账户进行取款，出现线程安全问题
* */
public class Account {
    //账号
    private String actno;
    //余额
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

    //取款方法
    public void withdraw(double money){
        //t1和t2并发执行这个方法。（t1和t2是两个栈，两个栈操作堆中同一个对象）
        //取款之前的余额
        double balance = this.getBalance();

        //在这里模拟以下网络延迟，100%出问题
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //取款之后的余额
        //更新余额
        //思考：t1执行到这里，但还没有来得及执行这行代码，t2线程进来执行withdraw方法了。此时一定出现问题。
        this.setBalance(balance-money);
    }
}
