package oj;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.classfile.Code;

/**
 * 【程序14】 题目：输入某年某月某日，判断这一天是这一年的第几天？
 * 
 * @author DELL
 *
 */
public class Code_10 {
	
	public int count(int year,int month,int day)
	{
		int count=0;
		if(isRunNian(year))
		{
			switch(month)
			{
			case 1: {count=0+day;break;}
			case 2:{count=31+day;break;}
			case 3:{count=60+day;break;}
			case 4:{count=91+day;break;}
			case 5:{count=121+day;break;}
			case 6:{count=152+day;break;}
			case 7:{count=182+day;break;}
			case 8:{count=213+day;break;}
			case 9:{count=244+day;break;}
			case 10:{count=274+day;break;}
			case 11:{count=305+day;break;}
			case 12:{count=335+day;break;}
			default: count=-1;
			}
		}
		else
		{
			switch(month)
			{
			case 1: {count=0+day;break;}
			case 2:{count=31+day;break;}
			case 3:{count=59+day;break;}
			case 4:{count=89+day;break;}
			case 5:{count=119+day;break;}
			case 6:{count=150+day;break;}
			case 7:{count=180+day;break;}
			case 8:{count=211+day;break;}
			case 9:{count=242+day;break;}
			case 10:{count=272+day;break;}
			case 11:{count=303+day;break;}
			case 12:{count=334+day;break;}
			default: count=-1;
			}
		}
		return count;
	}
	
	private boolean isRunNian(int year)      //判断是否为闰年
	{
		boolean is = false;
		if (yearIs0(year) && (year % 400 == 0))
			is = true;
		else
			if(year%4==0)
				is=true;
		return is;
	}
	
	private boolean yearIs0(int year)     //判断是否为整百年
	{
		boolean is=false;
		int count=0;
		while(year!=0)
		{
			if(year%10==0)			
			{
				year=year/10;
				count++;
				if(count==2)
				{
					is=true;
					break;
				}
			}
			else
				break;
		}
		return is;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_10 test =new Code_10();
		Scanner keyboard=new Scanner(System.in);
		System.out.print("输入年>> ");
		int year=keyboard.nextInt();
		System.out .print("输入月>> ");
		int month=keyboard.nextInt();
		System.out.print("输入天>> ");
		int day=keyboard.nextInt();
		System.out.println(year+"-"+month+"-"+day+"是这年"+test.count(year, month, day)+" 天");
	}

}
