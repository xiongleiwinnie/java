package com.baguaxingqiu.numberandstring;

import javax.xml.stream.events.EndDocument;

public class Compare {

	/**
	 * @param args
	 *  ����һ��������100���ַ�������
		ʹ�ó�����2������ַ������ַ�������
		ͳ������ַ����������ظ����ַ����ж�����
	 */
	public static void main(String[] args) {
		String[] s = new String[100];
		for (String string : s) {
			short start = 0;
			short end = 'z'+1;
			char a = (char)(Math.random()*(end-start)+start);
			char b = (char)(Math.random()*(end-start)+start);
			string = String.valueOf(a)+String.valueOf(b);
		}
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			String string = s[i];
			for (int j = 0; j < s.length; j++) {
				String string1 = s[j];
				if (string1.equalsIgnoreCase(string)){
					count++;
				}
			}
		}
		
		System.out.println(count);
		

	}

}
