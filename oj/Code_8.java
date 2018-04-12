package oj;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLService;

/**
 * 【程序12】  题目：企业发放的奖金根据利润提成。
 * 						利润(I)低于或等于10万元时，奖金可提10%；
 * 						利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
 *						 20万到40万之间时，高于20万元的部分，可提成5%；
 * 						40万到60万之间时高于40万元的部分，可提成3%；
 *						 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
 *						 从键盘输入当月利润lirun，求应发放奖金总数sum？

 * @author DELL
 *
 */
public class Code_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		Code_8 test =new Code_8();
		System.out .print("输入当月利润>>");
		double lirun=keyboard.nextDouble();
		System.out .println(lirun+"万元应当发放奖金总数为>>>>>"+test.incoming(lirun)+"万元");
		System.exit(0);
	}
	
	public double incoming(double get)
	{
		double sum;
		if(get<=10)
			sum=get*0.1;     //10以下，10%
		else if(get<=20)
			sum=10*0.1+(get-10)*0.075;     //10以下，10%；10以上，7.5%
		else if(get<=40)
			sum=10*0.1+10*0.075+(get-20)*0.05;
		else if(get<=60)
			sum=10*0.1+10*0.075+20*0.05+(get-40)*0.03;
		else if(get<=100)
			sum=10*0.1+10*0.075+20*0.05+20*0.03+(get-60)*0.015;
		else 
			sum=10*0.1+10*0.075+20*0.05+20*0.03+40*0.015+(get-100)*0.001;
		return sum;
	}

}
