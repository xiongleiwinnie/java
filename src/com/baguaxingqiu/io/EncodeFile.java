package com.baguaxingqiu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class EncodeFile {

	/**
	 * @param args
	 * ����������а�encodingFile�����ݽ��м��ܣ�Ȼ�󱣴浽encodedFile�ļ��С�
		�����㷨�� 
		���֣�
		�������9�����֣���ԭ���Ļ����ϼ�1������5���6, 3���4
		�����9�����֣����0
		��ĸ�ַ���
		����Ƿ�z�ַ��������ƶ�һ��������d���e, G���H
		�����z��z->a, Z-A��
		�ַ���Ҫ������Сд
		����ĸ�ַ�
		����',&^ �������䣬����Ҳ��������
	 */
	public static void main(String[] args) {
		File encodingFile = new File("D:/encode.txt");
		File encodedFile = new File("D:/decode.txt");
		encodeFile(encodedFile,encodedFile);

	}

	private static void encodeFile(File encodingFile, File encodedFile) {
		try {
			FileReader fileReader = new FileReader(encodingFile);
			FileWriter fileWriter = new FileWriter(encodedFile);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
