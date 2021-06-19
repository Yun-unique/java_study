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
		// 先进后出--struts2  
		String v=stack.peek();//查看最后一个元素
		System.out.println(v);
		String val = stack.pop();//删除最后一个元素
		System.out.println(val);
		System.out.println(stack);
		val = stack.pop();
		System.out.println(val);
		System.out.println(stack);
		

	}
}
