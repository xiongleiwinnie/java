package com.baguaxingqiu.array;

public class StrengthenForLoop {

	/**
	 * @param args
	 * ����ǿ��forѭ���ҳ������Ǹ���
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
		System.out.println("�����Ϊ��"+b);
		
	}

}
