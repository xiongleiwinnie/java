package com.baguaxingqiu.loop;

public class Beggar_for {

	/**
	 * @param args
	 *  �쳯��һ����ؤ�պ飬ȥ����ҪǮ
		��һ��Ҫ��1��Ǯ
		�ڶ���Ҫ��2��Ǯ
		������Ҫ��4��Ǯ
		������Ҫ��8��Ǯ
		�Դ�����
		���⣺ ����ؤ��10�죬�����Ƕ��٣�
	 */
	public static void main(String[] args) {
		int sum = 0;
		int single = 1;
		for (int i = 1; i < 11; i++) {
			sum += single;
			single *= 2;	
		}
		System.out.println(sum);
		

	}

}
