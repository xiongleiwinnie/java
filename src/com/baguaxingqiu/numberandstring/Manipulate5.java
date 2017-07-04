package com.baguaxingqiu.numberandstring;

public class Manipulate5 {

	/**
	 * @param args
	 * Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak
                       把最后一个two单词首字母大写
	 */
	public static void main(String[] args) {
		String s = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        int index = s.lastIndexOf(" two");
        System.out.println(index);
        String s1 = s.substring(0, index+1);
        String s2 = s.substring(index+1,index+2);
        String s3 = s.substring(index+2);
        s2 = s2.toUpperCase();
        s = s1+s2+s3;
        System.out.println(s);
	}

}
