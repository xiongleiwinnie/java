package com.baguaxingqiu.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sysin {

	/**
	 * @param args
	 * 自动创建有一个属性的类文件。
                       通过控制台，获取类名，属性名称，属性类型，根据一个模板文件，自动创建这个类文件，并且为属性提供
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入类的名称：");
		String className = scanner.nextLine();
		System.out.println("请输入属性的类型：");
		String propertyType = scanner.nextLine();
		System.out.println("请输入属性的名称：");
		String propertyName = scanner.nextLine();
		String upPropertyName = toUpperFirstLetter(propertyName);
		File file = new File("D:/dog.txt");
		String content = null;
		FileReader fileReader = new FileReader(file);
		char[] ch = new char[(int)file.length()];
		fileReader.read(ch);
		content = new String(ch);
		content = content.replaceAll("@class@", className);
		content = content.replaceAll("@type@", propertyType);
		content = content.replaceAll("@property@", propertyName);
		content = content.replaceAll("@Uproperty@", upPropertyName);
		File newFile = new File("D:/newDog.txt");
		FileWriter fileWriter = new FileWriter(newFile);
		fileWriter.write(content);
		fileWriter.flush();
		
		
		

	}
	
	public static String toUpperFirstLetter(String str){
        char upperCaseFirst =Character.toUpperCase(str.charAt(0));
        String rest = str.substring(1);
        return upperCaseFirst + rest;
         
    }

}
