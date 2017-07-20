package com.baguaxingqiu.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	/**
	 * @param args
	 * 找出下个月的倒数第3天是哪天
	 */
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		//Date now = c.getTime();
		//c.setTime(now);
		c.add(Calendar.MONTH, 2);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.DATE, -3);
		System.out.println(sdf.format(c.getTime()));
	}

}
