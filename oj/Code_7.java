package oj;
/**
 * ������11��   ��Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�

 * @author DELL
 *
 */
public class Code_7 {
	
	public int count;
	
	public void show()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j==i)
					continue;
				for(int n=1;n<=4;n++)
				{
					if((n==i)||(n==j)||(i==j))
						continue;
					else
					{	
						count++;
						int no=100*i+10*j+n;
						System.out.print(" "+no+" ");	
						if(count%5==0)
							System.out .println("<<<<<");
					}
				}
			}
		}
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_7 test=new Code_7();
		System.out .println("1,2,3,4��ɲ��ظ����ֵ���λ��>>");
		System.out.println(">>>>>");
		test.show();
		System.out .println();
		System.out.println("<<<<<");
		System.out.println("�� "+test.count+" ������");
		System.exit(0);
	}
}
