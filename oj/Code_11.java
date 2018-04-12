package oj;

import java.util.Arrays;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * 【程序15】 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 * 
 * @author DELL
 *
 */
public class Code_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("第一种方法>>>>>>\n");
		System.out .print("输入三个整数>>>>>");
		int[] arr=new int[3];
		for (int i=0;i<3;i++)
		{
			arr[i]=keyboard.nextInt();
	    }
		Arrays.sort(arr);
		
		System.out.print(arr[0]+" "+arr[1]+" "+arr[2]+"的排序>>>>" );
		for(int i=0;i<3;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n\n第二种方法>>>>>>\n");
		Code_11 test=new Code_11();
		System.out .print("输入三个整数>>>>>");
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
