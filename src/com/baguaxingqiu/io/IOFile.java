package com.baguaxingqiu.io;

import java.io.File;

public class IOFile {

	/**
	 * @param args
	 * һ��˵������ϵͳ���ᰲװ��C�̣����Ի���һ�� C:\WINDOWSĿ¼��
	 * �������Ŀ¼�����е��ļ�(���ñ�����Ŀ¼)
	 * �ҳ���Щ�ļ�����ĺ���С(��0)���Ǹ��ļ�����ӡ�����ǵ��ļ���
	 * ע: ��С���ļ�������0����
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
	//�������ļ��п��Բ�ȡ�ݹ�ķ���

}
