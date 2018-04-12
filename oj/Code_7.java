package oj;
/**
 * 【程序11】   题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？

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
		System.out .println("1,2,3,4组成不重复数字的三位数>>");
		System.out.println(">>>>>");
		test.show();
		System.out .println();
		System.out.println("<<<<<");
		System.out.println("共 "+test.count+" 个数字");
		System.exit(0);
	}
}
