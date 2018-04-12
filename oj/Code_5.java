package oj;
/**
 * 【程序9】   题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。
 * 									例如6=1＋2＋3。编程找出1000以内的所有完数。
 * @author DELL
 *
 */
public class Code_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_5 test =new Code_5();
		System .out .println("下面是1000以内的完数>>");
		System.out .print(">>>>> ");
		for(int i=0;i<=1000;i++)
		{
			if(	test.isPerfection(i))
				System .out .print(i+" ");
		}
		System.out .print(" <<<<<");
		System .exit(0);
	}
	
	public boolean isPerfection(int a)
	{
		boolean result=false;
		if(a==sumYinShu(a))
			result=true;
		return result;
	}
	private int sumYinShu(int a)
	{
		int sum=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
				sum=sum+i;
		}
		return sum;
	}

}
