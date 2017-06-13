package com.baguaxingqiu.array;

public class StrengthenForLoop {

	/**
	 * @param args
	 * 用增强型for循环找出最大的那个数
	 */
	public static void main(String[] args) {
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100);
			System.out.println(a[i]);
		}
		int b = 0;
		for(int each:a){
			if (b<each) {
				b = each;
			}
		}
		System.out.println("最大数为："+b);
		
	}

}
