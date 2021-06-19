package day15.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
	public static void main(String[] args) {
		// ͳ������
		System.out.println("�����ַ���");
		// String line = new Scanner(System.in).nextLine();
		String line = "abcdf eab";
		Map<Character, Integer> map = findChar(line);// ͳ���ַ��ĸ���
		System.out.println(map);
	}

	private static Map<Character, Integer> findChar(String line) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);// ���ÿһ���ַ�
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
