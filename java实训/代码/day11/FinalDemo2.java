package day12.finals;

/**
 * 2.修饰方法： 方法不能被重写
 * 
 * @author fan
 *
 */
public class FinalDemo2 {
	public final void eat() {
		System.out.println("FinalDemo2 eat");

	}
	public void play() {
	}
}

class FinalDemo3 extends FinalDemo2 {
//	public void eat() {}
	public void play() {
	}
}
