package oj;

import com.sun.javafx.image.IntToBytePixelConverter;

/** ������23��   ��Ŀ����5��������һ���ʵ�����˶����ꣿ
 * ��˵�ȵ�4���˴�2�ꡣ�ʵ�4������������˵�ȵ�3���˴�2�ꡣ
 * �ʵ������ˣ���˵�ȵ�2�˴����ꡣ�ʵ�2���ˣ�˵�ȵ�һ���˴���
�ꡣ����ʵ�һ���ˣ���˵��10�ꡣ���ʵ�����˶�� */
public class Code_18 {
	public int getAge(int n)
	{
		if(n==1)
			return 10;
		return getAge(n-1)+2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_18 test=new Code_18();
		System.out.println("������˵�����>>>"+test.getAge(5)+"��");
	}

}
