package day08;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo01Date {
	public Demo01Date() {
		init4();
	}

	private void init4() {
		// 创建Calendar对象
		Calendar cal = Calendar.getInstance();
		// 设置年
		int year = cal.get(Calendar.YEAR);
		// 设置月
		int month = cal.get(Calendar.MONTH) + 1;
		// 设置日
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		System.out.print(year + "年" + month + "月" + dayOfMonth + "日");
	}

	private void init3() {
		// 对应的日期格式如：2018-01-16 15:06:38
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//将date类型转换成字符串类型
		String time = format.format(new Date());
		System.out.println(time);
		try {
			//将字符串类型转换成date类型
			Date date = format.parse(time);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void init2() {
		// 获取当前时间毫秒值
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date().getTime());
	}

	private void init1() {
		// 创建日期对象，把当前的时间
		System.out.println(new Date());
		// 创建日期对象，把当前的毫秒值转成日期对象
		System.out.println(new Date(0L));
		System.out.println(new Date(1622615479115L));
		System.out.println(new Date().getTime());
		System.out.println(System.currentTimeMillis());

	}

	public static void main(String[] args) {
		new Demo01Date();
	}
}
