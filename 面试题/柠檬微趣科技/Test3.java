
public class Test3 {
	public boolean isValid(String str){
		int m=0,n=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='(')
				m++;
			if(str.charAt(i)==')')
				n++;
		}
		if(m==n)
		    return true;
		return false;
	}
}
