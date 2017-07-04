package com.baguaxingqiu.numberandstring;

public class Manipulate2 {

	/**
	 * @param args
	 *  英文绕口令
		peter piper picked a peck of pickled peppers
		统计这段绕口令有多少个以p开头的单词
	 */
	public static void main(String[] args) {
		String s = "peter piper picked a peck of pickled peppers";
		String[] s2 = s.split(" ");
		int count = 0;
		for (String s3:s2) {
			char ch = s3.charAt(0);
			if(ch == 'p'){
				count++;
			}
		}
		System.out.println(count);

	}

}
