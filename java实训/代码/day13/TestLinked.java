package day14.shuju;

import java.util.LinkedList;

public class TestLinked {
public static void main(String[] args) {
	//链表结构都是使用node节点的形式
	LinkedList<String> linkedList=new LinkedList();
	linkedList.addFirst("1");
	linkedList.addFirst("2");
	linkedList.addFirst("3");
	linkedList.addFirst("4");
	linkedList.addLast("15");
	System.out.println(linkedList);
	
}
}
