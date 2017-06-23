package com.baguaxingqiu.implementandextend;

import com.baguaxingqiu.classandobject.Hero;

public class Support extends Hero implements Healer{

	/**
	 * @param args
	 */
	@Override
	public void heal(){
		System.out.println("жнаф");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
