package com.baguaxingqiu.loop;

public class Ignore_continue {

	/**
	 * @param args
	 * ��ӡ 1-100֮ǰ����������������Ҫô��3��Ҫô5�ı������ͺ��Ե�
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			if (i%3==0||i%5==0) {
				continue;
			}
			System.out.println(i);
			
		}

	}

}
