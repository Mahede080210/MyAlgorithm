package niuKe;

/*牛客上的常见题型------>动态规划----------计数问题
 题目>>n*m的棋盘，小兵只能向右或者向左走，需要 
 从左下角到右上角，有多少种走法？
 
 >>动态规划原理：其实就是递归的应用，为什么这样说呢？
 看看动态规划算法的解题步骤你就懂了：
 1.设计暴力算法，找出冗余
 2.递归思路，无后效性
 3.代码
 一看到暴力算法，你会不会想到递归，其实暴力算法就是递归的本质。
 
 .>>看看下面解题的步骤
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
