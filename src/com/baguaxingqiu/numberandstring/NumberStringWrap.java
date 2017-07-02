package com.baguaxingqiu.numberandstring;

public class NumberStringWrap {

	/**
	 * @param args
	 *  1. 对byte,short,float,double进行自动拆箱和自动装箱
		2. byte和Integer之间能否进行自动拆箱和自动装箱
		3. 通过Byte获取byte的最大值
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
		
		//不能
		
		System.out.println(Byte.MAX_VALUE);

	}

}
