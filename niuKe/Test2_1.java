package niuKe;

/*ţ���ϵĳ�������------>��̬�滮----------��������
 ��Ŀ>>n*m�����̣�С��ֻ�����һ��������ߣ���Ҫ 
 �����½ǵ����Ͻǣ��ж������߷���
 
 >>��̬�滮ԭ����ʵ���ǵݹ��Ӧ�ã�Ϊʲô����˵�أ�
 ������̬�滮�㷨�Ľ��ⲽ����Ͷ��ˣ�
 1.��Ʊ����㷨���ҳ�����
 2.�ݹ�˼·���޺�Ч��
 3.����
 һ���������㷨����᲻���뵽�ݹ飬��ʵ�����㷨���ǵݹ�ı��ʡ�
 
 .>>�����������Ĳ���
 */
public class Test2_1 {
	private static int[][] mem;
	static int fun(int n,int m){
		mem=new int[n][m];
		for(int a=0;a<n;a++)
			for(int b=0;b<m;b++)
				mem[a][b]=-1;
		if(n==0||m==0)
			return 0;
		if(n==1||m==1)
			return 1;
		if(mem[n-1][m-1]>=0)
			return mem[n-1][m-1];
		return mem[n-1][m-1]=fun(n-1, m)+fun(n, m-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(2, 3));
	}

}
