package com.baguaxingqiu.numberandstring;

public class PrimeNumber {

	/**
	 * @param args
	 * 统计找出一千万以内，一共有多少质数、
	 * 只能被1和自己整除的数
	 */
	public static void main(String[] args) {
		int a = 0;
		for (int i = 1; i < 10000000; i++) {
			if (isPrime(i)) {
				a++;
			}
		}
		System.out.println(a);

	}
	
	public static boolean isPrime(int i){
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i%j==0) {
				return false;
			}
			
		}
		return true;
	}

}
