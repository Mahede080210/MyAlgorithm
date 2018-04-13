import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    /**
     * 请完成下面这个函数，实现题目要求的功能
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来
     *
     * @param a 贷款金额
     * @param i 年利率
     * @param n 贷款期限
     * @return 月还款额，保留2位小数，向上舍入
     */
    static String calculate(int a, double i, int n) {
        double result=0;
        int month=n*12;
        double sum1=sum(i,month);
        double sum2=sum(i,month-1);
        result=(a*(i*sum1))/sum2;
        return new Double(result).toString();
    }
    private static double sum(double i,int month){
        double sum=1;
        for(int s=0;s<month;s++)
            sum=sum*(1+i);
        return sum;  
    }
}