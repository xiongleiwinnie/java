package com.baguaxingqiu.array;

public class Sort {

	/**
	 * @param args
	 *  首先创建一个长度是5的数组,并填充随机数。 
		首先用选择法正排序，然后再对其使用冒泡法倒排序
	 */
	public static void main(String[] args) {
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100);
			System.out.println(a[i]);
		}
		
		//选择法
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				};
			}
		}
		
		//冒泡法
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length-i-1; j++) {
//				if (a[i]<a[i+1]) {
//					int temp = a[i];
//					a[i] = a[i+1];
//					a[i+1] = temp;
//				}
//			}
//		}
		
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		

	}

}
