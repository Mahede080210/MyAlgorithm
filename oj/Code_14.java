package oj;
/**  ������18��   ��Ŀ������ƹ����ӽ��б������������ˡ�
 * �׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ��������������
 * �������Ա����������������a˵������x�ȣ�c˵������x,z�ȣ�����
    ���ҳ��������ֵ�������
*/
public class Code_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] jia={'a','b','c'};
		char[] yi={'x','y','z'};
		for(int i=0;i<jia.length;i++)
			for(int j=0;j<yi.length;j++)
			{
				if((jia[i]=='a'&&yi[j]=='x')||(jia[i]=='a')&&yi[j]=='y')
					continue;
				else if((jia[i]=='b'&&yi[j]=='y')||(jia[i]=='b'&&yi[j]=='z'))
					continue;
				else if ((jia[i]=='c'&&yi[j]=='x')||(jia[i]=='c'&&yi[j]=='z')) 
					continue;
				else {
					System.out.println(jia[i]+" vs "+yi[j]);
				}
				
		}
	}

}
