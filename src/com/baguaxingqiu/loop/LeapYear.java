package com.baguaxingqiu.loop;

import java.util.Scanner;

public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���������");
		int year = s.nextInt();
		if (((year%4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.println(year+"������");
		} else {
			System.out.println(year+"��������");
		}

	}

}
