package oj;
/** ������17��   ��Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬
 * 	 �ֶ����һ���ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
 * 	�Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��������10���������ٳ�ʱ����ֻʣ��һ�������ˡ�
 * ���һ�칲ժ�˶��١� 
 * */
public class Code_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;     //ÿ��ʣ�µ�������
		int all=1;       //����
		for(int i=9;i>=0;i--)
		{
			sum=(all+1)*2;
			all=sum;
		}
		System.out.println("��һ�ι�ժ�� "+sum+" ������");
	}

}
