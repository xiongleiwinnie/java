package com.baguaxingqiu.numberandstring;

public class NumberStringParse {

	/**
	 * @param args
	 *  把浮点数 3.14 转换为 字符串 "3.14"
		再把字符串 “3.14” 转换为 浮点数 3.14
		如果字符串是 3.1a4，转换为浮点数会得到什么？
	 */
	public static void main(String[] args) {
		float f = 3.14f;
		String s = String.valueOf(f);
		f = Float.parseFloat(s);
		
		String ss = "3.1a4";
		f = Float.parseFloat(ss);
		
		System.out.println(f);
		//会报错

	}

}
