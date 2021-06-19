package day08;

import java.util.Arrays;

import day04.ArrayDemo;

public class ArraysDemo {
	public ArraysDemo() {
		test3();
	}
   int size=0;
	// 复制指定的数组
	private void test3() {
		apopend(1);
		apopend(2);
		apopend(3);
		apopend(4);
		apopend(5);
		System.out.println(Arrays.toString(arr));
		System.out.println(size);//数组的长度
	}
	int[] arr = new int[3];
	private void apopend(int value) {
		int index=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			//复制
			arr=Arrays.copyOf(arr, arr.length+1);
			index=arr.length-1;
		}
		size=index+1;
		// 确定位置--顺序添加
		arr[index]=value;
		

	}
	private void test31() {
		arr[0]=12;
		arr[11]=11;
		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr,1,11,1);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	

	// 对指定的 int 型数组按数字升序进行排序
	private void test2() {
		int[] arr = { 24, 7, 5, 48, 4, 46, 35, 11, 6, 2 };
		System.out.println("排序前:" + Arrays.toString(arr));
		// 排序前:[24, 7, 5, 48, 4, 46, 35, 11, 6, 2]// 升序排序
		Arrays.sort(arr);
		System.out.println("排序后:" + Arrays.toString(arr));
		// 排序后:[2, 4, 5, 6, 7, 11, 24, 35, 46, 48]
	}

	// 返回指定数组内容的字符串表示形式。
	private void test1() {
		// 定义int 数组
		int[] arr = { 2, 34, 35, 4, 657, 8, 69, 9 };
		// 打印数组,输出地址值
		System.out.println(arr); // [I@2ac1fdc4
		// 数组内容转为字符串
		String s = Arrays.toString(arr); // 打印字符串,输出内容
		System.out.println(s); // [2, 34, 35, 4, 657, 8, 69, 9]
	}

	public static void main(String[] args) {
		new ArraysDemo();
	}
}
