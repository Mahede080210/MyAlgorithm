package oj;

import java.util.Scanner;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

/**
 * ������8��   ��Ŀ����s = a + aa + aaa +
 * 		 aaaa + aa...a��ֵ������a��һ�����֡�
 * 		����2 + 22 + 222 + 2222 + 22222(��ʱ����5�������)������������м��̿��ơ�
 * @author DELL
 *
 */
public class Code_4 {
	
	int a,count,sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keybosrd=new Scanner(System.in);
		Code_4 test=new Code_4();
		System.out .print("���뱻����>>");
		test.a=keybosrd.nextInt();
		System.out .print("���뱻���������Ӵ���>>");
		test.count=keybosrd.nextInt();
		test.fun(test.a,test. count);
	}
	public void fun(int a,int count)
	{
		sum=a;
		int result=a;
		print(1);
		for(int i=2;i<=count;i++)
		{
			System.out .print("+");
			sum=sum+a*(int)Math.pow(10,i-1);
			print(i);
			result=result+sum;
		}
		System.out.println("="+result);
	}
	
	private void print(int x)
	{
		for(int i=1;i<=x;i++)
			System .out .print(a);
	}
}

	
