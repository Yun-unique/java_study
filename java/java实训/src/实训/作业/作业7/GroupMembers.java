package 实训.作业.作业7;

import java.util.ArrayList;
import java.util.Random;

public class GroupMembers extends Person{
    public GroupMembers() {
    }

    public GroupMembers(String name, double balance) {
        super(name, balance);
    }
    //抢红包
    public void grabRedEnvelop(ArrayList<Double> arrayList){
        int index = new Random().nextInt(arrayList.size());
        //arrayList.remove(index);
        super.setBalance(super.getBalance()+arrayList.remove(index));
    }
}
