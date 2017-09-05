package com.baguaxingqiu.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataStream {

	/**
	 * @param args
	 * ���ļ���д���������֣�Ȼ������������ֱַ��ȡ����
		��һ�ַ�ʽ�� ʹ�û������������������ַ�������ʽд���ļ�����û��������ַ�������ʽ��ȡ������Ȼ��ת��Ϊ�������֡� 
		ע�� ��������֮��Ҫ�зָ��������������������֡� ����������31��15�������ʹ�÷ָ�������ô����3115����ȡ�������޷�ʶ�𵽵������������֡� ʹ�÷ָ���31@15�ܽ��������⡣
		�ڶ��ַ�ʽ�� ʹ��������DataOutputStream���ļ�����д���������֣�Ȼ����DataInpuStream������ȡ��������
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		write1();
		read1();
		write2();
		read2();
	}

	private static void read2() throws IOException {
		File file = new File("D:/text.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		DataInputStream dataInputStream = new DataInputStream(fileInputStream);
		int int1 = dataInputStream.readInt();
		int int2 = dataInputStream.readInt();
		System.out.println(int1);
		System.out.println(int2);
		
	}

	private static void write2() throws IOException {
		File file = new File("D:/text.txt");
	    FileOutputStream fileOutputStream = new FileOutputStream(file);
	    DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
	    dataOutputStream.writeInt(31);
	    dataOutputStream.writeInt(15);
	    dataOutputStream.flush();
		
	}

	private static void read1() throws IOException {
		File file = new File("D:/test.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while (true) {
			String lineString = bufferedReader.readLine();
			if (lineString == null) {
				break;
			}
			System.out.println(lineString);
			int index = lineString.indexOf("@");
			String str1 = lineString.substring(0, index);
			String str2 = lineString.substring(3);
			System.out.println(str1);
			System.out.println(str2);
			
		}
		
		
		
	}

	private static void write1() throws IOException {
		File file = new File("D:/test.txt");
		FileWriter fileWriter = new FileWriter(file);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println("31@15");
		printWriter.flush();
		
		
	}

}
