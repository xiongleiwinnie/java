package com.baguaxingqiu.numberandstring;

public class Manipulate {

	/**
	 * @param args
	 *  给出一句英文句子： "let there be light"
     	得到一个新的字符串，每个单词的首字母都转换为大写
	 */
	public static void main(String[] args) {
		String s = "let there be light";
		String[] s1 = s.split(" ");
		String newString = "";
		for(int i = 0;i < s1.length;i++){
			String s2 = s1[i];
//			int index;
//			if (i == 0) {
//				index = 0;
//			}else{
//				index = 1;
//			}
			//空格被split剪掉了
			char ch = Character.toUpperCase(s2.charAt(0));
            s2 = s2.substring(1);
			System.out.println(s2);
			s2 = String.valueOf(ch)+s2;
			newString += (s2+" ");
		}
		newString = newString.trim();
		System.out.println(newString);
		
	}

}
