package com.baguaxingqiu.loop;

public class GoldenRatio {

	/**
	 * @param args
	 *  寻找某两个数相除，其结果 离黄金分割点 0.618最近
		分母和分子不能同时为偶数
		分母和分子 取值范围在[1-20]
	 */
	public static void main(String[] args) {
		int a = 0;//除数
		int b = 0;//被除数
		double c = 20.0;//相差
		double d = 20.0;//result
		for (int i = 1; i < 21; i++) {
			for (int j = 1; j < 21; j++) {
				if (i%2==0&&j%2==0) {
					continue;
				}
                
				if (Math.abs((double)i/j-0.618)-c<0) {
					a = i;
					b = j;
					c = Math.abs((double)i/j-0.618);
					d = (double)i/j;
					
				}
			}
			
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		//i/j时一定要强转成double！！！！！！！

	}

}
