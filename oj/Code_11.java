package oj;

import java.util.Arrays;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * ������15�� ��Ŀ��������������x,y,z���������������С���������
 * 
 * @author DELL
 *
 */
public class Code_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("��һ�ַ���>>>>>>\n");
		System.out .print("������������>>>>>");
		int[] arr=new int[3];
		for (int i=0;i<3;i++)
		{
			arr[i]=keyboard.nextInt();
	    }
		Arrays.sort(arr);
		
		System.out.print(arr[0]+" "+arr[1]+" "+arr[2]+"������>>>>" );
		for(int i=0;i<3;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n\n�ڶ��ַ���>>>>>>\n");
		Code_11 test=new Code_11();
		System.out .print("������������>>>>>");
		int x=keyboard.nextInt();
		int y=keyboard.nextInt();
		int z=keyboard.nextInt();
		test.sort(x,y,z);
		
	}
	
	public void sort(int x,int y,int z)
	{
		int t;
		if(x>y)
		{
			t=x;
			x=y;
			y=t;
		}
		if(x>z)
		{
			t=x;
			x=y;
			y=t;
		}
		if(y>z)
		{
			t=y;
			y=z;
			z=t;
		}
		
		System.out.println(x+" "+y+" "+z);
	}
}
