package com.baguaxingqiu.UML;

public class Cat extends Animal implements Pet{

	/**
	 * @param args
	 *  1. ����������String���������������֡�
		2. ����һ������������ʹ��String����ָ��è�����֣��ù�����������ó��๹������ָ�����е�è���������ȡ�
		3. ����һ���޲εĹ��������ù���������ǰһ������������this�ؼ��֣�������һ�����ַ�����Ϊ����
		4. ʵ��Pet�ӿڷ�����
		5. ʵ��eat������
	 */
	private String name;
	public Cat(String name) {
		super(4);
		this.name = name;		
	}
	
	public Cat() {
		this("");
	}
	
	@Override
	public void eat() {
		System.out.println("cat eating");		
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
		System.out.println("cat playing");
		
	}
}
