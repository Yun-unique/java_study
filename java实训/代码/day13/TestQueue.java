package day14.shuju;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		// ���нṹ
		Queue<String> queue = new LinkedList();
		queue.add("1");
		queue.add("2");
		queue.add("3"); // 3 2 1
		String value = queue.element();// ��ö�ͷ
		System.out.println(value);
		queue.remove();
		value = queue.peek();// ��ò�ɾ��
		System.out.println(value);
		System.out.println(queue);
		value = queue.poll();// ɾ��Ԫ��
		System.out.println(value);
		System.out.println(queue);
	}

}
