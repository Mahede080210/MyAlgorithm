package oj;
/*题目描述
为了让密码变得更长，fpcsong在密码的末端增加了一些无意义内容。为了能够记住密码，增加的内容往往是重复序列。例如下列密码

xduacm2015_mimayaochangchangchang

的末端有一重复序列，即"chang"重复3次。现在，给你一个串s，请你确定一个串p和数x，使得p非空，x>1，px（指串p重复x次）为s的后缀。若有多个可能的解，输出x最大的解。若仍有多解，输出|p|（p的长度）最大的解。若无解，输出-1。

输入
多组数据，每组数据1行，包含一个串s。s中只有字母（大小写敏感），数字，下划线。|s|<=400000。

输出
对于每组数据，输出1行，若有解输出串p和整数x，用空格分割。若无解输出-1。

样例输入
xduacm2015_mimayaochangchangchang
orzorzorzorz
Orzorzorzorz
orzorz_diaodiaodiaodiao
we_orz_tencent_light_light
ooooooooooops
样例输出
chang 3
orz 4
orz 3
diao 4
_light 2
-1
*/
import java.util.Scanner;

public class Code_22 {
	static int count=0;
	static char[] mem;
	static String getString(String str){
		String target=new String();
		char[] ch=str.toCharArray();
		mem=new char[ch.length];
		for(int i=0;i<str.length()-1;i++){
			for(int j=i+1;j<str.length();j++){
				if(ch[i]==ch[j]){
					for(int s=1;s<j-i-1;s++){
						if(ch[i+s]==ch[j+s]){
							mem[i]=ch[i];
							mem[i+s]=ch[i+s];
							target=str.substring(i, i+s+1);
							continue;
						}
						else
							break;
					}
				}
			}
		}
		for(char a:ch)
			if(a==target.substring(0,1).toCharArray()[0])
				count++;
		return target;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new  Scanner(System.in);
		System.out.println("输入字符串");
		String str1=in.nextLine();
		System.out.println(getString(str1)+" "+count);
	}

}
