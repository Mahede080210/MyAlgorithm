package niuKe;
/*ţ���ϵĳ�������------>��̬�滮----------��������
��Ŀ>>n*m�����̣�С��ֻ�����ϻ�����б�Ϸ��ߣ���Ҫ 
�����½ǵ����Ͻǣ��ж������߷�?

>>>�����Ƽ��������С����������ĳЩС�����ߣ����ж������߷���
˵��������������������ǣ������Ǹղ���ɵ�����һ����ֻ����
�м����һЩС���Ӳ����ߣ���ô�����������������ߵ���Щ
С����ʱ�������Ǹ��Ե��߷���Ϊ0���ɡ�
*/
public class Test2_2 {
		private static int[][] mem;     //���ĳ��С���Ƿ��߹�����ʼ��Ϊ-1
		static int fun(int n,int m){
			mem=new int[n][m];
			for(int a=0;a<n;a++)
				for(int b=0;b<m;b++)
					mem[a][b]=-1;
			if(n==0||m==0||m==1)
				return 0;
			if(n==1||(n==2&&m==2))
				return 1;
			if(mem[n-1][m-1]>=0)
				return mem[n-1][m-1];
			return mem[n-1][m-1]=fun(n, m-1)+fun(n-2, m-2);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(fun(3, 2));
	}

}
