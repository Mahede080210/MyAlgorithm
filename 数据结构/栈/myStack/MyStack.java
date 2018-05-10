package com.ruider.myStack;

import java.io.ObjectStreamException;
import java.util.Stack;

public class MyStack {
	
	private int defaultSize=10;      //Ĭ��ջ��ȴ�С

	private Object[] stack;
	private int depth;               //��¼ջ���
	
	public MyStack(){
		stack=new Object[defaultSize];
		depth=0;
	}
	
	public MyStack(int MAXSIZE){
		stack=new Object[MAXSIZE];
		depth=0;
	}
	
	//���
	public void clear(){
		this.depth=0;
	}
	
	//Ԫ�ظ���
	public int length(){
		return depth;
	}
	
	//�Ƿ�Ϊ��
	public boolean isEmpty(){
		return depth==0;
	}
	
	//ջ��
	public Object peek() {
		if(depth==0)
			throw new RuntimeException("ջ�ѿ�");
		return stack[depth-1];
	}
	
	//��ջ
	public void push(Object obj) {
		if(depth==stack.length)
			throw new RuntimeException("Stack has been over!");
		stack[depth]=obj;
		depth++;
	}
	
	//��ջ
	
	public Object pop() {
		if(depth==0)
			throw new RuntimeException("ջ�ѿ�");
		Object obj=stack[depth-1];
		depth--;
		return obj;
	}
	
	
	/*
	 * ��ָoffer--������22:ջ��ѹ�롢��������--Javaʵ��
	 * ��Ŀ������

			���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ������С�����ѹ��ջ���������־�����ͬ��
			��������1��2��3��4��5��ĳջ��ѹջ���У�����4��5��3��2��1�Ǹ�ջ���ж�Ӧ��һ���������У���4��3��5��1��2�Ͳ�������
			��ѹջ���еĵ������С�
		����˼·�� 
			��������ǰ�ڿ��Ի����кܳ�����ѡ���⣬����ջģ����̾Ͳ������ˡ�ֻ˵һ�±��˼·�� 
			�����һ�����������ָպ���ջ�����֣���ôֱ�ӵ����������һ�����������ֲ���ջ�������ǰ�ѹջ�����л�û����ջ������ѹ��ջ��ֱ��
			����һ����Ҫ����������ѹ��ջ��Ϊֹ��������е����ֶ�ѹ����ջ��Ȼû�ҵ���һ�����������֣���ô�����в�������һ����������.
	 */
	public boolean IsPopOrder(int [] pushA,int [] popA) {
		if(pushA==null||popA==null||(pushA.length!=popA.length))
			return false;
	    Stack<Integer> stack=new Stack<Integer>();
	    stack.push(pushA[0]);
	    int i=1,j=0;              //i���pushA���±꣬j���popA���±� 
        while(j<popA.length&&i<=pushA.length){
            if(stack.peek()==popA[j]){
                stack.pop();
                j++;
            }else{
                if(i==pushA.length)          //��Ϊwhileѭ����ʹ����i<=pushA.length,��������ж�һ�£���Ȼ�쳣
                    break;
                stack.push(pushA[i]);
                i++;
            }
        }
	    return stack.isEmpty()? true:false;
	}
	
	public static void main(String[] args){
		MyStack stack=new MyStack(10);
		
		String a1="abc1";
		String a2="abc2";
		String a3="abc3";
		
		stack.push(a1);
		stack.push(a2);
		stack.push(a3);
		
		while(!stack.isEmpty()){
			System.out.println((String)stack.pop());
		}
		
	}
}
