package com.baguaxingqiu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringBufferInputStream;

public class RemoveBom {

	/**
	 * @param args
	 * ÒÆ³ýBom
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("D:/test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] content = new byte[(int) file.length()];
        fileInputStream.read(content);
        String string = new String(content,"UTF-8");
        System.out.println(string);
        for (byte b : content) {
        	int i = b&0xff;
			System.out.println(Integer.toHexString(i)+" ");
		}
        
        
	}

}
