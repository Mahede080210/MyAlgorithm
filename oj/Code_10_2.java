package oj;

import java.util.Calendar;
import java.util.Scanner;

/**
 * * ������14�� ��Ŀ������ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿
 * 
 * @param args
 */
public class Code_10_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������,��,�գ�");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int month = in.nextInt();
		int day = in.nextInt();
		Calendar cal = Calendar.getInstance();       
		cal.set(year, month - 1, day);
		int sum = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("��һ������һ��ĵ�" + sum + "��");
	}

}
