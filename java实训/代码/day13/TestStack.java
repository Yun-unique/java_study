package day14.shuju;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		System.out.println(stack.isEmpty());
		stack.push("12");
		stack.push("12");
		stack.push("11");
		stack.push("13");
		System.out.println(stack);
		// �Ƚ����--struts2  
		String v=stack.peek();//�鿴���һ��Ԫ��
		System.out.println(v);
		String val = stack.pop();//ɾ�����һ��Ԫ��
		System.out.println(val);
		System.out.println(stack);
		val = stack.pop();
		System.out.println(val);
		System.out.println(stack);
		

	}
}
