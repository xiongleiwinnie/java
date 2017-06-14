package com.baguaxingqiu.array;

import java.util.Arrays;

public class TwoDimensionaSort {

	/**
	 * @param args
	 *  首先定义一个5X8的二维数组，然后使用随机数填充满。
		借助Arrays的方法对二维数组进行排序。
	 */
	public static void main(String[] args) {
	    //先把二维数组使用System.arraycopy进行数组复制到一个一维数组
		//然后使用sort进行排序
		//最后再复制回到二维数组。
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
			System.arraycopy(a[i], 0, b, i*8, 8);
			//用System.arraycopy不能用Arrays.copyOfRange
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
