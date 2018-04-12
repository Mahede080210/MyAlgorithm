package niuKe;
/*
 算法常见问题---->动态规划dp------计数问题
 题目>>走楼梯，有n阶楼梯，可以一次走一个台阶，也可以两个台阶
 走完n阶台阶有多少种走法？
 >>下面解法为递归式解法
 */
public class Test3_1 {

	static int[] dp;
	static int fun(int n){
		dp=new int[n];
		for(int i=0;i<n;i++)
			dp[i]=-1;
		if(n<=1)
			return 1;
		if(dp[n-1]>=0)      //注意这里的数组角标容易写为n，导致角标超界异常
			return dp[n-1];
		return dp[n-1]=fun(n-1)+fun(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(3));
	}

}
