package oj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		/* ��ʼ�� */
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);// ��
		int month = cal.get(Calendar.MONTH) + 1;// ��
		int day = cal.get(Calendar.DATE);// ��
		int hour = cal.get(Calendar.HOUR_OF_DAY);// ʱ
		int minute = cal.get(Calendar.MINUTE);// ��
		int second = cal.get(Calendar.SECOND);// ��
		int weekday = cal.get(Calendar.DAY_OF_WEEK);// ���� ����-������Ӧ1-7
		int last = cal.getActualMaximum(cal.DAY_OF_MONTH); // ��ȡ�����������
		int DAY_OF_YEAR = cal.get(Calendar.DAY_OF_YEAR);// ����ĵڼ���
		int DAY_OF_MONTH = cal.get(Calendar.DAY_OF_MONTH);// ���µĵڼ���
		System.out.println("������: " + year + " �� " + month + " �� " + day + " �� " + hour + " ʱ " + minute + " �� " + second
				+ " �� " + "\nweekday: " + weekday + " �������� :" + last + " ����ĵڼ���:" + DAY_OF_YEAR + " ���µڼ���:"
				+ DAY_OF_MONTH);

		cal.set(2013, 5, 4, 13, 44, 51);// ������ʱ���루�·�0����1�£� �����벻���Զ�����
		System.out.println(sdf.format(cal.getTime()));
		cal.set(Calendar.MILLISECOND, 0);// ��������
		System.out.println(sdf.format(cal.getTime()));
		cal.set(Calendar.YEAR, 2014);// ��
		cal.set(Calendar.MONTH, 7);// �£��·�0����1�£�
		cal.set(Calendar.DATE, 11);// ��
		cal.set(Calendar.HOUR_OF_DAY, 15);// ʱ
		cal.set(Calendar.MINUTE, 33);// ��
		cal.set(Calendar.SECOND, 32);// ��
		System.out.println(sdf.format(cal.getTime()));

		cal.setTime(new Date());
		System.out.println(sdf.format(cal.getTime()));

		cal.add(Calendar.YEAR, 1);// ��
		cal.add(Calendar.MONTH, 1);// ��
		cal.add(Calendar.DATE, 1);// ��
		cal.add(Calendar.HOUR_OF_DAY, -1);// ʱ
		cal.add(Calendar.MINUTE, 1);// ��
		cal.add(Calendar.SECOND, 1);// ��
		System.out.println(sdf.format(cal.getTime()));

		Calendar calendarNew = Calendar.getInstance();
		calendarNew.add(Calendar.HOUR, -2);
		System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(cal));

		//ʵ����ϰ
		System.out.println("\n\n\n\n");
		System.out .println("-----------------------------------------------");
		System.out  .println("Calender ��ϰ>>>>>");
		
		SimpleDateFormat test0=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		
		Calendar cal1=Calendar.getInstance();
		System.out.println(test0.format(cal1.getTime()));
		
		int year1=cal.get(Calendar.YEAR);
		int month1=cal1.get(Calendar.MONTH)+1;
		int day1=cal1.get(Calendar.DATE);
		System.out.println("������>> "+year1+"-"+month1+"-"+day1);
		
		
	}

}
