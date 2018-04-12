package leetcode;
/*There are N children standing in a line. Each child is assigned a rating value.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?

*/
/*����˼·>>
 1.ÿ��С������һ���ǹ����Ǿͳ�ʼ��mem[]��Ϊ1
 2.����С����ߵ���Ҫ������ǹ����Ǿͱ�����С����һ���ǹ�����
 3.�ȴ������ж�С��֮��ĵ����ߵͣ��漴�����ǹ�
 4.���ҵ����жϵ����ߵ��Լ��ǹ��ı�����ʹ����������Ҫ��
 */


public class Candy {
	 public int candy(int[] ratings) {
	        int s=0;              
	        if(ratings==null)
	            return 0;
	        int[] mem=new int[ratings.length];        //mem���ڴ洢ÿ��С�����ǹ�����
	        for(int i=0;i<ratings.length;i++)   
	            mem[i]=1;                          //û������һ��
	        for(int i=1;i<ratings.length;i++){   //������
	            if(ratings[i]>ratings[i-1])
	                mem[i]=mem[i-1]+1;
	        }
	        for(int j=ratings.length-1;j>=1;j--){         //���ҵ���
	            if(ratings[j-1]>ratings[j]&&mem[j-1]<=mem[j])
	                mem[j-1]=mem[j]+1;
	            s+=mem[j];
	        }
	        s+=mem[0];
	        return s;
	    }
	
}
