package com.baguaxingqiu.numberandstring;

public class NumberStringParse {

	/**
	 * @param args
	 *  �Ѹ����� 3.14 ת��Ϊ �ַ��� "3.14"
		�ٰ��ַ��� ��3.14�� ת��Ϊ ������ 3.14
		����ַ����� 3.1a4��ת��Ϊ��������õ�ʲô��
	 */
	public static void main(String[] args) {
		float f = 3.14f;
		String s = String.valueOf(f);
		f = Float.parseFloat(s);
		
		String ss = "3.1a4";
		f = Float.parseFloat(ss);
		
		System.out.println(f);
		//�ᱨ��

	}

}
