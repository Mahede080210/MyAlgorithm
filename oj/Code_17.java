package oj;

import com.sun.org.apache.bcel.internal.classfile.Code;

/** 
【程序21】   题目：求1+2!+3!+...+20!的和。
 */
public class Code_17 {
	
	public int fun(int n)
	{
		int result;
		if(n==1)
			result=1;
		else 
			result=n*fun(n-1);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_17 test=new Code_17();
		int sum=0;
		for(int i=1;i<21;i++)
		{
			sum=sum+test.fun(i);
		}
		
		System.out.println("1!+2!+......+n! ="+sum);
	}

}
