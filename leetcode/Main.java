import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    /**
     * ������������������ʵ����ĿҪ��Ĺ���
     * ��Ȼ����Ҳ���Բ��������ģ����������ȫ�����Լ����뷨��
     *
     * @param a ������
     * @param i ������
     * @param n ��������
     * @return �»�������2λС������������
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