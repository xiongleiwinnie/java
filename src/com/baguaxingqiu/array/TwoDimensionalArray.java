package com.baguaxingqiu.array;

public class TwoDimensionalArray {

	/**
	 * @param args
	 *  ����һ��5X5�Ķ�ά���顣 Ȼ��ʹ����������ö�ά���顣
		�ҳ������ά����������Ǹ�ֵ������ӡ�����ά����
	 */
	public static void main(String[] args) {
		//����
		int a[][] = new int[5][5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random()*100);
				System.out.print(a[i][j]+" ");
						
			}
			System.out.println();
		}
		
		int temp = 0;
		//�ҵ����ֵ
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
