package day12.finals;

/**
 * 2.���η����� �������ܱ���д
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
