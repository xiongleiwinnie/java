package com.baguaxingqiu.array;

import java.util.Arrays;

public class TwoDimensionaSort {

	/**
	 * @param args
	 *  首先定义一个5X8的二维数组，然后使用随机数填充满。
		借助Arrays的方法对二维数组进行排序。
	 */
	public static void main(String[] args) {
	    //生成
		int a[][] = new int[5][8];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random()*100);
				System.out.print(a[i][j]+" ");
						
			}
			System.out.println();
		}
		
		int b[] = new int[40];
		
		for (int i = 0; i < a.length; i++) {
			b = Arrays.copyOfRange(a[i], 0, 8);
		}
		
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i] = Arrays.copyOfRange(b, i*8, i*8+8);
				System.out.print(a[i][j]+" ");
						
			}
			System.out.println();
		}

	}

}
