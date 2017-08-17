package com.baguaxingqiu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Combine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CombineFile("D:/","newFile.log");

	}

	private static void CombineFile(String folder, String fileName) {
		
		try {
			File destFile = new File(folder, fileName);
			FileOutputStream fileOutputStream = new FileOutputStream(destFile);
			int index = 0;
		    while (true) {
				File eachFile = new File(folder,"common-all.log"+"-"+index++);
				if (!eachFile.exists()) {
					break;
				}
					FileInputStream fileInputStream = new FileInputStream(eachFile);
					byte[] eachFileContent = new byte[(int) eachFile.length()];
					fileInputStream.read(eachFileContent);
					fileInputStream.close();
					fileOutputStream.write(eachFileContent);
					fileOutputStream.flush();
					
					
				
			
			}
		    fileOutputStream.close();//×îºó¹Ø±Õ
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
