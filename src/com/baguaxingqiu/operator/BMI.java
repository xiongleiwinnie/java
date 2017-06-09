package com.baguaxingqiu.operator;

import java.util.Scanner;

public class BMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入身高(m)：");
		float a = s.nextFloat();
		System.out.println("请输入体重(kg)：");//float
		float b = s.nextFloat();
		float c = b/(a*a);
		System.out.println("当前的BMI是："+c);
		if (c<18.5) {
			System.out.println("身体状态是：体重过轻");
		} else if(c<24){
			System.out.println("身体状态是：正常范围");
		} else if(c<27){
			System.out.println("身体状态是：体重过轻");
		} else if(c<30){
			System.out.println("身体状态是：轻度肥胖");
		} else if(c<35){
			System.out.println("身体状态是：中度肥胖");
		} else if(c>=35){
			System.out.println("身体状态是：重度肥胖");
		}

	}

}
