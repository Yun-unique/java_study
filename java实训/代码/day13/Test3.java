package day14;
/**
 * 3.在方法中使用泛型
 * @author fan
 *
 */
public class Test3 {
	public <MPV>void eat(MPV mpv) {
           System.out.println(mpv.getClass());
	}
	public <MPV>MPV play(MPV mpv) {
        System.out.println(mpv.getClass());
        return mpv;
	}
	
	public static void main(String[] args) {
		Test3 test3=new Test3();
		test3.eat("");
		test3.eat(1);
		
	}
}
