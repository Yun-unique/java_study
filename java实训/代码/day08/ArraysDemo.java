package day08;

import java.util.Arrays;

import day04.ArrayDemo;

public class ArraysDemo {
	public ArraysDemo() {
		test3();
	}
   int size=0;
	// ����ָ��������
	private void test3() {
		apopend(1);
		apopend(2);
		apopend(3);
		apopend(4);
		apopend(5);
		System.out.println(Arrays.toString(arr));
		System.out.println(size);//����ĳ���
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
			//����
			arr=Arrays.copyOf(arr, arr.length+1);
			index=arr.length-1;
		}
		size=index+1;
		// ȷ��λ��--˳�����
		arr[index]=value;
		

	}
	private void test31() {
		arr[0]=12;
		arr[11]=11;
		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr,1,11,1);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	

	// ��ָ���� int �����鰴���������������
	private void test2() {
		int[] arr = { 24, 7, 5, 48, 4, 46, 35, 11, 6, 2 };
		System.out.println("����ǰ:" + Arrays.toString(arr));
		// ����ǰ:[24, 7, 5, 48, 4, 46, 35, 11, 6, 2]// ��������
		Arrays.sort(arr);
		System.out.println("�����:" + Arrays.toString(arr));
		// �����:[2, 4, 5, 6, 7, 11, 24, 35, 46, 48]
	}

	// ����ָ���������ݵ��ַ�����ʾ��ʽ��
	private void test1() {
		// ����int ����
		int[] arr = { 2, 34, 35, 4, 657, 8, 69, 9 };
		// ��ӡ����,�����ֵַ
		System.out.println(arr); // [I@2ac1fdc4
		// ��������תΪ�ַ���
		String s = Arrays.toString(arr); // ��ӡ�ַ���,�������
		System.out.println(s); // [2, 34, 35, 4, 657, 8, 69, 9]
	}

	public static void main(String[] args) {
		new ArraysDemo();
	}
}
