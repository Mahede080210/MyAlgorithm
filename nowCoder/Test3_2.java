package niuKe;
/*
算法常见问题---->动态规划dp------计数问题
题目>>走楼梯，有n阶楼梯，可以一次走一个台阶，也可以两个台阶
走完n阶台阶有多少种走法？

>>>下面解法是递推解法（由下向上），避免了冗余
*/
public class Test3_2 {

	static int step(int n){
		int[] step=new int[n];   //定义台阶
		step[0]=1;step[1]=2;      //初始化第一阶和第二阶的走法
		for(int i=2;i<n;i++)           //注意这里是从第三阶开始
			step[i]=step[i-1]+step[i-2];         
		return step[n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(step(3));
	}

}
