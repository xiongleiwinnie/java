package com.baguaxingqiu.loop;

public class Ignore_continue {

	/**
	 * @param args
	 * 打印 1-100之前的数，如果这个数，要么是3，要么5的倍数，就忽略掉
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			if (i%3==0||i%5==0) {
				continue;
			}
			System.out.println(i);
			
		}

	}

}
