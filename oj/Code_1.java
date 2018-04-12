package oj;
/**
 * 【程序5】   题目：利用条件运算符的嵌套来完成此题：
 * 		学习成绩=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
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