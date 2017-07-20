package com.baguaxingqiu.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	/**
	 * @param args
	 *  准备一个长度是9的日期数组
		使用1970年-2000年之间的随机日期初始化该数组
		按照这些日期的时间进行升序排序
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		Date[] dates  = new Date[9];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Date start = sdf.parse("1970");
		Date end = sdf.parse("2001");
		long timeStart = start.getTime();
		long timeEnd = end.getTime()-1;
		for (int i = 0; i < dates.length; i++) {
			long timeRandom = (long)(Math.random()*(timeEnd-timeStart)+timeStart);
			dates[i] = new Date(timeRandom);
			System.out.println(dates[i]);
		}
		System.out.println();
		//排序
		for (int i = 0; i < dates.length-1; i++) {
			for (int j = i+1; j < dates.length; j++) {
				SimpleDateFormat sdf2 = new SimpleDateFormat("HHmmss");
				String str1 = sdf2.format(dates[i]);
				//System.out.println(str1);
				String str2 = sdf2.format(dates[j]);
				int int1 = Integer.parseInt(str1);
				int int2 = Integer.parseInt(str2);
				//System.out.println(int1);
				if (int1>int2) {
					Date temp = dates[i];
					dates[i] = dates[j];
					dates[j] = temp;
				}
				
			}
			
		}
		for (int i = 0; i < dates.length; i++) {
			System.out.println(dates[i]);
		}

	}

}
