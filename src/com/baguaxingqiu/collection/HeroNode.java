package com.baguaxingqiu.collection;

import java.util.ArrayList;
import java.util.List;

import com.baguaxingqiu.io.Hero;

public class HeroNode{

	/**
	 * @param args
	 * ���һ��Hero��������HeroNode. 
                       ���������Ӣ�۶��������벻ͬ��Hero���󣬲��Ұ���Hero��Ѫ��������
                       �������10��Hero����ÿ��Hero�����в�ͬ��Ѫ��ֵ���������HeroNode�󣬰���������ӡ������
	 */
	public HeroNode leftNode;
	public HeroNode rightNode;
	public Hero value;
	
	public static void main(String[] args) {
		Hero[] heros = new Hero[10];
		for (int i = 0; i < heros.length; i++) {
			heros[i] = new Hero();
			heros[i].hp = (int)(Math.random()*1000);
			heros[i].name = Integer.toString(i);
		}
		HeroNode roots = new HeroNode();
        for (int i = 0; i < heros.length; i++) {
            roots.add(heros[i]);
        }
        List<Hero> newHeros = roots.values();
        for (int i = 0; i < newHeros.size(); i++) {
        	System.out.println(newHeros.get(i).name+" "+newHeros.get(i).hp);
		}

	}
	
	public void add(Hero v){
		if (value == null) {
			value = v;
		}else{
			if ((Integer)v.hp-(Integer)value.hp <= 0) {
				if (leftNode == null) {
					leftNode = new HeroNode();
				}
				leftNode.add(v);
			}else{
				if (rightNode == null) {
					rightNode = new HeroNode();
				}
				rightNode.add(v);
			}
		}
	}
	
	public List<Hero> values(){
		List<Hero> values = new ArrayList<Hero>();
		// ��ڵ�ı������
        if (null != leftNode)
            values.addAll(leftNode.values());
        // ��ǰ�ڵ�
        values.add(value); 
        // �ҽڵ�ı������
        if (null != rightNode)  
            values.addAll(rightNode.values());
		return values;
	}

}
