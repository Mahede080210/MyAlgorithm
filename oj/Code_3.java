package oj;

import java.util.Scanner;

/**
 * ������7�� ��Ŀ������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
 * 
 * @author DELL
 *
 */
public class Code_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System .in);
		System.out .print("�����ַ���>>");
		String str=keyboard.nextLine();
		Code_3 test=new Code_3();
		test.counterOfChar(str);
	}

	public void counterOfChar(String str)
	{
		int count1=0;  //��ĸ����
		int count2=0;  //�ո����
		int count3=0;  //���ּ���
		int count4=0 ; //�����ַ�����
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
		System.out.println("��ĸ��>>  "+count1);
		System.out.println("�ո���>>  "+count2);
		System.out.println("������>>  "+count3);
		System.out.println("�����ַ���>>  "+count4);
	}

}
