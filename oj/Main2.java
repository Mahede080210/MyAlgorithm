/*
 ��Ŀ����
���Ƕ�ϲ�� A+B ����,������������������һ����������,���� A+B �� C
����ʽ,���ҹ涨 A, B, C �����������������Ѿ�֪���� C �Ĵ�С,�����ж�
�ٶԲ�ͬ�� (A, B) ���� A + B <= C,(A, B) �� (A �� , B �� ) ����Ϊ��ͬ���ҽ���
A  <> A �� �� B  <> B �� ��

����
�ж�������,���뿪ʼ�ĵ�һ����һ������ T, (T �� 100),������������ ��
���� T ��,ÿ��һ�������� C, C �� 10000,�������������Ѿ�˵����

���
����ÿ�� C,���һ��,����һ������,������������� (A, B) �Ķ�����

��������
3
1
4
100
�������
0
6
4950
 
 */
import java.util.Scanner;
public class Main2 {

	public static  int result(int x){
		int result=0;
		for(int i=1;i<x;i++){
			for(int j=1;j<x;j++){
				if((i+j)<=x){
					result++;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		//in.nextLine();
		int[] nums=new int[n];
		int t=0;
		while(t<n){
			nums[t]=in.nextInt();
			//in.nextLine();
			//System.out.print(t+"....."+nums[t]);
			t++;
			
		}
		
		for(int i=0;i<n;i++)
			System.out.println(result(nums[i]));

	}
}
