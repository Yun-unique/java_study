package day17.file;

import java.io.File;
import java.util.Arrays;

public class DiGuiDemo1 {
	public static void main(String[] args) {
		File file = new File("d:\\daima");
		printFile(file);
		System.out.println(count);
		System.out.println(length);
	}

	private static int count = 0;
	static long length = 0;

	private static void printFile(File dir) {
		File[] files = dir.listFiles();
		if (files != null) {
			for (File f : files) {
				if (f != null) {
					if (f.isFile()) {
						if (f.getName().endsWith(".java")) {
							count++;
							long size = f.length();
							length += size;

						}
					} else {
						printFile(f);
					}
				}

			}
		}

	}
}
