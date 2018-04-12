package oj;
/**  【程序18】   题目：两个乒乓球队进行比赛，各出三人。
 * 甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。
 * 有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程
    序找出三队赛手的名单。
*/
public class Code_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] jia={'a','b','c'};
		char[] yi={'x','y','z'};
		for(int i=0;i<jia.length;i++)
			for(int j=0;j<yi.length;j++)
			{
				if((jia[i]=='a'&&yi[j]=='x')||(jia[i]=='a')&&yi[j]=='y')
					continue;
				else if((jia[i]=='b'&&yi[j]=='y')||(jia[i]=='b'&&yi[j]=='z'))
					continue;
				else if ((jia[i]=='c'&&yi[j]=='x')||(jia[i]=='c'&&yi[j]=='z')) 
					continue;
				else {
					System.out.println(jia[i]+" vs "+yi[j]);
				}
				
		}
	}

}
