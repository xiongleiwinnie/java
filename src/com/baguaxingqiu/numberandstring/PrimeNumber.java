package com.baguaxingqiu.numberandstring;

public class PrimeNumber {

	/**
	 * @param args
	 * ͳ���ҳ�һǧ�����ڣ�һ���ж���������
	 * ֻ�ܱ�1���Լ���������
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
