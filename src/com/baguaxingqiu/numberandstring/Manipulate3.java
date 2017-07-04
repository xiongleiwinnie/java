package com.baguaxingqiu.numberandstring;

public class Manipulate3 {

	/**
	 * @param args
	 * 把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy
	 */
	public static void main(String[] args) {
		String s = "lengendary";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i%2 == 0) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		s = String.valueOf(ch);
		System.out.println(s);

	}

}
