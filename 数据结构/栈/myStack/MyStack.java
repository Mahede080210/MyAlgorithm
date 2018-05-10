package com.ruider.myStack;

import java.io.ObjectStreamException;
import java.util.Stack;

public class MyStack {
	
	private int defaultSize=10;      //默认栈深度大小

	private Object[] stack;
	private int depth;               //记录栈深度
	
	public MyStack(){
		stack=new Object[defaultSize];
		depth=0;
	}
	
	public MyStack(int MAXSIZE){
		stack=new Object[MAXSIZE];
		depth=0;
	}
	
	//清空
	public void clear(){
		this.depth=0;
	}
	
	//元素个数
	public int length(){
		return depth;
	}
	
	//是否为空
	public boolean isEmpty(){
		return depth==0;
	}
	
	//栈顶
	public Object peek() {
		if(depth==0)
			throw new RuntimeException("栈已空");
		return stack[depth-1];
	}
	
	//入栈
	public void push(Object obj) {
		if(depth==stack.length)
			throw new RuntimeException("Stack has been over!");
		stack[depth]=obj;
		depth++;
	}
	
	//出栈
	
	public Object pop() {
		if(depth==0)
			throw new RuntimeException("栈已空");
		Object obj=stack[depth-1];
		depth--;
		return obj;
	}
	
	
	/*
	 * 剑指offer--面试题22:栈的压入、弹出序列--Java实现
	 * 题目描述：

			输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出序列。假如压入栈的所有数字均不相同。
			例如序列1、2、3、4、5是某栈的压栈序列，序列4、5、3、2、1是该栈序列对应的一个弹出序列，但4、3、5、1、2就不可能是
			该压栈序列的弹出序列。
		解题思路： 
			这种题以前在考试或考研中很常见的选择题，进出栈模拟过程就不解释了。只说一下编程思路： 
			如果下一个弹出的数字刚好是栈顶数字，那么直接弹出。如果下一个弹出的数字不在栈顶，我们把压栈序列中还没有入栈的数字压入栈，直到
			把下一个需要弹出的数字压入栈顶为止。如果所有的数字都压入了栈仍然没找到下一个弹出的数字，那么该序列不可能是一个弹出序列.
	 */
	public boolean IsPopOrder(int [] pushA,int [] popA) {
		if(pushA==null||popA==null||(pushA.length!=popA.length))
			return false;
	    Stack<Integer> stack=new Stack<Integer>();
	    stack.push(pushA[0]);
	    int i=1,j=0;              //i标记pushA的下标，j标记popA的下标 
        while(j<popA.length&&i<=pushA.length){
            if(stack.peek()==popA[j]){
                stack.pop();
                j++;
            }else{
                if(i==pushA.length)          //因为while循环中使用了i<=pushA.length,这里必须判断一下，不然异常
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
