package com.baguaxingqiu.array;

import java.util.Random;

public class Merge {

	/**
	 * @param args
	 *  首先准备两个数组，他俩的长度是5-10之间的随机数，并使用随机数初始化这两个数组
		然后准备第三个数组，第三个数组的长度是前两个的和
		通过System.arraycopy 把前两个数组合并到第三个数组中
		arraycopy(src, srcPos, dest, destPos, length)
		src: 源数组
		srcPos: 从源数组复制数据的启始位置
		dest: 目标数组
		destPos: 复制到目标数组的启始位置
		length: 复制的长度
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
