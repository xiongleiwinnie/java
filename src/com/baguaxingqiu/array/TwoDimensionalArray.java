package com.baguaxingqiu.array;

public class TwoDimensionalArray {

	/**
	 * @param args
	 *  定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
		找出这个二维数组里，最大的那个值，并打印出其二维坐标
	 */
	public static void main(String[] args) {
		//生成
		int a[][] = new int[5][5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random()*100);
				System.out.print(a[i][j]+" ");
						
			}
			System.out.println();
		}
		
		int temp = 0;
		//找到最大值
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > temp) {
					temp = a[i][j];
				}
			}
		}
		
		System.out.println("max is:"+temp);
		
		
	}

}
