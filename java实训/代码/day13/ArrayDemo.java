package day14.shuju;

import java.util.ArrayList;

public class ArrayDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList();
		arrayList.add("11");
		arrayList.add("12");
		arrayList.add("13");
		//�����--ÿ��������ݶ��Ḵ�Ƶ��µ�����
		arrayList.add("14");
		//ͨ��ָ��λ�ò���--���ҿ�
		System.out.println(arrayList.get(2));
		
	}

}
