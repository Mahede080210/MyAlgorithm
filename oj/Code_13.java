package oj;
/** 【程序17】   题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，
 * 	 又多吃了一个第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 	以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。
 * 求第一天共摘了多少。 
 * */
public class Code_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;     //每次剩下的桃子数
		int all=1;       //总数
		for(int i=9;i>=0;i--)
		{
			sum=(all+1)*2;
			all=sum;
		}
		System.out.println("第一次共摘了 "+sum+" 个桃子");
	}

}
