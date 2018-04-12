package oj;

import java.util.Scanner;

/**
 * 【程序7】 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * 
 * @author DELL
 *
 */
public class Code_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System .in);
		System.out .print("输入字符串>>");
		String str=keyboard.nextLine();
		Code_3 test=new Code_3();
		test.counterOfChar(str);
	}

	public void counterOfChar(String str)
	{
		int count1=0;  //字母计数
		int count2=0;  //空格计数
		int count3=0;  //数字计数
		int count4=0 ; //其他字符计数
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				count1++;
			}
		    else if(Character.isDigit(str.charAt(i)))
			{ 
				count3++;
			}
		    else if(Character.isSpace(str.charAt(i)))
		    {
		    	count2++;
		    }
		    else
		    {
		    	count4++;
		    }
		}
		System.out.println("字母数>>  "+count1);
		System.out.println("空格数>>  "+count2);
		System.out.println("数字数>>  "+count3);
		System.out.println("其他字符数>>  "+count4);
	}

}
