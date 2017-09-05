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
	 * 向文件中写入两个数字，然后把这两个数字分别读取出来
		第一种方式： 使用缓存流把两个数字以字符串的形式写到文件里，再用缓存流以字符串的形式读取出来，然后转换为两个数字。 
		注： 两个数字之间要有分隔符用于区分这两个数字。 比如数字是31和15，如果不使用分隔符，那么就是3115，读取出来就无法识别到底是哪两个数字。 使用分隔符31@15能解决这个问题。
		第二种方式： 使用数据流DataOutputStream向文件连续写入两个数字，然后用DataInpuStream连续读取两个数字
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
