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
		// ����Calendar����
		Calendar cal = Calendar.getInstance();
		// ������
		int year = cal.get(Calendar.YEAR);
		// ������
		int month = cal.get(Calendar.MONTH) + 1;
		// ������
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		System.out.print(year + "��" + month + "��" + dayOfMonth + "��");
	}

	private void init3() {
		// ��Ӧ�����ڸ�ʽ�磺2018-01-16 15:06:38
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//��date����ת�����ַ�������
		String time = format.format(new Date());
		System.out.println(time);
		try {
			//���ַ�������ת����date����
			Date date = format.parse(time);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void init2() {
		// ��ȡ��ǰʱ�����ֵ
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date().getTime());
	}

	private void init1() {
		// �������ڶ��󣬰ѵ�ǰ��ʱ��
		System.out.println(new Date());
		// �������ڶ��󣬰ѵ�ǰ�ĺ���ֵת�����ڶ���
		System.out.println(new Date(0L));
		System.out.println(new Date(1622615479115L));
		System.out.println(new Date().getTime());
		System.out.println(System.currentTimeMillis());

	}

	public static void main(String[] args) {
		new Demo01Date();
	}
}
