package day14.shuju;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		// 队列结构
		Queue<String> queue = new LinkedList();
		queue.add("1");
		queue.add("2");
		queue.add("3"); // 3 2 1
		String value = queue.element();// 获得队头
		System.out.println(value);
		queue.remove();
		value = queue.peek();// 获得不删除
		System.out.println(value);
		System.out.println(queue);
		value = queue.poll();// 删除元素
		System.out.println(value);
		System.out.println(queue);
	}

}
