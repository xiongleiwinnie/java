package com.baguaxingqiu.numberandstring;

public class Manipulate4 {

	/**
	 * @param args
	 * 把 lengendary 最后一个字母变大写
	 */
	public static void main(String[] args) {
		String s = "lengendary";
		int length = s.length();
		String s1 = s.substring(0, length-1);
		String s2 = s.substring(length-1);
		s2 = s2.toUpperCase();
		s = s1+s2;
		System.out.println(s);
		
		
	}

}
