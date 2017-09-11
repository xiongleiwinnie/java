package com.baguaxingqiu.collection;

import java.util.ArrayList;
import java.util.List;


public class Node {

	/**
	 * @param args
	 * ����������-��������
	 * ����ͨ��������������10���������������
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
