package com.baguaxingqiu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Split {

	/**
	 * @param args
	 * 找到一个大于100k的文件，按照100k为单位，拆分成多个子文件，并且以编号作为文件名结束。
	 */
	public static void main(String[] args) {
		File srcfile = new File("D:/common-all.log");
		int eachSize = 100*1024;
		splitFile(srcfile,eachSize);
		
	}

	private static void splitFile(File srcfile, int eachSize) {
		byte[] fileContent = new byte[(int) srcfile.length()];
		try {
			FileInputStream fileInputStream = new FileInputStream(srcfile);
			fileInputStream.read(fileContent);
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int fileNumber = fileContent.length/eachSize+1;
		for (int i = 0; i < fileNumber; i++) {
			String eachFileName = srcfile.getName()+"-"+i;
			File eachFile = new File(srcfile.getParent(), eachFileName);
			byte[] eachContent;
			if (i != fileNumber-1) {
				eachContent = Arrays.copyOfRange(fileContent, eachSize*i, eachSize*(i+1));
			}else {
				eachContent = Arrays.copyOfRange(fileContent, eachSize*i, fileContent.length);
			}
			try {
				FileOutputStream fileOutputStream = new FileOutputStream(eachFile);
				fileOutputStream.write(eachContent);
				fileOutputStream.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
