package com.baguaxingqiu.array;

import java.util.Random;

public class Merge {

	/**
	 * @param args
	 *  ����׼���������飬�����ĳ�����5-10֮������������ʹ���������ʼ������������
		Ȼ��׼�����������飬����������ĳ�����ǰ�����ĺ�
		ͨ��System.arraycopy ��ǰ��������ϲ���������������
		arraycopy(src, srcPos, dest, destPos, length)
		src: Դ����
		srcPos: ��Դ���鸴�����ݵ���ʼλ��
		dest: Ŀ������
		destPos: ���Ƶ�Ŀ���������ʼλ��
		length: ���Ƶĳ���
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int alength = random.nextInt(6)+5;
		int blength = random.nextInt(6)+5;
		int a[] = new int[alength];
		int b[] = new int[blength];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			b[i] = (int)(Math.random()*100);
			System.out.print(b[i]+" ");
		}
		System.out.println();
		int c[] = new int[alength+blength];
		System.arraycopy(a, 0, c, 0, alength);
		System.arraycopy(b, 0, c, alength, blength);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		

	}

}
