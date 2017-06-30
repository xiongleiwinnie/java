package com.baguaxingqiu.UML;

public class Fish extends Animal implements Pet{
	/**
	 *  1. ����Fish�࣬���̳�Animal��
		2. ��дAnimal��walk�����Ա����㲻������û���ȡ�
		3. ʵ��Pet�ӿ�
		4. �޲ι��췽��
		5. �ṩһ��private ��name����
	 */
	private String name;
	
	@Override
	public void walk() {
		System.out.println("no foot no walking");
	}
	public Fish() {
		super(0);
	}
	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void play() {
		System.out.println("fish playing");
	}
	@Override
	public void eat() {
		System.out.println("fish eating");
	}
	

}
