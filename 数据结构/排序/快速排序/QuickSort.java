import java.security.PublicKey;

/*
    ����򵥵ķ�ʽ������������㷨���������Լ������չʾ����
    
  �㷨˼·��
  	1.��һ����������������һ�����е�һ����׼��������[  1 2 3 4 5]��ѡ��1��Ϊ����
  	2.����i������Ľ�β��ǰ�������ҵ�С�ڻ��������֣��ҵ���ͣ
  	3.����j�������ͷ����ʼ������Ѱ�Ҵ��ڻ�����ֵ���ҵ���ͣ��
  	4.�ж�i�Ƿ����j����i<jʱ������i��jλ�õ�ֵ��
  	5.����������ֱ��i==j����ʱ����������i��λ��
  	6.��ʱ���������С�ڻ�����ֵ���ұ��Ǵ��ڻ�����ֵ��
  	7.������ �������ߵ�����ָ�γ�����С���飬����ǰ��Ĳ��裬����������С���顣
  	
  	�ؼ��֣�������������ұ������ָ�
  	
  	�������£�
 * */
public class QuickSort {
	
	public static void quickSort(int[] arr,int low,int high){
		if(low>high)
			return;
		int i,j,temp;
		i=low; j=high;
		temp=arr[low];
		while(i<j){
			while(arr[j]>=temp&&i<j){   //j��β����ʼ��ǰ������ֱ���ҵ�С�ڻ�����ֵ,��֤i<j
				j--;
			}
			while(arr[i]<=temp&&i<j){  //i��ͷ����ʼ��������ֱ���ҵ����ڻ�����ֵ����֤i<j
				i++;
			}
			if(i<j){
				int a=arr[i];
				arr[i]=arr[j];
				arr[j]=a;
			}
		}
		arr[low]=arr[i];   //�������ŵ��ָ���λ��
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
