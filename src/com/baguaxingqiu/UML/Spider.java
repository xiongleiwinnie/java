package com.baguaxingqiu.UML;

public class Spider extends Animal{

	/**
	 * @param args
	 *  1. Spider�̳�Animal�ࡣ
		2. ����Ĭ�Ϲ������������ø��๹������ָ������֩�붼��8���ȡ�
		3. ʵ��eat����
	 */
	public Spider() {
		super(8);
	}
	
	@Override
	public void eat() {
		System.out.println("spider eating");
	};
}
