package com.baguaxingqiu.loop;

public class PrimaryMath {

	/**
	 * @param args
	 * 小学算术题
	 */
	public static void main(String[] args) {
		for (int a = -100; a < 100; a++) {
			for (int b = -100; b < 100; b++) {
				for (int c = -100; c < 100; c++) {
					for (int d = -100; d < 100; d++) {
						if (a+b == 8 && c-d == 6 && a+c == 14 && b+d == 10) {
							System.out.println("a="+a+"\n"+"b="+b+"\n"+"c="+c+"\n"+"d="+d);
	
						}
					}
				}
			}
		}

	}

}
