package com.baguaxingqiu.classandobject;

public class Armor extends Item{

	/**
	 * @param args
	 *  ���һ����Armor����
		�̳�Item�࣬���Ҷ����ṩһ������ac: ���׵ȼ� int����
		ʵ��������������
		���� �۸� ���׵ȼ�
		���� 300 15
		���Ӽ� 500 40
	 */
	
	int ac;
	
	public static void main(String[] args) {
		Armor cloth = new Armor();
		Armor hauberk = new Armor();
		cloth.name = "����";
		cloth.price = 300;
		cloth.ac = 15;
		hauberk.name = "���Ӽ�";
		hauberk.price = 500;
		hauberk.ac = 40;

	}

}
