package com.baguaxingqiu.numberandstring;

public class TestString {

	/**
	 * @param args
	 * ����һ��������5������ַ���������ַ��п��������֣���д��ĸ����Сд��ĸ
	 * ͨ������ֶξ��ܹ�֪���ַ� a-z A-Z 0-9 ����Ӧ�����ֵ�������
	 */
	public static void main(String[] args) {
		char[] ch = new char[5];
		short start = 0;
		short end = 'z'+1;
		for (int i = 0; i < ch.length; i++) {
			while (true) {
                char c = (char) ((Math.random() * (end - start)) + start);
                if (Character.isLetter(c) || Character.isDigit(c)) {
                    ch[i] = c;
                    break;
                    }
		        }
		

	    }
		System.out.println(ch);
	}
}
