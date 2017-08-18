package com.baguaxingqiu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

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
		File encodingFile = new File("D:/encode.txt");
		File encodedFile = new File("D:/decode.txt");
		encodeFile(encodingFile,encodedFile);

	}

	private static void encodeFile(File encodingFile, File encodedFile) {
		try {
			FileReader fileReader = new FileReader(encodingFile);
			FileWriter fileWriter = new FileWriter(encodedFile);
			char[] fileContent = new char[(int) encodingFile.length()];
			fileReader.read(fileContent);
			encode(fileContent);
			fileWriter.write(fileContent);
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void encode(char[] fileContent) {
		for (int i = 0; i < fileContent.length; i++) {
			char c = fileContent[i];
			if (isLetterOrDigit(c)) {
				switch (c) {
				case '9':
					c = '0';
					break;
				case 'z':
					c = 'a';
					break;
				case 'Z':
					c = 'A';
					break;
				default:
					c++;
					break;
				}
			}
			fileContent[i] = c;
		}
		
	}

	private static boolean isLetterOrDigit(char c) {
		String letterOrDigit = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		return -1 == letterOrDigit.indexOf(c)?false:true;
	}

}
