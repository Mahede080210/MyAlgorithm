import java.util.*;
import java.util.Map.Entry;

/*
 ��Ŀ����
��Ԫ12138�꣬v8������и��Ŭ���������ҵ���С�ɰ�XDU��һ����С����Chrystal��һ�죬�����ڴ�̫����,��һ��ȫcombo����Ϊ��̫�ɰ����������ǳ�ϲ������εĹģ��������ر�ϲ�������ɰ�ƴ�������������ڴ�ĵ�ʱ����뵽��һ�����⣬����ڷ�����ƴ�أ�����֪��һ�����Ϳ�ֱ�Ϊa,b����Ϊ���������ĳ���������Ƕ���ɸ��ȱ߳���С�����Σ������������������������ı߳����Ƕ��٣�

����
��������,ÿ������������ a,b, 0 < a, b �� 10000000,���� EOF ����

���
����ÿ������һ����������ʾ�����ε����߳�

��������
3 2                      
2 2
�������
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
