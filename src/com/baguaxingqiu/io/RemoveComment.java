package com.baguaxingqiu.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RemoveComment {

	/**
	 * @param args
	 * ���һ�������������Ƴ�Java�ļ��е�ע��
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("D:/text.txt");
		FileReader fileReader = new FileReader(file);
		StringBuffer stringBuffer = new StringBuffer();
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while(true){
			String string = bufferedReader.readLine();
			if (string == null) {
				break;
			}
			System.out.println(string);
			if (string.contains("//")) {
				
			}else {
				stringBuffer.append(string).append("\r\n");
				//���˲��ܻ���
			}
		}
		FileWriter fileWriter = new FileWriter(file);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.write(stringBuffer.toString());
		printWriter.flush();
	}

}
