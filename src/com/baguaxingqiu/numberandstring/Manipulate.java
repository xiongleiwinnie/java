package com.baguaxingqiu.numberandstring;

public class Manipulate {

	/**
	 * @param args
	 *  ����һ��Ӣ�ľ��ӣ� "let there be light"
     	�õ�һ���µ��ַ�����ÿ�����ʵ�����ĸ��ת��Ϊ��д
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
			//�ո�split������
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
