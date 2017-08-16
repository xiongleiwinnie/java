package com.baguaxingqiu.io;

public class EncodeFile {

	/**
	 * @param args
	 * 在这个方法中把encodingFile的内容进行加密，然后保存到encodedFile文件中。
		加密算法： 
		数字：
		如果不是9的数字，在原来的基础上加1，比如5变成6, 3变成4
		如果是9的数字，变成0
		字母字符：
		如果是非z字符，向右移动一个，比如d变成e, G变成H
		如果是z，z->a, Z-A。
		字符需要保留大小写
		非字母字符
		比如',&^ 保留不变，中文也保留不变
	 */
	public static void main(String[] args) {
		

	}

}
