package com.baguaxingqiu.collection;

import java.util.ArrayList;
import java.util.List;

import com.baguaxingqiu.io.Hero;

public class HeroNode{

	/**
	 * @param args
	 * 设计一个Hero二叉树，HeroNode. 
                       可以向这个英雄二叉树插入不同的Hero对象，并且按照Hero的血量倒排序。
                       随机生成10个Hero对象，每个Hero对象都有不同的血量值，插入这个HeroNode后，把排序结果打印出来。
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
		// 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());
        // 当前节点
        values.add(value); 
        // 右节点的遍历结果
        if (null != rightNode)  
            values.addAll(rightNode.values());
		return values;
	}

}
