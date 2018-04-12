package oj;

/**
 * ������20�� ��Ŀ����һ�������У� 2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡�
 */
public class Code_16 {
	/** ��ǰn��� */
	public double result(int n) {
		double result = 0;
		for(int i=1;i<=n;i++)
		{
			result=result+items(i);               //�������
		}
		result=(Math.floor(result*1000))/1000;          //������λС��
		return result;
	}

	/** ������� */
	private double items(int n) {
		double firstFenZi = 2;
		double firstFenMu = 1;
		double nextFenZi = 3;
		double nextFenMu = 2;
		double t1 = 0;            //��Ϊǰ��������ӵ������м����
		double t2 = 0;            //��Ϊǰ�������ĸ�������м����
		if (n == 1)
			return (firstFenZi / firstFenMu);
		else if (n == 2)
			return (nextFenZi / nextFenMu);
		else {
			for (int i = 2; i < n; i++) {
				nextFenMu = firstFenMu + nextFenMu;
				firstFenMu = nextFenMu;
				nextFenZi = firstFenZi + nextFenZi;
				firstFenZi = nextFenZi;
				t1 = firstFenMu;
				t2 = firstFenZi;
				firstFenMu = nextFenMu;
				firstFenZi = nextFenZi;
				nextFenMu = t1;
				nextFenZi = t2;

			}
			return (nextFenZi / nextFenMu);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code_16 test=new Code_16();
		System.out.println("ǰ20���>>>>>"+test.result(20));
	}

}
