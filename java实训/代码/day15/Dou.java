package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Dou {
	// 排序----map集合 key可以自动排序 set
	// 1.组合牌
	// 2.洗牌
	// 3.发牌
	// 4.看牌
	// 4.排序
	// 5.出牌
	private Map<Integer, String> pokerBox = new HashMap<>();
	private List<Integer> keys = new ArrayList<>();
	private Integer id; //确定出牌人
	private int count = 0;

	public Dou() {
		init1();// 组合牌
		// System.out.println(this.pokerBox);
		init2();// 洗牌
		// System.out.println(this.keys);
		init3();// 发牌
		// System.out.println(this.play1);
		// System.out.println(this.play2);
		// System.out.println(this.play3);
		// System.out.println(this.dipai);
		init4();// 看牌
		init5(); // 排序
		// System.out.println(play1);
		init4();// 看牌
		// System.out.println(playval1);
		// System.out.println(playval2);
		// System.out.println(playval3);
		init6();// 确定叫牌
		System.out.println(id);
//		init71();
		init7();// 确定地主
		init5(); // 排序
		init4();// 看牌
		init8();//出牌
		
		System.out.println(playval1);
		System.out.println(playval2);
		System.out.println(playval3);
		System.out.println(count);
	}
     //定义临时牌的集合
	List<Integer> temp=new ArrayList<>();
	private void init8() {
		id=0;
		a:while(true) {
			//确定完成
			id+=1;
			id%=3;
			System.out.print(id+1);
			//0：paly1 1:play2 2:play3 
			System.out.println("出牌");
			int index=-1;
			int  tempindex=0;
			if(temp.size()>0) {
				temp.get(0);
			}
			
			if(id==0) {
				
//				System.out.println(play1);
				System.out.println(playval1);
				System.out.println("0:不出；1：出牌");
				int no=sc.nextInt(); //0: 1:
				if(no==0) {
					 continue a;
				}
				 //判断牌大于临时牌
				
				while(index<tempindex) {
					String card=sc.next();
					System.out.println(card);
					index=playval1.indexOf(card);
				}
				playval1.remove(index);
				
			}else if(id==1) {
				System.out.println("0:不出；1：出牌");
				int no=sc.nextInt(); //0: 1:
				if(no==0) {
					 continue a;
				}
				System.out.println(playval2);	
				 //判断牌大于临时牌
				while(index<tempindex) {
					String card=sc.next();
					System.out.println(card);
					index=playval2.indexOf(card);
			
				}
				playval2.remove(index);
			}else if(id==2) {
				System.out.println(playval3);
				System.out.println("0:不出；1：出牌");
				int no=sc.nextInt(); //0: 1:
				if(no==0) {
					 continue a;
				}
				 //判断牌大于临时牌
				while(index<tempindex) {
					String card=sc.next();
					System.out.println(card);
					index=playval3.indexOf(card);
				}
				playval3.remove(index);
			}	
			temp.add(index);
			
		}
		
		
	}

	Scanner sc = new Scanner(System.in);

	private void init71() {
		int num = 1;
		while (num == 1&&count<3) {
			System.out.println(id%3+1 + "叫牌"); //
			num = sc.nextInt();// 1 叫牌 0： 不叫
			if(num==1) {
				return;
			}
			num += 1;
			count++;
			id++;
			id%=3;
		}
		System.out.println(id);
	}

	private void init7() {
		// 从底牌的集合中拿出给玩家
		for (Integer no : dipai) {
			if (id == 0) {
				play1.add(no);
			} else if (id == 1) {
				play2.add(no);
			} else if (id == 2) {
				play3.add(no);
			}

		}

	}

	private void init6() {
		Random random = new Random();
		// 生成不包含底牌的权数
		int i = random.nextInt(54);// 0-53
		System.out.println(i);
		while (dipai.contains(i)) {
			i = random.nextInt(54);
		}

		if (play1.contains(i)) {
			id = 0;
		} else if (play2.contains(i)) {
			id = 1;
		} else if (play3.contains(i)) {
			id = 2;
		}
	}

	private void init5() {
		Collections.sort(play1);
		Collections.sort(play2);
		Collections.sort(play3);

	}

	List<String> playval1 = new ArrayList<>();
	List<String> playval2 = new ArrayList<>();
	List<String> playval3 = new ArrayList<>();

	private void init4() {
		playval1 = new ArrayList<>();
		playval2 = new ArrayList<>();
		playval3 = new ArrayList<>();
		for (Integer no : play1) {
			String card = pokerBox.get(no);
			playval1.add(card);
			// System.out.println(playval1);
		}
		for (Integer no : play2) {
			String card = pokerBox.get(no);
			playval2.add(card);
			// System.out.println(playval2);
		}
		for (Integer no : play3) {
			String card = pokerBox.get(no);
			playval3.add(card);
			// System.out.println(playval1);
		}
	}

	List<Integer> play1 = new ArrayList<>();
	List<Integer> play2 = new ArrayList<>();
	List<Integer> play3 = new ArrayList<>();
	List<Integer> dipai = new ArrayList<>();

	private void init3() {
		for (int i = 0; i < this.keys.size(); i++) {
			Integer no = this.keys.get(i);// 牌对应的编号
			if (i >= 51) {
				this.dipai.add(no);
			} else if (i % 3 == 1) {
				this.play1.add(no);
			} else if (i % 3 == 2) {
				this.play2.add(no);
			} else if (i % 3 == 0) {
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
