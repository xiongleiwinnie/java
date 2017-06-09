package com.baguaxingqiu.loop;

public class Millionaire_break {

	/**
	 * @param args
	 *  假设你月收入是3000，除开平时花销，每个月留下1000块钱进行投资。
		然后你认真的专研了 《股票和基金 21天从入门到精通》，达到了每年20%的投资回报率。
		那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
		（复利计算按照每年12000投入计算，不按照每月计息）
		复利公式：
		F = p* ( (1+r)^n );
		F 最终收入
		p 本金
		r 年利率
		n 存了多少年

	 */
	public static void main(String[] args) {
		double sum = 0;
		int j = 0;
		for (int i = 1; i < 1000; i++) {
			if (sum>=1000000) {
				break;
			}
			sum += 12000;
			sum = sum*1.2;
			System.out.println(i);
			System.out.println(sum);
			
		}

	}

}
