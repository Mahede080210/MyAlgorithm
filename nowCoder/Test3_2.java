package niuKe;
/*
�㷨��������---->��̬�滮dp------��������
��Ŀ>>��¥�ݣ���n��¥�ݣ�����һ����һ��̨�ף�Ҳ��������̨��
����n��̨���ж������߷���

>>>����ⷨ�ǵ��ƽⷨ���������ϣ�������������
*/
public class Test3_2 {

	static int step(int n){
		int[] step=new int[n];   //����̨��
		step[0]=1;step[1]=2;      //��ʼ����һ�׺͵ڶ��׵��߷�
		for(int i=2;i<n;i++)           //ע�������Ǵӵ����׿�ʼ
			step[i]=step[i-1]+step[i-2];         
		return step[n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(step(3));
	}

}
