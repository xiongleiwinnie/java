package com.baguaxingqiu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {

	/**
	 * @param args
	 * ׼��һ��������10��������Hero�����飬ʹ��10��Hero�����ʼ��������
                       Ȼ��Ѹ��������л���һ���ļ�heros.lol
                       ����ʹ��ObjectInputStream ��ȡ���ļ�����ת��ΪHero���飬��֤�������е����ݣ��Ƿ�����л�֮ǰһ��
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Hero[] heros = new Hero[10];
		for (int i = 0; i < heros.length; i++) {
			heros[i] = new Hero();
			heros[i].hp=i;
			heros[i].name="i";
		}
		File file = new File("D:/hero.lol");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(heros);
		Hero[] newHeros = new Hero[10];
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		newHeros = (Hero[])objectInputStream.readObject();
		for (int i = 0; i < newHeros.length; i++) {
			System.out.println(newHeros[i].hp);
		}
		

	}

}
