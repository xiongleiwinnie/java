package com.baguaxingqiu.numberandstring;

public class TestString {

	/**
	 * @param args
	 * 创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母
	 * 通过这个手段就能够知道字符 a-z A-Z 0-9 所对应的数字的区间了
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
