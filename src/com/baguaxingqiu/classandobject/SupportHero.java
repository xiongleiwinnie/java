package com.baguaxingqiu.classandobject;

public class SupportHero extends Hero{

	/**
	 * @param args
	 *  涉及一个类Support (辅助英雄)继承Hero，提供一个heal(治疗)方法
		对Support的heal方法进行重载
		heal() 
		heal(Hero h) //为指定的英雄加血
		heal(Hero h, int hp) //为指定的英雄加了hp的血
	 */
	
	public void heal() {
		System.out.println("治疗");
	}
	
	public void heal(Hero h) {
		System.out.println("为"+h.name+"治疗");
		
	}
	
	public void heal(Hero h, int hp) {
		System.out.println("为"+h.name+"治疗"+hp+"点血");

	}
	
	public static void main(String[] args) {
		

	}

}
