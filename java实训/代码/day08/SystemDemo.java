package day08;

import java.util.Arrays;
import java.util.Date;

public class SystemDemo {
	public SystemDemo() {
		init2();
	}

	private void init1() {
		// 获取当前时间毫秒值
//		System.out.println(System.currentTimeMillis());
      //系统的执行时间
		long  curr=System.currentTimeMillis();	
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
			
		}
		long end=System.currentTimeMillis();
		System.out.println(end-curr);
	}

	private void init2() {
		int[] src = new int[] { 1, 2, 3, 4, 5 };
		int[] dest = new int[] { 6, 7, 8, 9, 10 };
		System.arraycopy(src, 0, dest, 2, 3);
		/*
		 * 代码运行后：两个数组中的元素发生了变化 src数组元素[1,2,3,4,5] dest数组元素[1,2,3,9,10]
		 */
		System.out.println(Arrays.toString(dest));

	}

	public static void main(String[] args) {
		new SystemDemo();
	}
}
