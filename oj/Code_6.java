package oj;

import sun.security.ssl.HandshakeInStream;

/**
 * ������10�� ��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
 * 									�����£������ڵ�10�����ʱ�������������ף���10�η�����ߣ�
 * @author DELL
 *
 */
public class Code_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_6 test=new Code_6();
		System.out .println("10�ι����� "+test.sum(10)+" ��");
		System .out .println("��10�η��� "+test.heightOfCount(10)+" ��");
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
