package com.baguaxingqiu.loop;

public class Beggar_for {

	/**
	 * @param args
	 *  天朝有一个乞丐姓洪，去天桥要钱
		第一天要了1块钱
		第二天要了2块钱
		第三天要了4块钱
		第四天要了8块钱
		以此类推
		问题： 洪乞丐干10天，收入是多少？
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
