package oj;

import java.util.Scanner;

/**
 * ������13��   ��Ŀ��һ��������������100����һ����ȫƽ������
 * 							����168����һ����ȫƽ���������ʸ����Ƕ��٣�
 * @author DELL
 *
 */
public class Code_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Code_9 test=new Code_9();
		
		double sum1=0,sum2=0;
		
		System.out .println("��Ŀ��һ��������������100����һ����ȫƽ����,\n"
				+ "����168����һ����ȫƽ���������ʸ����Ƕ��٣�");
		
		int mark=-1;
		for(int i=0;i<100000;i++)
		{
			sum1=i+100;
			sum2=i+168;
			if(test.isPerfection(sum1)&&test.isPerfection(sum2))
			{
				System.out.println("������>>>>>>"+i);
				mark=i;
				break;
			}
		}
		if(mark==-1)
				System.out.println("δ�ҵ�������.");
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
