package oj;
/**
 * ������5��   ��Ŀ�����������������Ƕ������ɴ��⣺
 * 		ѧϰ�ɼ�=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
 * @author DELL
 *
 */
public class Code_1{
	private char grade;
	public char grade(int score)
	{
		grade=score>=90?'A':(score>=60?'B':'C');
		return grade;
	}
}