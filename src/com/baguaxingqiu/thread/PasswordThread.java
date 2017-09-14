package com.baguaxingqiu.thread;

import java.util.List;

public class PasswordThread extends Thread{

	/**
	 * @param args
	 *  1. ����һ��������3������ַ�����������ַ�����Ϊ��������
		2. ����һ���ƽ��̣߳�ʹ����ٷ���ƥ��������� 
		3. ����һ����־�̣߳���ӡ���ù���Щ�ַ���ȥƥ�䣬�����־�߳����Ϊ�ػ��߳�
		��ʾ�� �ƽ��̰߳���ٷ����ɵĿ����������һ�������У���־�̲߳��ϵĴ�����������ó��������룬����ӡ������ ������������ǿյģ�����Ϣ1�룬������ֲ��ǿյģ��Ͳ�ͣ��ȡ��������ӡ��
	 */
	private boolean found = false;
    
    private String password;
 
    private List<String> passwords;
    
	public PasswordThread(String password, List<String> passwords) {
		this.password = password;
        this.passwords = passwords;
        
	}
	
	public void run(){
		char[] guessPassword = new char[password.length()];
		generatePassword(guessPassword,password);
	}
	public void generatePassword(char[] guessPassword, String password) {
		generatePassword(guessPassword, 0, password);
		
	}

	private void generatePassword(char[] guessPassword, int index, String password) {
		if (found) {
			return;
		}
		for (short i = '0'; i <= 'z'; i++) {
			char c = (char)i;
			if (!Character.isLetterOrDigit(c)){
				continue;
			}
			guessPassword[index] = c;
			if (index != guessPassword.length - 1) {
                generatePassword(guessPassword, index + 1, password);
            }else{
            	 String guess = new String(guessPassword);
                 //���ÿ�����ɵ����룬���Ž�������
                 passwords.add(guess);
                 if (guess.equals(password)) {
                     System.out.println("�ҵ��ˣ�������" + guess);
                     found = true;
                     return;
                 }
            }
		}
		
	}


}
