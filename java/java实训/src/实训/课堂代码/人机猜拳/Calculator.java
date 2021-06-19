package 实训.课堂代码.人机猜拳;

import java.util.Random;

public class Calculator extends Player{
    public Calculator() {

    }

    public Calculator(String name, int count) {
        super(name, count);
    }

    @Override
    public int showFist() {
        Random random = new Random();
        int flag = random.nextInt(3)+1;
        switch (flag){
            case 1:
                System.out.println(getName()+"出拳：剪刀");
                break;
            case 2:
                System.out.println(getName()+"出拳：石头");
                break;
            case 3:
                System.out.println(getName()+"出拳：布");
                break;
        }
        return flag;
    }

}
