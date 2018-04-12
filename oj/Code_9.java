package oj;

import java.util.Scanner;

/**
 * 【程序13】   题目：一个整数，它加上100后是一个完全平方数，
 * 							加上168又是一个完全平方数，请问该数是多少？
 * @author DELL
 *
 */
public class Code_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Code_9 test=new Code_9();
		
		double sum1=0,sum2=0;
		
		System.out .println("题目：一个整数，它加上100后是一个完全平方数,\n"
				+ "加上168又是一个完全平方数，请问该数是多少？");
		
		int mark=-1;
		for(int i=0;i<100000;i++)
		{
			sum1=i+100;
			sum2=i+168;
			if(test.isPerfection(sum1)&&test.isPerfection(sum2))
			{
				System.out.println("该数是>>>>>>"+i);
				mark=i;
				break;
			}
		}
		if(mark==-1)
				System.out.println("未找到该整数.");
		System.exit(0);

		
	}
	
	public boolean isPerfection(double no)
	{
		boolean result=false;
		double answer=Math.sqrt(no);
		if(answer%1==0)
			result=true;
		return result;
	}

}
