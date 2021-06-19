package day08;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
	public DouDiZhu() {
		init1();// 生成牌
		System.out.println(pokbox);	
		//操作集合的类
		for (int i = 0; i < 10; i++) {
			Collections.shuffle(pokbox);
		}
		
//		init2();//发牌
		init3();//发牌

	}
	 private void init3() {
	    	ArrayList<String> play1=new ArrayList<>();	
	      	ArrayList<String> play2=new ArrayList<>();	
	      	ArrayList<String> play3=new ArrayList<>();	
	      	ArrayList<String> dipai=new ArrayList<>();	
			//发牌
	      	for(int i=0;i<pokbox.size();i++) {
	      		String card=pokbox.get(i);
	      		if(i<17) {
	      			play1.add(card);
	      		}else if(i<34) {
	      			play2.add(card);
	      		}else if(i<51) {
	      			play3.add(card);
	      		}else {
	      			dipai.add(card);
	      		}
	      		
	      	}
	      	System.out.println(dipai);
	    	System.out.println(play1);
	    	System.out.println(play2);
	    	System.out.println(play3);
	      	
	      	
		}
    private void init2() {
    	ArrayList<String> play1=new ArrayList<>();	
      	ArrayList<String> play2=new ArrayList<>();	
      	ArrayList<String> play3=new ArrayList<>();	
      	ArrayList<String> dipai=new ArrayList<>();	
		//发牌
      	for(int i=0;i<pokbox.size();i++) {
      		String card=pokbox.get(i);
      		if(i>50) {
      			dipai.add(card)	;
      		}else if(i%3==0) {
      			play1.add(card);
      		}else if(i%3==1) {
      			play2.add(card);
      		}else if(i%3==2) {
      			play3.add(card);
      		}
      		
      	}
      	System.out.println(dipai);
    	System.out.println(play1);
    	System.out.println(play2);
    	System.out.println(play3);
      	
      	
	}
	ArrayList<String> pokbox=new ArrayList<>();
	private void init1() {
		// 54张牌 4种花色+10个数字+三个字母
		ArrayList<String> colors = new ArrayList<>();
		colors.add("♦");
		colors.add("♥");
		colors.add("♣");
		colors.add("♠");		
		ArrayList<String> numbers=new ArrayList<>();
		for (int i = 2; i < 11; i++) {
			numbers.add(i+"");
		}
		numbers.add(0,"A");	
		numbers.add("J");
		numbers.add("Q");
		numbers.add("K");
		pokbox.add("大☠");
		pokbox.add("小☺"); 
		for(String number:numbers) {
			for(String color:colors) {
				pokbox.add(color+number);
			}
		}
		
		

	}

	/**
	 * colors.add("♥"); colors.add("♦"); colors.add("♠"); colors.add("♣");
	 * pokerBox.add("小☺"); pokerBox.add("大☠");
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new DouDiZhu();
	}

}
