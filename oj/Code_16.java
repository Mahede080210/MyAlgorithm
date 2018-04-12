package oj;

/**
 * 【程序20】 题目：有一分数序列： 2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 */
public class Code_16 {
	/** 求前n项和 */
	public double result(int n) {
		double result = 0;
		for(int i=1;i<=n;i++)
		{
			result=result+items(i);               //各项相加
		}
		result=(Math.floor(result*1000))/1000;          //保留三位小数
		return result;
	}

	/** 求出各项 */
	private double items(int n) {
		double firstFenZi = 2;
		double firstFenMu = 1;
		double nextFenZi = 3;
		double nextFenMu = 2;
		double t1 = 0;            //作为前后两项分子调换的中间变量
		double t2 = 0;            //作为前后两项分母调换的中间变量
		if (n == 1)
			return (firstFenZi / firstFenMu);
		else if (n == 2)
			return (nextFenZi / nextFenMu);
		else {
			for (int i = 2; i < n; i++) {
				nextFenMu = firstFenMu + nextFenMu;
				firstFenMu = nextFenMu;
				nextFenZi = firstFenZi + nextFenZi;
				firstFenZi = nextFenZi;
				t1 = firstFenMu;
				t2 = firstFenZi;
				firstFenMu = nextFenMu;
				firstFenZi = nextFenZi;
				nextFenMu = t1;
				nextFenZi = t2;

			}
			return (nextFenZi / nextFenMu);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_16 test=new Code_16();
		System.out.println("前20项和>>>>>"+test.result(20));
	}

}
