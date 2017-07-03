package com.baguaxingqiu.numberandstring;

public class TestString2 {

	/**
	 * @param args
	 * 创建一个长度是8的字符串数组
	 * 使用8个长度是5的随机字符串初始化这个数组
	 * 对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)
	 */
	public static void main(String[] args) {
		String[] s = new String[8];
		short start = 0;
		short end = 'z'+1;
		char[] ch = new char[5];
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				while (true) {
					char c = (char)(Math.random()*(end-start)+start);
					if (Character.isDigit(c)||Character.isUpperCase(c)) {
						ch[j] = c;
						break;
					}
				}
			}
			s[i] = String.valueOf(ch);
			//System.out.println(s[i]);
		}
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length-i-1; j++) {
				char a = s[j].charAt(0);
				char b = s[j+1].charAt(0);
				char aa = Character.toLowerCase(a);
				char bb = Character.toLowerCase(b);
				if (aa > bb) {
					String temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
				
			}
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		


	}

}
