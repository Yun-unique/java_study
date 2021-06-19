package day17.file;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class FileDemo {
	public FileDemo() throws Exception {
//		init();
//		init2();
		init3();
	}
	

	private void init3() throws Exception {
		String str="file:/d:/daima/aaaa/aa/dd/cc";
		URL url=new URL(str);
		URI uri=url.toURI();
		File file=new File(uri);//java.io.Fileʹ�õ���fileЭ��
		file.mkdirs();
		
	}

	private void init2() throws Exception {
		//protocol:Э��
		//����Э�飺
		//file: ���������ļ���Э��
		//file://d:/daima
		//ftp:window��������linux  ���߷������ϴ�����
		//http:// ����Э��
		URL url=new URL("http", "localhost", 8080,"/aa");
		System.out.println(url);
		//url--������
		
	}


	private void init() throws Exception {
		String addredss = "http://www.baidu.com";
		// url �� URL ����һ��ͳһ��Դ��λ��������ָ����������Դ����ָ��
		URL url = new URL(addredss);
		System.out.println(url);
		// URL
		// uri ͳһ��Դ��ʶ�� (URI) ����
		URI uri = url.toURI();
		System.out.println(uri);

	}

	public static void main(String[] args) throws Exception {
		new FileDemo();

	}
}
