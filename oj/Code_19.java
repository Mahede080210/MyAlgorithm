package oj;

import org.omg.CORBA.PUBLIC_MEMBER;

/* ������24��   ��Ŀ����һ��������5λ����������Ҫ��
 * һ�������Ǽ�λ�������������ӡ����λ���֡�  */
public class Code_19 {
	/*���������������*/
	public void niXu(int number)
	{
		while(number%10!=0)
		{
			System.out.print(number%10);
			number=number/10;
		}
	}
	
	/* �õ�һ�����ֵ�λ�� */
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
		System.out.println(number+"��"+test.getCount(number)+"λ����");
		System.out.print(number+"����>>>>>");
		test.niXu(number);
		
		
	}

}
