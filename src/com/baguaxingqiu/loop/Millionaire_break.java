package com.baguaxingqiu.loop;

public class Millionaire_break {

	/**
	 * @param args
	 *  ��������������3000������ƽʱ������ÿ��������1000��Ǯ����Ͷ�ʡ�
		Ȼ���������ר���� ����Ʊ�ͻ��� 21������ŵ���ͨ�����ﵽ��ÿ��20%��Ͷ�ʻر��ʡ�
		��ô�������ˣ���ÿ����Ͷ��1000��Ǯ�Ľ��࣬����Ͷ�ʶ����꣬������ﵽ100��
		���������㰴��ÿ��12000Ͷ����㣬������ÿ�¼�Ϣ��
		������ʽ��
		F = p* ( (1+r)^n );
		F ��������
		p ����
		r ������
		n ���˶�����

	 */
	public static void main(String[] args) {
		double sum = 0;
		int j = 0;
		for (int i = 1; i < 1000; i++) {
			if (sum>=1000000) {
				break;
			}
			sum += 12000;
			sum = sum*1.2;
			System.out.println(i);
			System.out.println(sum);
			
		}

	}

}
