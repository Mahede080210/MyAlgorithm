package oj;
/*使用递归算法反向打印数组元素*/
public class Code_21 {
	public static void printAll(int index,int[] arr){ 
		 System.out.println(arr[index]); 
		 if(index > 0){ 
		  printAll(--index,arr); 
		 }   
		} 
		public static void main(String[] args){ 
		 int[] arr={1,2,3,4,5}; 
		 printAll((arr.length)-1,arr); 
		}
}
