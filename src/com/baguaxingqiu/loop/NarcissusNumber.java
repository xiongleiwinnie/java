package com.baguaxingqiu.loop;

public class NarcissusNumber {

	/**
	 * @param args
	 *  ˮ�ɻ������壺
		1. һ����3λ��
		2. ÿһλ��������������ǡ�����������������153=1*1*1+5*5*5+3*3*3
		Ѱ�����е�ˮ�ɻ���
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if (i*i*i+j*j*j+k*k*k == i*100+k*10+j) {
						int l = i*100+k*10+j;
						if (l > 99) {
							System.out.println(l);
						}
						
					}
				}
			}
		}

	}

}
