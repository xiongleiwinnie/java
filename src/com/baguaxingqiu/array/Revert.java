package com.baguaxingqiu.array;

public class Revert {

	/**
	 * @param args
	 *  ���ȴ���һ��������5������,������������ 
		ʹ��forѭ������whileѭ�������������ʵ�ַ�תЧ��
	 */
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = (int)(Math.random()*100);
		a[1] = (int)(Math.random()*100);
		a[2] = (int)(Math.random()*100);
		a[3] = (int)(Math.random()*100);
		a[4] = (int)(Math.random()*100);
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		int b[] = new int[5];
		b[0] = a[0];
		b[1] = a[1];
		b[2] = a[2];
		b[3] = a[3];
		b[4] = a[4];
		for (int i = 0; i < 5; i++) {
			a[i] = b[4-i];
			System.out.println(a[i]);
		}
		//Ҳ���Բ�����β����

	}

}
