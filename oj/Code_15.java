package oj;
/** ������19��  ��Ŀ����ӡ������ͼ��������) */
public class Code_15 {
	private int countOfSpace;            //�ո���
	private int countOfStars;

	/** �������  */
	public void getUpStars()
	{
		
		this.countOfSpace=3;
		this.countOfStars=1;
		for(int i=countOfSpace;i>0;i--)
		{
			space(i);
			stars(countOfStars);
			countOfStars =countOfStars+2;
			System.out.println();
		}
		
	}
	
	/** ����ո���� */
	private void space(int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(" ");
	}
	
	/** ������� */
	private void stars(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(" o ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Code_15 test=new Code_15();
		//test.getUpStars(
		int i = 0;
        int j = 0;
        for (i = 1; i <= 4; i++) {
            for (int k = 1; k <= 4 - i; k++)
                System.out.print( " " );
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (i = 3; i >= 1; i--) {
            for (int k = 1; k <= 4 - i; k++)
                System.out.print( " " );
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();

		}
	}

}
