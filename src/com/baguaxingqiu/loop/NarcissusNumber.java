package com.baguaxingqiu.loop;

public class NarcissusNumber {

	/**
	 * @param args
	 *  水仙花数定义：
		1. 一定是3位数
		2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
		寻找所有的水仙花数
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if (i*i*i+j*j*j+k*k*k == i*100+k*10+j) {
						int l = i*100+k*10+j;
						if (l > 99) {
							System.out.println(l);
						}
						
					}
				}
			}
		}

	}

}
