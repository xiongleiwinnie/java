package com.baguaxingqiu.array;

import java.util.Arrays;

public class TwoDimensionaSort {

	/**
	 * @param args
	 *  ���ȶ���һ��5X8�Ķ�ά���飬Ȼ��ʹ��������������
		����Arrays�ķ����Զ�ά�����������
	 */
	public static void main(String[] args) {
	    //����
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
