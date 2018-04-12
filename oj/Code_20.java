package oj;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Code_20 {

	/** 请完成下面这个函数，实现题目要求的功能 **/
	/** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^ **/
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String res;

		int _inputStr_size = 0;
		_inputStr_size = Integer.parseInt(in.nextLine().trim());
		String[] _inputStr = new String[_inputStr_size];
		String _inputStr_item;
		for (int _inputStr_i = 0; _inputStr_i < _inputStr_size; _inputStr_i++) {
			try {
				_inputStr_item = in.nextLine();
			} catch (Exception e) {
				_inputStr_item = null;
			}
			_inputStr[_inputStr_i] = _inputStr_item;
		}
		Code_20 code=new Code_20();
		res = code.getMinMaxTime(_inputStr);
		if(res=="N/A,N/A")
			res="N/A";
		System.out.println(res);
	}
	
   private String getMinMaxTime(String[] inputStr) {
		int length = inputStr.length;
		String target="";
		String min = getMinTime(inputStr);

		String max = getMaxTime(inputStr);
		target=min+","+max;
		return target;
	}

	private  String getMinTime(String[] inputStr) {
		int[] a = toInt(inputStr);
		a = sort(a);
		a=dealedMinNo(a);
		if (isOk(a))
			return toString(a);
		else
			return "N/A";
	}

	private String getMaxTime(String[] inputStr) {
		int[] a = toInt(inputStr);
		a = sort(a);
		a=dealedMaxNo(a);
		if (isOk(a))
			return toString(a);
		else
			return "N/A";
	}

	private int[] toInt(String[] str) {
		int[] target = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			target[i] = Integer.parseInt(str[i]);
		}
		return target;
	}

	private String toString(int[] a) {
		StringBuffer sb = new StringBuffer();
		if (!isOk(a))
			sb.append("N/A");
		else
			for (int i = 0; i < a.length; i++) {
				if (i == 1 || i == 3)
					sb.append(a[i] + ":");
				else
					sb.append(a[i]);
			}
		return sb.toString();
	}

	private int[] sort(int[] a) {
		Arrays.sort(a);
		return a;
	}

	private boolean isOk(int[] a) {
		if ((a[0] * 10 + a[1] > 23) || (a[0] * 10 + a[1] == 23) || (a[2] * 10 + a[3] > 60) || (a[4] * 10 + a[5] > 60)) {
			return false;
		} else
			return true;
	}
	
	private int[] dealedMaxNo(int[] a)
	{
		int[] b=a;
		int s = 1;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			temp = a[2];
			a[2] = a[a.length - s];
			a[a.length - s] = temp;
			s++;
		}
		temp = a[0];
		a[0] = a[1];
		a[1] = temp;
		return b;
	}
	
	private int[] dealedMinNo(int[] b)
	{
		int[] a=b;
		int s = 1;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			temp = a[2];
			a[2] = a[a.length - s];
			a[a.length - s] = temp;
			s++;
		}
		return a;
	}
}
