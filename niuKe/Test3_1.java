package niuKe;
/*
 �㷨��������---->��̬�滮dp------��������
 ��Ŀ>>��¥�ݣ���n��¥�ݣ�����һ����һ��̨�ף�Ҳ��������̨��
 ����n��̨���ж������߷���
 >>����ⷨΪ�ݹ�ʽ�ⷨ
 */
public class Test3_1 {

	static int[] dp;
	static int fun(int n){
		dp=new int[n];
		for(int i=0;i<n;i++)
			dp[i]=-1;
		if(n<=1)
			return 1;
		if(dp[n-1]>=0)      //ע�����������Ǳ�����дΪn�����½Ǳ곬���쳣
			return dp[n-1];
		return dp[n-1]=fun(n-1)+fun(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(3));
	}

}
