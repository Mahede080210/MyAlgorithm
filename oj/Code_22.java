package oj;
/*��Ŀ����
Ϊ���������ø�����fpcsong�������ĩ��������һЩ���������ݡ�Ϊ���ܹ���ס���룬���ӵ������������ظ����С�������������

xduacm2015_mimayaochangchangchang

��ĩ����һ�ظ����У���"chang"�ظ�3�Ρ����ڣ�����һ����s������ȷ��һ����p����x��ʹ��p�ǿգ�x>1��px��ָ��p�ظ�x�Σ�Ϊs�ĺ�׺�����ж�����ܵĽ⣬���x���Ľ⡣�����ж�⣬���|p|��p�ĳ��ȣ����Ľ⡣���޽⣬���-1��

����
�������ݣ�ÿ������1�У�����һ����s��s��ֻ����ĸ����Сд���У������֣��»��ߡ�|s|<=400000��

���
����ÿ�����ݣ����1�У����н������p������x���ÿո�ָ���޽����-1��

��������
xduacm2015_mimayaochangchangchang
orzorzorzorz
Orzorzorzorz
orzorz_diaodiaodiaodiao
we_orz_tencent_light_light
ooooooooooops
�������
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
		System.out.println("�����ַ���");
		String str1=in.nextLine();
		System.out.println(getString(str1)+" "+count);
	}

}
