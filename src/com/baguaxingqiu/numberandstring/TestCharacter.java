package com.baguaxingqiu.numberandstring;

public class TestCharacter {


	/**
	 * @param args
	 * 通过Scanner从控制台读取字符串，然后把字符串转换为字符数组
	 * 转换为字符数组后，筛选出控制台读取到的字符串中的大写字母和数字，并打印出来
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
