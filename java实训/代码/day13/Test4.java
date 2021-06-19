package day14;

import java.util.ArrayList;
import java.util.Collection;
/**
 * 高级泛型
 * ?表示通配符
 * ? extends Number
 * ? super Number
 * @author fan
 *
 */
public class Test4{
	public static void main(String[] args) {
		Collection<Integer> collection=new ArrayList();
		getElement(collection);
		getElement2(collection);
//		getElement3(collection);
		Collection<String> collection2=new ArrayList();
		getElement(collection2);
//		getElement2(collection2);
		Collection<Number> num=new ArrayList();
		getElement(num);
		getElement2(num);
		getElement3(num);
		Collection num2=new ArrayList();//Object
		getElement(num2);
		getElement3(num2);
		
	}
	public static void getElement(Collection<?> t) {
		System.out.println(t.getClass());
	}
	public static void getElement2(Collection<? extends Number> t) {
		System.out.println("getElement2="+t.getClass());
	}
	public static void getElement3(Collection<? super Number> t) {
		System.out.println("getElement2="+t.getClass());
	}
	

}
