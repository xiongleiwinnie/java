package com.baguaxingqiu.array;

public class Sort {

	/**
	 * @param args
	 *  ���ȴ���һ��������5������,������������ 
		������ѡ��������Ȼ���ٶ���ʹ��ð�ݷ�������
	 */
	public static void main(String[] args) {
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100);
			System.out.println(a[i]);
		}
		
		//ѡ��
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				};
			}
		}
		
		//ð�ݷ�
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length-i-1; j++) {
//				if (a[i]<a[i+1]) {
//					int temp = a[i];
//					a[i] = a[i+1];
//					a[i+1] = temp;
//				}
//			}
//		}
		
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		

	}

}
