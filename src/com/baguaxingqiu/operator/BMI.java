package com.baguaxingqiu.operator;

import java.util.Scanner;

public class BMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���������(m)��");
		float a = s.nextFloat();
		System.out.println("����������(kg)��");//float
		float b = s.nextFloat();
		float c = b/(a*a);
		System.out.println("��ǰ��BMI�ǣ�"+c);
		if (c<18.5) {
			System.out.println("����״̬�ǣ����ع���");
		} else if(c<24){
			System.out.println("����״̬�ǣ�������Χ");
		} else if(c<27){
			System.out.println("����״̬�ǣ����ع���");
		} else if(c<30){
			System.out.println("����״̬�ǣ���ȷ���");
		} else if(c<35){
			System.out.println("����״̬�ǣ��жȷ���");
		} else if(c>=35){
			System.out.println("����״̬�ǣ��ضȷ���");
		}

	}

}
