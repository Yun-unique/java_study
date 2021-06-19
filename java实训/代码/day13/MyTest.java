package day14;

/**
 * 2.在类中使用泛型
 * @author fan
 *
 * @param <T>
 */
public class MyTest<T> {
	private T t;

	public void setT(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}
	public void eat(T t) {
		System.out.println("eat:"+t.getClass());

	}
	
}
