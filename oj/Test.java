package oj;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_2 test=new Code_2();
		Scanner keyboard=new Scanner(System.in);
		System.out .print("�����һ������N1>>");
		int N1=keyboard.nextInt();
		System.out .print("����ڶ�������N2>>");
		int N2=keyboard.nextInt();
		System.out .println("���Լ��>> "+test.���Լ��(N1, N2));
		System.out .println("��С������>>"+(N1*N2/test.���Լ��(N1, N2)));
	}

}
