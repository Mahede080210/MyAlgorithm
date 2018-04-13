import java.util.*;
import java.util.Map.Entry;

/*
 题目描述
公元12138年，v8经过不懈的努力，终于找到了小可爱XDU第一鼓王小晗晗Chrystal。一天，她又在打太鼓了,又一曲全combo。因为她太可爱，所以她非常喜欢打矩形的鼓，加上她特别喜欢玩七巧板拼东西。今天她在打鼓的时候就想到了一个问题，如果在方鼔上拼呢？她想知道一个长和宽分别为a,b（均为正整数）的长方形内镶嵌若干个等边长的小正方形，现在她想问问你正方形最大的边长能是多少？

输入
多组数据,每行两个正整数 a,b, 0 < a, b ≤ 10000000,处理到 EOF 结束

输出
对于每组数据一个整数，表示正方形的最大边长

样例输入
3 2                      
2 2
样例输出
1
2*/


public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//int a,b,temp;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>(); 
		String s;
		int b,temp;
		ArrayList<Integer> array=new ArrayList<Integer>();
		String[] str=new String[2];
		while(!(s=in.nextLine()).equals("EOF"))
		{
			str=s.split(" "); 
			map.put(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		}
		
		for(Integer a:map.keySet()){
			b=map.get(a);
			if(a>b){
				temp=a;
				a=b;
				b=temp;
			}
			if(b%a==0)
				array.add(a);
			else
				array.add(1);
		}
		Collections.reverse(array);
		for(Integer a:array){
			System.out.println(a);
		}
	}

}
