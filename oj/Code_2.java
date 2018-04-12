package oj;

/**
 * 【程序6】   题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
	1.程序分析：利用辗除法。
 */
import java.util.Scanner;

import sun.net.www.content.audio.x_aiff;

public class Code_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_2 test = new Code_2();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("输入第一个整数N1>>");
		int N1 = keyboard.nextInt();
		System.out.print("输入第二个整数N2>>");
		int N2 = keyboard.nextInt();
		System.out.println("最大公约数>> " + test.最大公约数(N1, N2));
		System.out.println("最小公倍数>>" + (N1 * N2 / test.最大公约数(N1, N2)));
	}

	public int 最大公约数(int x, int y) {
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
