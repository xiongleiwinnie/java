package com.baguaxingqiu.array;

public class MinimumInArray {

	/**
	 * @param args
	 *  ���ȴ���һ��������5������
		Ȼ��������ÿһλ�����������
		ͨ��forѭ�����������飬�ҳ���С��һ��ֵ����
		
		0-100�� ��������Ļ�ȡ�취�ж��֣������ǲο��취֮һ:
		 
		(int) (Math.random() * 100)
		 
		
		Math.random() ��õ�һ��0-1֮��������������Ȼ�����100����ǿתΪ���ͼ��ɡ�
	 */
	public static void main(String[] args) {
		int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        int b = 100;
        System.out.println("�����еĸ����������:");
        for (int i = 0; i < a.length; i++) {
        	System.out.println(a[i]);
        	if (a[i] < b) {
				b = a[i];
			}
        	
        }
        System.out.println("��С��һ��ֵ: "+b);
            
         
        

	}

}
