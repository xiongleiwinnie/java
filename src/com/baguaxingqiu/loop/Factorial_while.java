package com.baguaxingqiu.loop;

import java.util.Scanner;

public class Factorial_while {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��������");
		int a = scanner.nextInt();
		int i = a;
		int b = 1;
		while (i>=1) {
			b *= i;
			i--;
		}
		System.out.println("�׳��ǣ�"+b);

	}

}
