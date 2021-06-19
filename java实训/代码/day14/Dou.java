package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dou {
	// 排序----map集合 key可以自动排序 set
	// 1.组合牌
	// 2.洗牌
	// 3.发牌
	// 4.排序
	// 5.出牌
	Map<Integer, String> pokerBox = new HashMap<>();
	List<Integer> keys = new ArrayList<>();

	public Dou() {
		init1();// 组合牌
//		System.out.println(this.pokerBox);
		init2();// 洗牌
//		System.out.println(this.keys);
		init3();// 发牌
		System.out.println(this.play1);
		System.out.println(this.play2);
		System.out.println(this.play3);
		System.out.println(this.dipai);
	}

	List<Integer> play1 = new ArrayList<>();
	List<Integer> play2 = new ArrayList<>();
	List<Integer> play3 = new ArrayList<>();
	List<Integer> dipai = new ArrayList<>();

	private void init3() {
		for (int i = 0; i < this.keys.size(); i++) {
			Integer no = this.keys.get(i);// 牌对应的编号
           if(i>=51) {
        	   this.dipai.add(no);
           }else if(i%3==1) {
        	   this.play1.add(no);
           }else if(i%3==2) {
        	   this.play2.add(no);
           }else if(i%3==0) {
        	   this.play3.add(no);
           }
		}
	}

	private void init2() {
		Set<Integer> keys = this.pokerBox.keySet();
		this.keys.addAll(keys);
		for (int i = 0; i < 10; i++) {
			Collections.shuffle(this.keys);
		}

	}

	private void init1() {

		ArrayList<String> numbers = new ArrayList();
		for (int i = 3; i < 11; i++) { // 3-10
			numbers.add(i + "");
		}
		Collections.addAll(numbers, "J", "Q", "K", "A", "2");
		// System.out.println(numbers);
		ArrayList<String> colors = new ArrayList();
		colors.add("♦");
		colors.add("♥");
		colors.add("♣");
		colors.add("♠");
		// System.out.println(colors);
		int count = 0;
		for (String number : numbers) {
			for (String color : colors) {
				String card = color + number;
				this.pokerBox.put(count++, card);
			}
		}
		this.pokerBox.put(count++, "小☺");
		this.pokerBox.put(count++, "大☠");
	}

	public static void main(String[] args) {
		new Dou();
	}

}
