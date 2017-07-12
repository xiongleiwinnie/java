package com.baguaxingqiu.numberandstring;

public class TestStringBuffer {

	/**
	 * @param args
	 *  String��StringBuffer����������?
		����10λ���ȵ�����ַ���
		Ȼ��,��ʹ��String��+,����10000������ַ���,�������ĵ�ʱ��
		Ȼ��,��ʹ��StringBuffer����10000������ַ���,�������ĵ�ʱ��
		��ʾ: ʹ��System.currentTimeMillis() ��ȡ��ǰʱ��(����)
	 */
	public static void main(String[] args) {
		String s1 = "";
		StringBuffer s2 = new StringBuffer(s1);
		String[] strings = new String[10000];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = randomString(10);
		}
		long time1 = System.currentTimeMillis();
		for (int i = 0; i < strings.length; i++) {
			s1 += strings[i];
		}
		long time2 = System.currentTimeMillis();
		for (int i = 0; i < strings.length; i++) {
			s2.append(strings[i]);
		}
		long time3 = System.currentTimeMillis();
		System.out.println((long)(time2-time1));
		System.out.println((long)(time3-time2));

	}
	
	private static String randomString(int length){
		String pool = "";
		for(short i = '0';i <= '9';i++){
			pool += (char)i;
		}
		for(short i = 'a';i <= 'z';i++){
			pool += (char)i;
		}
		for(short i = 'A';i <= 'Z';i++){
			pool += (char)i;
		}
		char[] ch = new char[length];
		for (int i = 0; i < ch.length; i++) {
			int index = (int)Math.random()*pool.length();
			ch[i] = pool.charAt(index);
		}
		String result = new String(ch);
		return result;
	}

}
