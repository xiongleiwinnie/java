package com.baguaxingqiu.io;

import java.io.UnsupportedEncodingException;

public class Chinese {

	/**
	 * @param args
	 * 找出 E5 B1 8C 这3个十六进制对应UTF-8编码的汉字
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] all = new byte[3];
		all[0] = (byte) 0xE5;
		all[1] = (byte) 0xB1;
		all[2] = (byte) 0x8C;
		String string = new String(all, "UTF-8");
		System.out.println(string);
		
	}

}
