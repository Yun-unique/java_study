package day14.listw;

import java.util.LinkedList;


public class TestLinked {
public static void main(String[] args) {
	//链表结构  查询慢 添加删除快
	LinkedList<String> linkedList=new LinkedList();
	linkedList.addFirst("11");
	//链表使用堆栈 stack
	linkedList.peek();
	linkedList.push("11");
	//队列queue
	linkedList.poll();
	linkedList.element();
	
	
}
}
