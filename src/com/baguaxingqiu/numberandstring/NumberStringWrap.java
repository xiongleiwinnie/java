package com.baguaxingqiu.numberandstring;

public class NumberStringWrap {

	/**
	 * @param args
	 *  1. ��byte,short,float,double�����Զ�������Զ�װ��
		2. byte��Integer֮���ܷ�����Զ�������Զ�װ��
		3. ͨ��Byte��ȡbyte�����ֵ
	 */
	public static void main(String[] args) {
		byte b1 = 1;
		short s1 = 2;
		float f1 = 3f;
		double d1 = 4.00;
		
		Byte b2 = b1;
		Short s2 = s1;
		Float f2 = f1;
		Double d2 = d1;
		
		b1 = b2;
		s1 = s2;
		f1 = f2;
		d1 = d2;
		
		//����
		
		System.out.println(Byte.MAX_VALUE);

	}

}
