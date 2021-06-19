package day13jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection:�ӿ� �ӿ��ڴ����������ʹ��ʵ���� ʵ���ࣺArrayList Collection���ص� ���� û��ֱ�ӻ��Ԫ�صķ��� ��Ψһ��
 * ���ظ�������
 * 
 * @author fan
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		// int ���ڻ�����������û�м̳�Object
		// Object��������ĸ���
		Collection<Object> collection = new ArrayList<>();
		// 1.1.add��ӹ涨����
		int a = 10;
		collection.add(a);// ��װ��
		collection.add("1");
		collection.add(1.0);
		collection.add(true);
		System.out.println(collection);
		// 1.2 addAll(Collection<? extends E> c)
		collection.addAll(collection);
		System.out.println(collection);
		Collection<Object> collection2 = new ArrayList<>();
		collection2.add(12);
		collection2.add(13);
		collection.addAll(collection2);
		System.out.println(collection);
		// 1.3 �������
		// 1.3.1 ת��������
		Object[] objs = collection.toArray();
		System.out.println(objs[1]);
		// 1.3.2 ʹ�õ�����
		Iterator<Object> objs2 = collection.iterator();
		Object obj = objs2.next();
		System.out.println(obj);
		// 1.4 ���
		collection.clear();
		System.out.println(collection);
		// 1.5 ����
		int size = collection.size();
		System.out.println(size);

	}

}
