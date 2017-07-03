package com.baguaxingqiu.numberandstring;

import java.util.Scanner;

public class Format {

	/**
	 * @param args
	 * 借助Scanner 读取字符串数据，然后用格式化输出下面
浙江温州最大皮革厂江南皮革厂倒闭了，王八蛋老板黄鹤吃喝嫖赌，欠下了3.5个亿，带着他的小姨子跑了!我们没有办法，拿着钱包抵工资!原价都是一百多、两百多、三百多的钱包，现在全部只卖二十块，统统只要二十块!黄鹤王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入地名：");
		String location = scanner.next();
		System.out.println("请输入公司类型：");
		String companyType = scanner.next();
		System.out.println("请输入公司名称：");
		String companyName = scanner.next();
		System.out.println("请输入老板名称：");
		String bossName = scanner.next();
		System.out.println("请输入金额：");
		double amount = scanner.nextDouble();
		System.out.println("请输入产品：");
		String product = scanner.next();
		System.out.println("请输入价格计量单位：");
		String unit = scanner.next();
		
		String sentence = "%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%d个亿，带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、三%s多的钱包，现在全部只卖二十块，统统只要二十块!%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.format(sentence,location,companyType,companyName,bossName,amount,product,unit,unit,unit);

	}

}
