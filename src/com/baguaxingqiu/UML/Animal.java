package com.baguaxingqiu.UML;

public abstract class Animal {

	/**
	 * @param args
	 *  1. ����Animal�࣬�������ж���ĳ����ࡣ
		2. ����һ���ܱ�����������������legs������¼������ȵ���Ŀ��
		3. ����һ���ܱ����Ĺ�������������ʼ��legs���ԡ�
		4. �������󷽷�eat��
		5. �������巽��walk����ӡ������������ߵģ������ȵ���Ŀ����
	 */
	protected int legs;	
	
	protected Animal(int legs) {
		this.legs = legs;
	}	
	
	public abstract void eat();	
	
	public void walk(){
		System.out.println("��"+legs+"������");
	}

}
