package day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ShuangSe {
	static int buys[]=new int[7];
	public static void buy() {
		/**
		 * red:6  1-33
		 * blue:1 1-12
		 */
    Scanner scanner=new Scanner(System.in);
    for (int i = 0; i < 6; i++) {
    	System.out.print("第"+(i+1)+"个球：");
    	int qiu=scanner.nextInt();
    	if(qiu<0||qiu>33) {
    		i--;
    		continue;
    	}
    	//判断输入的数字重复
    	for(int j=0;j<=i;j++) {
    		if(qiu==buys[j]) {
    			i--;  //原来的位置添加
    			break;
    		}
    	}	
    	buys[i]=qiu;
	}
    System.out.print("blue：");
    int qiu=scanner.nextInt();
    while(qiu<0||qiu>12) {
    	qiu=scanner.nextInt();		
	}
	buys[6]=qiu;
	Arrays.sort(buys,0,6);

	}
	static int sui[]=new int[7];
	public static void suiji() {
		//生成球 随机数字
		Random random=new Random();
		//nextInt(33)  0-32
		//nextInt(33)+1  1-33
		int qiu=random.nextInt(33)+1;
	  
		
		
	}
	public static void zhongjiang() {
	    //6+1
	    //6+0
		//5+1
		//5+0 4+1
		//4+0 3+1
		
	}
	
	public static void main(String[] args) {
		buy();
		System.out.println(Arrays.toString(buys));
//		suiji();
//		System.out.println(Arrays.toString(sui));
		
	}
}
