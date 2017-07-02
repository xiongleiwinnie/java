package com.baguaxingqiu.numberandstring;

public class NaturalLogarithm {

	/**
	 * @param args
	 * 借助Math的方法，把自然对数计算出来
	 */
	public static void main(String[] args) {
		double n = Double.MAX_VALUE;
		double n1 = (double)1d/n;
		double e = (double)Math.pow(1+n1, n);
		System.out.println(e);
		System.out.println(Math.E);   

	}

}
