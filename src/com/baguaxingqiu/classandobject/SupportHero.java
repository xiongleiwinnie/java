package com.baguaxingqiu.classandobject;

public class SupportHero extends Hero{

	/**
	 * @param args
	 *  �漰һ����Support (����Ӣ��)�̳�Hero���ṩһ��heal(����)����
		��Support��heal������������
		heal() 
		heal(Hero h) //Ϊָ����Ӣ�ۼ�Ѫ
		heal(Hero h, int hp) //Ϊָ����Ӣ�ۼ���hp��Ѫ
	 */
	
	public void heal() {
		System.out.println("����");
	}
	
	public void heal(Hero h) {
		System.out.println("Ϊ"+h.name+"����");
		
	}
	
	public void heal(Hero h, int hp) {
		System.out.println("Ϊ"+h.name+"����"+hp+"��Ѫ");

	}
	
	public static void main(String[] args) {
		

	}

}
