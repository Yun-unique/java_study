package 实训.作业.作业6;

import java.util.ArrayList;
import java.util.Collections;

public class douDiZhu{
    //构造函数初始化
    public douDiZhu() {
        init1();
        System.out.println(poxBox);//生成牌
        Collections.shuffle(poxBox);
        System.out.println(poxBox);//洗牌
        init2();
    }
    //生成牌
    //扑克牌共54张，4种花色，9个数字（2-10）+4个字母（A，J，Q，K）+大小王各1张
    ArrayList<String> poxBox = new ArrayList<>();
    public void init1(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("♦");
        colors.add("♥");
        colors.add("♣");
        colors.add("♠");
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 2; i < 11; i++) {
            numbers.add(i+"");
        }
        numbers.add("A");
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        poxBox.add("☠");
        poxBox.add("☺");
        for (String number:numbers){
            for (String color:colors){
                poxBox.add(color+number);
            }
        }
    }
    //发牌
    public void init2(){
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> bottomCard = new ArrayList<>();
        for (int i = 0; i < poxBox.size() ; i++) {
            String card = poxBox.get(i);
            if (i>50){
                bottomCard.add(card);
            }else if (i%3==0){
                player1.add(card);
            }else if (i%3==1){
                player2.add(card);
            }else if (i%3==2){
                player3.add(card);
            }
        }
        System.out.println(bottomCard);
        System.out.println("玩家1发的牌："+player1);
        System.out.println("玩家2发的牌："+player2);
        System.out.println("玩家3发的牌："+player3);
    }
    public static void main(String[] args) {
        new douDiZhu();
    }
}

