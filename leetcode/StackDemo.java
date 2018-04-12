package leetcode;

import java.util.*;
public class StackDemo {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<Integer>();
        for(String str:tokens){
            if(str.equals("+")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a+b);
            }else if(str.equals("*")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a*b);
            }else if(str.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b/a);
            }else
                stack.push(Integer.parseInt(str));
        }
        return stack.pop();
    }
}

