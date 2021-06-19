package day15.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
	public static void main(String[] args) {
		// 统计字数
		System.out.println("输入字符串");
		// String line = new Scanner(System.in).nextLine();
		String line = "abcdf eab";
		Map<Character, Integer> map = findChar(line);// 统计字符的个数
		System.out.println(map);
	}

	private static Map<Character, Integer> findChar(String line) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);// 获得每一个字符
			if (map.containsKey(c)) {
				Integer count = map.get(c);
				map.put(c, ++count);
			} else {
				map.put(c, 1);
			}
		}
		return map;

	}
}
