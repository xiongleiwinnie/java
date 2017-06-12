package com.baguaxingqiu.array;

public class MinimumInArray {

	/**
	 * @param args
	 *  首先创建一个长度是5的数组
		然后给数组的每一位赋予随机整数
		通过for循环，遍历数组，找出最小的一个值出来
		
		0-100的 随机整数的获取办法有多种，下面是参考办法之一:
		 
		(int) (Math.random() * 100)
		 
		
		Math.random() 会得到一个0-1之间的随机浮点数，然后乘以100，并强转为整型即可。
	 */
	public static void main(String[] args) {
		int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        int b = 100;
        System.out.println("数组中的各个随机数是:");
        for (int i = 0; i < a.length; i++) {
        	System.out.println(a[i]);
        	if (a[i] < b) {
				b = a[i];
			}
        	
        }
        System.out.println("最小的一个值: "+b);
            
         
        

	}

}
