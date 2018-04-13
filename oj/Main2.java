/*
 题目描述
我们都喜欢 A+B 问题,现在我们遇到了它的一个变形问题,给定 A+B ≤ C
的形式,并且规定 A, B, C 都是正整数。现在已经知道了 C 的大小,请问有多
少对不同的 (A, B) 满足 A + B <= C,(A, B) 与 (A ′ , B ′ ) 被认为不同当且仅当
A  <> A ′ 或 B  <> B ′ 。

输入
有多组数据,输入开始的第一行是一个整数 T, (T ≤ 100),代表数据组数 。
接下 T 行,每行一个正整数 C, C ≤ 10000,含义在题面中已经说明。

输出
对于每个 C,输出一行,包含一个整数,代表符合条件的 (A, B) 的对数。

样例输入
3
1
4
100
样例输出
0
6
4950
 
 */
import java.util.Scanner;
public class Main2 {

	public static  int result(int x){
		int result=0;
		for(int i=1;i<x;i++){
			for(int j=1;j<x;j++){
				if((i+j)<=x){
					result++;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		//in.nextLine();
		int[] nums=new int[n];
		int t=0;
		while(t<n){
			nums[t]=in.nextInt();
			//in.nextLine();
			//System.out.print(t+"....."+nums[t]);
			t++;
			
		}
		
		for(int i=0;i<n;i++)
			System.out.println(result(nums[i]));

	}
}
