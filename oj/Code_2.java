package oj;

/**
 * ������6��   ��Ŀ����������������m��n���������Լ������С��������
	1.�������������շ������
 */
import java.util.Scanner;

import sun.net.www.content.audio.x_aiff;

public class Code_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_2 test = new Code_2();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("�����һ������N1>>");
		int N1 = keyboard.nextInt();
		System.out.print("����ڶ�������N2>>");
		int N2 = keyboard.nextInt();
		System.out.println("���Լ��>> " + test.���Լ��(N1, N2));
		System.out.println("��С������>>" + (N1 * N2 / test.���Լ��(N1, N2)));
	}

	public int ���Լ��(int x, int y) {
		if (x < y) {
			int t = x;
			x = y;
			y = t;
		}
		while (y != 0) {
			if (x == y)
				return x;
			else {
				int k = x % y;
				x = y;
				y = k;
			}
		}
		return x;
	}
}
