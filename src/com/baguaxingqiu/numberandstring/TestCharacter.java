package com.baguaxingqiu.numberandstring;

public class TestCharacter {


	/**
	 * @param args
	 * ͨ��Scanner�ӿ���̨��ȡ�ַ�����Ȼ����ַ���ת��Ϊ�ַ�����
	 * ת��Ϊ�ַ������ɸѡ������̨��ȡ�����ַ����еĴ�д��ĸ�����֣�����ӡ����
	 */
	public static void main(String[] args) {
		String s = "abcdefABC123";
		char[] ch = s.toCharArray();
		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])||Character.isDigit(ch[i])) {
				System.out.println(ch[i]);
			}
		}

	}

}
