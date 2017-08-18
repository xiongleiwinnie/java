package com.baguaxingqiu.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class DecodeFile {

	/**
	 * @param args
	 * ����������а�decodingFile�����ݽ��н��ܣ�Ȼ�󱣴浽decodedFile�ļ��С�
		�����㷨�� 
		���֣�
		�������0�����֣���ԭ���Ļ����ϼ�1������6���5, 4���3
		�����0�����֣����9
		��ĸ�ַ���
		����Ƿ�a�ַ��������ƶ�һ��������e���d, H���G
		�����a��a->z, A-Z��
		�ַ���Ҫ������Сд
		����ĸ�ַ���
		����',&^ �������䣬����Ҳ��������
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
