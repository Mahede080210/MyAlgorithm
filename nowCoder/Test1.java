package niuKe;
/*  题目描述
有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，
要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回
最大的乘积吗？
输入描述:
每个输入包含 1 个测试用例。每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，表示学生
的个数，接下来的一行，包含 n 个整数，按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。
接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。
输出描述:
输出一行表示最大的乘积。
示例1
输入
3
7 4 7
2 50
输出
49 */

import java.awt.event.ItemEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	static int f = 2;

	/* 得到最初的两个数的乘积最大值 */
	static int twoNo(int[] a, int k, int d, int[] mark) {
		// int temp = 2; // 标记乘积的数字量
		int result0 = 1;
		int result1 = 1;
		// int t = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((j - i) < (d + 1)) {
					result1 = a[i] * a[j];
					if (result0 < result1) {
						result0 = result1;
						mark[0] = i;
						mark[1] = j;
					}
				} else
					break;
			}
		}
		return result0;
	}

	/* 返回多个数的最大积结果 */
	static int manyNo(int max, int[] a, int[] mark, int d) {
		int max2 = max;
		int max0 = 1;
		int max1 = 1;
		int s = 0; // 追踪数据数组中的位置
		for (int i = 0; i < a.length; i++) {
				if ((!hasMuti(i, mark)) && in(d, i, mark)) {
					max0 = max * a[i];
					if (max1 < max0) {
						max1 = max0;
						s = i;
					} 
			} else { 
				if ((!hasMuti(i, mark)) && in(d, i, mark))
					max2 = max2 * min(a, s);
			}
		}
		max2 = max1;
		mark[f] = s;
		f++;
		// System.out.println("k后........."+k);
		return max2;
	}

	/* 检测是否已经被乘过 */
	static boolean hasMuti(int i, int[] mark) {
		boolean has = false;
		for (int t = 0; t < mark.length; t++)
			if (i == mark[t])
				has = true;
		return has;
	}

	/* 判断是否还有正数 */
	static boolean hasZhengShu(int[] a, int i) {
		boolean has = false;
		for (int j = i + 1; j < a.length; j++)
			if (a[j] > 0)
				has = true;
		return has;
	}

	/* 得到a中的最小数 */
	static int min(int[] a, int s) {
		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < temp) {
				temp = a[i];
				s = i;
			}
		}
		return temp;
	}

	/* 判断是否不超过d */
	static boolean in(int d, int i, int[] mark) {
		boolean isIn = false;
		for (int t = 0; t < mark.length; t++)
			if (Math.abs(i - mark[t]) < (d + 1))
				isIn = true;
		return isIn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyb = new Scanner(System.in);
		int n = keyb.nextInt();
		keyb.nextLine();
		// System.out.println("n>>>>" + n);
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = keyb.nextInt();
			// System.out.println("a" + i + ">>>>>" + a[i]);
		}
		// System.out.println("a[]>>>>>>" + a);
		int k = keyb.nextInt();
		int d = keyb.nextInt();
		// System.out.println("k>>>>>>" + k);
		// System.out.println("d>>>>>>" + d);

		int max;
		int[] mark = new int[k]; // 标记已用过的数的角标
		if (n == 1) {
			System.out.println(a[0]);
			return;
		} else
			max = twoNo(a, k, d, mark);
		// System.out.println("两个数的最大积>>>>>" + max);

		k = k - 2;
		while (k > 0) {
			max = manyNo(max, a, mark, d);
			k--;
			System.out.println("---------" + max);
		}
		System.out.println(max);
	}

}
