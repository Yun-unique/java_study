package day13jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList();
		collection.add("1");
		collection.add("2");
		collection.add("3");
		System.out.println(collection);
		int size = collection.size();
		System.out.println(size);
		Iterator<String> iterator = collection.iterator();
		//1. hasNext
//		cursor != size; size=3������Ԫ�صĸ���
				// cursor=0
		Boolean flag = iterator.hasNext();
		
		//2.ÿ�ε���next��cursor+=1;
		//sr  �Ǵ�������ֱ�ӻ��Ԫ��
//		String sr = iterator.next();
//		System.out.println(sr);
//		sr = iterator.next();
//		System.out.println(sr);
//		sr = iterator.next();
//		System.out.println(sr);
//		sr = iterator.next();
//		System.out.println(sr);
//		 iterator.next();
		 iterator.remove();//ȷ��ɾ�����±�
		 System.out.println(collection);
		

	}
}
