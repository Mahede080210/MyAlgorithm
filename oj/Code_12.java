package oj;
/** 【程序16】 题目：输出9*9口诀乘法表。   */
public class Code_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_12 test=new Code_12();
		test.result();
	}
	/**  输出9×9乘法表 */
	public void result()
	{
		int result=0;
		for (int i=1;i<10;i++)
		{
			for (int j=1;j<=i;j++)
			{
				result=j*i;
				if (result>10)
					System.out.print(j+"×"+i+"="+result+"       ");
				else{
					System.out.print(j+"×"+i+"="+result+"        ");
				}
			}
			System.out.println();
		}
	}

}
