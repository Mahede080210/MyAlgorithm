package niuKe;
/*牛客上的常见题型------>动态规划----------计数问题
题目>>n*m的棋盘，小兵只能向上或者向斜上方走，需要 
从左下角到右上角，有多少种走法?

>>>个人推荐读者完成小兵在棋盘上某些小格不能走，又有多少种走法？
说明：此问题可以这样考虑，和我们刚才完成的任务一样，只不过
中间加了一些小格子不能走，那么可以设置条件，当走到这些
小格子时，把他们各自的走法置为0即可。
*/
public class Test2_2 {
		private static int[][] mem;     //标记某个小格是否走过，初始化为-1
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
