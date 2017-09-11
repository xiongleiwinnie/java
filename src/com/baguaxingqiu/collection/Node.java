package com.baguaxingqiu.collection;

import java.util.ArrayList;
import java.util.List;


public class Node {

	/**
	 * @param args
	 * 二叉树排序-插入数据
	 * 假设通过二叉树对如下10个随机数进行排序
       67,7,30,73,10,0,78,81,10,74
	 */
	
	public Node leftNode;
	public Node rightNode;
	public Object value;
	
	public static void main(String[] args) {
		int[] random = new int[]{67, 7, 30, 73, 10, 0, 78, 81, 10, 74};
		Node roots = new Node();
        for (int number : random) {
            roots.add(number);
        }
        System.out.println(roots.values());
	}
	
	public void add(Object v){
		if (value == null) {
			value = v;
		}else{
			if ((Integer)v-(Integer)value <= 0) {
				if (leftNode == null) {
					leftNode = new Node();
				}
				leftNode.add(v);
			}else{
				if (rightNode == null) {
					rightNode = new Node();
				}
				rightNode.add(v);
			}
		}
	}
	
	public List<Object> values(){
		List<Object> values = new ArrayList<Object>();
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
