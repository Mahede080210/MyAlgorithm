package oj;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLService;

/**
 * ������12��  ��Ŀ����ҵ���ŵĽ������������ɡ�
 * 						����(I)���ڻ����10��Ԫʱ���������10%��
 * 						�������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣������7.5%��
 *						 20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��
 * 						40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
 *						 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
 *						 �Ӽ������뵱������lirun����Ӧ���Ž�������sum��

 * @author DELL
 *
 */
public class Code_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		Code_8 test =new Code_8();
		System.out .print("���뵱������>>");
		double lirun=keyboard.nextDouble();
		System.out .println(lirun+"��ԪӦ�����Ž�������Ϊ>>>>>"+test.incoming(lirun)+"��Ԫ");
		System.exit(0);
	}
	
	public double incoming(double get)
	{
		double sum;
		if(get<=10)
			sum=get*0.1;     //10���£�10%
		else if(get<=20)
			sum=10*0.1+(get-10)*0.075;     //10���£�10%��10���ϣ�7.5%
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
