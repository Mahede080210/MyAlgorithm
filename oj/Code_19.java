package oj;

import org.omg.CORBA.PUBLIC_MEMBER;

/* 【程序24】   题目：给一个不多于5位的正整数，要求：
 * 一、求它是几位数，二、逆序打印出各位数字。  */
public class Code_19 {
	/*逆序输出各个数字*/
	public void niXu(int number)
	{
		while(number%10!=0)
		{
			System.out.print(number%10);
			number=number/10;
		}
	}
	
	/* 得到一个数字的位数 */
	public int getCount(int number )
	{
		int count=0;
		while(number%10!=0)
		{
			count++;
			number=number/10;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12545;
		Code_19 test=new Code_19();
		System.out.println(number+"有"+test.getCount(number)+"位数字");
		System.out.print(number+"逆序>>>>>");
		test.niXu(number);
		
		
	}

}
