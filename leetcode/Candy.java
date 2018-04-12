package leetcode;
/*There are N children standing in a line. Each child is assigned a rating value.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?

*/
/*解题思路>>
 1.每个小孩至少一个糖果，那就初始化mem[]都为1
 2.相邻小孩点高的需要更多的糖果，那就比相邻小孩多一个糖果即可
 3.先从左到右判断小孩之间的点数高低，随即分配糖果
 4.从右到左，判断点数高低以及糖果的比例，使得满足条件要求。
 */


public class Candy {
	 public int candy(int[] ratings) {
	        int s=0;              
	        if(ratings==null)
	            return 0;
	        int[] mem=new int[ratings.length];        //mem用于存储每个小孩的糖果数量
	        for(int i=0;i<ratings.length;i++)   
	            mem[i]=1;                          //没人至少一个
	        for(int i=1;i<ratings.length;i++){   //从左到右
	            if(ratings[i]>ratings[i-1])
	                mem[i]=mem[i-1]+1;
	        }
	        for(int j=ratings.length-1;j>=1;j--){         //从右到左
	            if(ratings[j-1]>ratings[j]&&mem[j-1]<=mem[j])
	                mem[j-1]=mem[j]+1;
	            s+=mem[j];
	        }
	        s+=mem[0];
	        return s;
	    }
	
}
