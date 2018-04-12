package oj;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_2 test=new Code_2();
		Scanner keyboard=new Scanner(System.in);
		System.out .print("输入第一个整数N1>>");
		int N1=keyboard.nextInt();
		System.out .print("输入第二个整数N2>>");
		int N2=keyboard.nextInt();
		System.out .println("最大公约数>> "+test.最大公约数(N1, N2));
		System.out .println("最小公倍数>>"+(N1*N2/test.最大公约数(N1, N2)));
	}

}
