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
	 * 准备一个长度是10，类型是Hero的数组，使用10个Hero对象初始化该数组
                       然后把该数组序列化到一个文件heros.lol
                       接着使用ObjectInputStream 读取该文件，并转换为Hero数组，验证该数组中的内容，是否和序列化之前一样
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
