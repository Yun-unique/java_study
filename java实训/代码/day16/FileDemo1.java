package day16;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public FileDemo1() throws IOException {
		// init1();
		init2();
	}

	/**
	 * ���캯��
	 * @throws IOException 
	 */
	private void init2() throws IOException {
		// File(String pathname)
		// ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ����
		String pathname="d:\\aa.txt";
		File file=new File(pathname);
		file.createNewFile(); //�������ļ�
		
		// File(File parent, String child)
		// ���� parent ����·������ child ·�����ַ�������һ���� File ʵ����
		file=new File("d:\\aa\\aa\\aa\\aa");
        if(!file.exists()) {
        	file.mkdirs();
        }
        file=new File(file,"a.txt");
        if(!file.exists())
          file.createNewFile();
		
		// File(String parent, String child)
		// ���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ����
	    String parent="d:\\aa";//Ŀ¼  ͨ��·����ʾ�ļ�
	    String child="a.txt";//�ļ�
	    file=new File(parent,child);
	    file.createNewFile();
        // File(URI uri)  tomcat  Զ�̴���
		// ͨ���������� file: URI ת��Ϊһ������·����������һ���µ� File ʵ����

	}

	/**
	 * ��������
	 * 
	 * @throws IOException
	 */
	private void init1() throws IOException {
		// ͨ���ļ���·������
		String pathname = "d:\\aa.txt";
		// ���ַ���ת�����ļ��������
		// fileֻ�����ļ�����Ŀ¼,û��
		File file = new File(pathname);
		// Ŀ¼���ļ�
		// Ŀ¼�� �ļ��� ��ռ�ռ䣬Ŀ¼��ֻ���ļ���Ŀ¼
		// �ļ��� �ļ���ռ�ռ䣬�����ļ��е�����ռ�ռ�
		// �ж� 1.�ж��ļ���Ŀ¼
		boolean flag = file.isDirectory();
		System.out.println("Ŀ¼��" + flag);
		flag = file.isFile();
		System.out.println("�ļ���" + flag);
		// 2.����
		// 2.1 �����ļ�
		if (!file.isFile()) {
			flag = file.createNewFile();
			System.out.println("�����ļ�" + flag);
		}
		pathname = "d:/t";
		pathname = "d:\\ii"; // ��ֹת���ַ�
		file = new File(pathname);
		// 2.2 ����Ŀ¼
		if (!file.isDirectory()) {
			flag = file.mkdir(); // ������Ŀ¼
			System.out.println("����Ŀ¼" + flag);
		}
		pathname = "d:\\ii\\a\\a\\a"; // ��ֹת���ַ�
		file = new File(pathname);
		// 2.2 ����Ŀ¼
		if (!file.isDirectory()) {
			flag = file.mkdirs(); // ����Ŀ¼
			System.out.println("����Ŀ¼" + flag);
		}

	}

	public static void main(String[] args) throws IOException {
		new FileDemo1();
	}
}
