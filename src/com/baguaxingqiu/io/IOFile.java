package com.baguaxingqiu.io;

import java.io.File;

public class IOFile {

	/**
	 * @param args
	 * 一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
	 * 遍历这个目录下所有的文件(不用遍历子目录)
	 * 找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
	 * 注: 最小的文件不能是0长度
	 */
	public static void main(String[] args) {
		File file = new File("C:/WINDOWS");
		File[] fs = file.listFiles();
		long max = 0;
		long min = 999999999;
		File maxfile = null;
		File minfile = null;
		for (int i = 0; i < fs.length; i++) {
			long filelength = fs[i].length();
			if (fs[i].isFile()) {
				if (filelength > max) {
					max = filelength;
					maxfile = fs[i];
				} else if (filelength < min) {
					min = filelength;
					minfile = fs[i];
				}
			}
		}
		System.out.println(minfile.getAbsolutePath()+min);
		System.out.println(maxfile.getAbsolutePath()+max);
	}
	//遍历子文件夹可以采取递归的方法

}
