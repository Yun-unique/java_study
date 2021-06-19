package 实训.作业.作业7;

import java.util.ArrayList;
import java.util.Random;

public class GroupLeader extends Person {
    public GroupLeader() {
    }

    public GroupLeader(String name, double balance) {
        super(name, balance);
    }

    //发红包
    public ArrayList<Double> giveRedEnvelop(int money,int num){
        System.out.println(super.getName()+"发红包啦!");
        ArrayList<Double> arrayList = new ArrayList<>();
        if (super.getBalance()<money){
            System.out.println("余额不足！");
            return arrayList;
        }
        super.setBalance(getBalance()-money);
        /*double average = money/num;
        double merchant = money%num;
        for (int i = 0; i < num-1; i++) {
        arrayList.add(average);
        }
        arrayList.add(average+merchant);*/
        int moneyFen = money*100;
        int time = num-1;
        Random random = new Random();
        for (int i = 0; i < time; i++) {
            int moneyGet = random.nextInt(moneyFen/num*2)+1;
            arrayList.add((double)moneyGet/100);
            moneyFen-=moneyGet;
            num--;
        }
        arrayList.add((double)moneyFen/100);
        return arrayList;
    }
}
