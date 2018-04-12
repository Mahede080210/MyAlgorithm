package niuKe;
/*  ��Ŀ����
�� n ��ѧ��վ��һ�ţ�ÿ��ѧ����һ������ֵ��ţţ����� n ��ѧ���а���˳��ѡȡ k ��ѧ����
Ҫ����������ѧ����λ�ñ�ŵĲ���� d��ʹ���� k ��ѧ��������ֵ�ĳ˻�������ܷ���
���ĳ˻���
��������:
ÿ��������� 1 ������������ÿ���������ݵĵ�һ�а���һ������ n (1 <= n <= 50)����ʾѧ��
�ĸ�������������һ�У����� n ����������˳���ʾÿ��ѧ��������ֵ ai��-50 <= ai <= 50����
��������һ�а�������������k �� d (1 <= k <= 10, 1 <= d <= 50)��
�������:
���һ�б�ʾ���ĳ˻���
ʾ��1
����
3
7 4 7
2 50
���
49 */

import java.awt.event.ItemEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	static int f = 2;

	/* �õ�������������ĳ˻����ֵ */
	static int twoNo(int[] a, int k, int d, int[] mark) {
		// int temp = 2; // ��ǳ˻���������
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

	/* ���ض������������� */
	static int manyNo(int max, int[] a, int[] mark, int d) {
		int max2 = max;
		int max0 = 1;
		int max1 = 1;
		int s = 0; // ׷�����������е�λ��
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
		// System.out.println("k��........."+k);
		return max2;
	}

	/* ����Ƿ��Ѿ����˹� */
	static boolean hasMuti(int i, int[] mark) {
		boolean has = false;
		for (int t = 0; t < mark.length; t++)
			if (i == mark[t])
				has = true;
		return has;
	}

	/* �ж��Ƿ������� */
	static boolean hasZhengShu(int[] a, int i) {
		boolean has = false;
		for (int j = i + 1; j < a.length; j++)
			if (a[j] > 0)
				has = true;
		return has;
	}

	/* �õ�a�е���С�� */
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

	/* �ж��Ƿ񲻳���d */
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
		int[] mark = new int[k]; // ������ù������ĽǱ�
		if (n == 1) {
			System.out.println(a[0]);
			return;
		} else
			max = twoNo(a, k, d, mark);
		// System.out.println("������������>>>>>" + max);

		k = k - 2;
		while (k > 0) {
			max = manyNo(max, a, mark, d);
			k--;
			System.out.println("---------" + max);
		}
		System.out.println(max);
	}

}
