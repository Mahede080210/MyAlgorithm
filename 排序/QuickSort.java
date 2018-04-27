import java.security.PublicKey;

/*
    用最简单的方式解释最快排序算法。。。。以及代码的展示。。
    
  算法思路：
  	1.定一个基数，基数就是一组数中的一个基准数，比如[  1 2 3 4 5]中选择1作为基数
  	2.定义i从数组的结尾向前遍历，找到小于基数的数字，找到就停
  	3.定义j从数组的头部开始遍历，寻找大于基数的值，找到就停。
  	4.判断i是否大于j，当i<j时，交换i，j位置的值。
  	5.继续遍历，直到i==j，此时交换基数与i的位置
  	6.此时基数左边是小于基数的值，右边是大于基数的值。
  	7.将基数 左右两边的数组分割，形成两个小数组，继续前面的步骤，处理这两个小数组。
  	
  	关键字：基数，先左后右遍历，分割
  	
  	代码如下：
 * */
public class QuickSort {
	
	public static void quickSort(int[] arr,int low,int high){
		if(low>high)
			return;
		int i,j,temp;
		i=low; j=high;
		temp=arr[low];
		while(i<j){
			while(arr[j]>=temp&&i<j){   //j从尾部开始向前迭代，直到找到小于基数的值,保证i<j
				j--;
			}
			while(arr[i]<=temp&&i<j){  //i从头部开始向后迭代，直到找到大于基数的值，保证i<j
				i++;
			}
			if(i<j){
				int a=arr[i];
				arr[i]=arr[j];
				arr[j]=a;
			}
		}
		arr[low]=arr[i];   //将基数放到分割线位置
		arr[i]=temp;
		
		quickSort(arr, low, j-1);
		quickSort(arr, j+1, high);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,3,6,8,4,6,2};
		quickSort(arr, 0, arr.length-1);
		for(int i:arr)
			System.out.println(i);
	}

}
