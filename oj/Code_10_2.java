package oj;

import java.util.Calendar;
import java.util.Scanner;

/**
 * * 【程序14】 题目：输入某年某月某日，判断这一天是这一年的第几天？
 * 
 * @param args
 */
public class Code_10_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入年,月,日：");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int month = in.nextInt();
		int day = in.nextInt();
		Calendar cal = Calendar.getInstance();       
		cal.set(year, month - 1, day);
		int sum = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("这一天是这一年的第" + sum + "天");
	}

}
