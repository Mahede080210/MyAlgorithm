package oj;

import sun.security.ssl.HandshakeInStream;

/**
 * 【程序10】 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 									再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 * @author DELL
 *
 */
public class Code_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_6 test=new Code_6();
		System.out .println("10次共经过 "+test.sum(10)+" 米");
		System .out .println("第10次反弹 "+test.heightOfCount(10)+" 米");
		System.exit(0);
	}
	
	public double sum(int count)
	{
		double sum=100;
		for(int i=1;i<=count;i++)
		{
			sum=sum+heightOfCount(i)*2;
		}
		return sum;
	}
	
	public double heightOfCount(int count)
	{
		double height;
		if(count==0)
			height=0;
		else
			height=100;
		for(int i=1;i<=count;i++)
		{
			if(height==0)
				break;
			height=height/2;
		}
		return height;
	}

}
