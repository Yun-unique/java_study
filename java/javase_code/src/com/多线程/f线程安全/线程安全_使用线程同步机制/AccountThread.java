package com.多线程.f线程安全.线程安全_使用线程同步机制;

public class AccountThread extends Thread{
    //两个线程必须共享同一个账户对象
    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        //run方法的执行表示取款操作
        //假设取款5000
        double money = 5000;
        //取款
        act.withdraw(money);

        /*synchronized (act){//这种方式也可以，只不过扩大了同步的范围，效率更低了
            act.withdraw(money);
        }*/

        System.out.println(Thread.currentThread().getName()+"对"+act.getActno()+"取款"+money+"成功，余额："+act.getBalance());
    }
}
