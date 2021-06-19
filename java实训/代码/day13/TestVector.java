package day14.listw;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		List<String> list = List.of("1", "2", "3", "4");
		Vector<String> strings = new Vector(list);
		System.out.println(strings);
		strings.add("2");
		System.out.println(strings);

	}
}
