package day18;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import day10.extend.StuForm;

/**
 * 
 * @author fan
 *
 */
public class Demo5 {
	public Demo5() throws Exception {
//		init1();
		init2();
	}
	String pathname="src/file/stu.txt";
	File file=new File(pathname);
	private void init2() throws IOException, ClassNotFoundException {
		InputStream in=new FileInputStream(file);
		BufferedInputStream bin=new BufferedInputStream(in);
		ObjectInputStream ois=new ObjectInputStream(bin);
		Object obj=ois.readObject();
		if(obj instanceof List) {
			List<Stu> stus=(List<Stu>)obj;
			for (Stu stu : stus) {
				System.out.println(stu.getId());
			}
		}
		System.out.println(obj);
	}
	private void init1() throws Exception {
	
		OutputStream out=new FileOutputStream(file);
		//对象流 
		@SuppressWarnings("resource")
		//ObjectOutputStream 必须添加序列化的类
		ObjectOutputStream oos=new ObjectOutputStream(out);
//		oos.writeObject("a");
		List<Stu> forms=new ArrayList<>();
		forms.add(new Stu(1001,"aa"));
		forms.add(new Stu(1002,"aa"));
		oos.writeObject(forms);
		oos.flush();
		oos.close();
		out.close();
	}
	public static void main(String[] args) {
		try {
			new Demo5();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
