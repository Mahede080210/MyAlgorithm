
/*��Ŀ����
����÷���ǰ����������������Լ�����̾�µ����֮�޵Ľ���С�

 �������������������һ����ֵĺ�����ʾ��

�� x <= 100 ʱ��f(x) = f(f(x + 11));

����f(x) = x - 10��

���յ����������Լ�������������������� ���������һ�°ɣ�

����
�������롣

��һ����һ���� n, ��ʾ���������� n ������(n <= 300000)

���� n �У���ʾ x ��x ��Ϊ�������� ( - 1011 <= x <= 1011)

���
����ÿ������ x �����һ��һ��������ʾ f(x) ��ֵ��*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main4 {

	public static int f(int x) {
		if (x > 100)
			return (x - 10);
		return f(f(x + 11));
	}

	public static void main(String[] args) {
		// TODO Auto-ge2
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		if (n <= 300000) {
			ArrayList<Integer> array = new ArrayList<Integer>();
			for (long i = 0; i < n; i++){
				int x=in.nextInt();
				if((x>=-1011)&&(x<=1011))
					array.add(x);
				else
					return;
			}
				
			Iterator<Integer> it = array.iterator();
			while (it.hasNext()) {
				System.out.println(f(it.next()));
			}
		}
	}
}
