package com.baguaxingqiu.classandobject;

public class Armor extends Item{

	/**
	 * @param args
	 *  设计一个类Armor护甲
		继承Item类，并且额外提供一个属性ac: 护甲等级 int类型
		实例化出两件护甲
		名称 价格 护甲等级
		布甲 300 15
		锁子甲 500 40
	 */
	
	int ac;
	
	public static void main(String[] args) {
		Armor cloth = new Armor();
		Armor hauberk = new Armor();
		cloth.name = "布甲";
		cloth.price = 300;
		cloth.ac = 15;
		hauberk.name = "锁子甲";
		hauberk.price = 500;
		hauberk.ac = 40;

	}

}
