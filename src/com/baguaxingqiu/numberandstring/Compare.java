package com.baguaxingqiu.numberandstring;

public class Compare {

	/**
	 * @param args
	 *  ����һ��������100���ַ�������
		ʹ�ó�����2������ַ������ַ�������
		ͳ������ַ����������ظ����ַ����ж�����
	 */
	public static void main(String[] args) {
		String[] s = new String[100];
		for (int i = 0;i < s.length; i++) {
			s[i] = randomString(2);
		}
		int count = 0;
		for (String string:s) {
			int repeat = 0;
			//String string = s[i];
			for (String string1:s) {
				//String string1 = s[j];
				if (string1.equalsIgnoreCase(string)){
					repeat++;
					if (2==repeat) {
						count++;
						break;
					}
				}
			}
		}
		
		System.out.println(count);
		

	}
	
	private static String randomString(int length) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
	
	

}
