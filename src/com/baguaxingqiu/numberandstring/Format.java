package com.baguaxingqiu.numberandstring;

import java.util.Scanner;

public class Format {

	/**
	 * @param args
	 * ����Scanner ��ȡ�ַ������ݣ�Ȼ���ø�ʽ���������
�㽭�������Ƥ�ﳧ����Ƥ�ﳧ�����ˣ����˵��ϰ�ƺ׳Ժ��ζģ�Ƿ����3.5���ڣ���������С��������!����û�а취������Ǯ���ֹ���!ԭ�۶���һ�ٶࡢ���ٶࡢ���ٶ��Ǯ��������ȫ��ֻ����ʮ�飬ͳͳֻҪ��ʮ��!�ƺ����˵����㲻����!����������������˴���꣬�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ!
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����������");
		String location = scanner.next();
		System.out.println("�����빫˾���ͣ�");
		String companyType = scanner.next();
		System.out.println("�����빫˾���ƣ�");
		String companyName = scanner.next();
		System.out.println("�������ϰ����ƣ�");
		String bossName = scanner.next();
		System.out.println("�������");
		double amount = scanner.nextDouble();
		System.out.println("�������Ʒ��");
		String product = scanner.next();
		System.out.println("������۸������λ��");
		String unit = scanner.next();
		
		String sentence = "%s���%s%s�����ˣ����˵��ϰ�%s�Ժ��ζģ�Ƿ����%d���ڣ���������С��������!����û�а취������%s�ֹ���!ԭ�۶���һ%s�ࡢ��%s�ࡢ��%s���Ǯ��������ȫ��ֻ����ʮ�飬ͳͳֻҪ��ʮ��!%s���˵����㲻����!����������������˴���꣬�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ!";
        System.out.format(sentence,location,companyType,companyName,bossName,amount,product,unit,unit,unit);

	}

}
