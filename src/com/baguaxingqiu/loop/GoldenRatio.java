package com.baguaxingqiu.loop;

public class GoldenRatio {

	/**
	 * @param args
	 *  Ѱ��ĳ��������������� ��ƽ�ָ�� 0.618���
		��ĸ�ͷ��Ӳ���ͬʱΪż��
		��ĸ�ͷ��� ȡֵ��Χ��[1-20]
	 */
	public static void main(String[] args) {
		int a = 0;//����
		int b = 0;//������
		double c = 20.0;//���
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
		//i/jʱһ��Ҫǿת��double��������������

	}

}
