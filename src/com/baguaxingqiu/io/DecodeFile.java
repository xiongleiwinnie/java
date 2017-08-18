package com.baguaxingqiu.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class DecodeFile {

	/**
	 * @param args
	 * 在这个方法中把decodingFile的内容进行解密，然后保存到decodedFile文件中。
		解密算法： 
		数字：
		如果不是0的数字，在原来的基础上减1，比如6变成5, 4变成3
		如果是0的数字，变成9
		字母字符：
		如果是非a字符，向左移动一个，比如e变成d, H变成G
		如果是a，a->z, A-Z。
		字符需要保留大小写
		非字母字符：
		比如',&^ 保留不变，中文也保留不变
	 */
	public static void main(String[] args) {
		File encodingFile = new File("D:/encode1.txt");
		File encodedFile = new File("D:/decode.txt");
		decodeFile(encodedFile,encodingFile);

	}
	private static void decodeFile(File encodedFile,File encodingFile) {
		try {
			FileReader fileReader = new FileReader(encodedFile);
			FileWriter fileWriter = new FileWriter(encodingFile);
			char[] fileContent = new char[(int) encodedFile.length()];
			fileReader.read(fileContent);
			decode(fileContent);
			fileWriter.write(fileContent);
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void decode(char[] fileContent) {
		for (int i = 0; i < fileContent.length; i++) {
			char c = fileContent[i];
			if (isLetterOrDigit(c)) {
				switch (c) {
				case '0':
					c = '9';
					break;
				case 'a':
					c = 'z';
					break;
				case 'A':
					c = 'Z';
					break;
				default:
					c--;
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
