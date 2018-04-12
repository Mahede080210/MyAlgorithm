package oj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		/* 初始化 */
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);// 年
		int month = cal.get(Calendar.MONTH) + 1;// 月
		int day = cal.get(Calendar.DATE);// 日
		int hour = cal.get(Calendar.HOUR_OF_DAY);// 时
		int minute = cal.get(Calendar.MINUTE);// 分
		int second = cal.get(Calendar.SECOND);// 秒
		int weekday = cal.get(Calendar.DAY_OF_WEEK);// 星期 周日-周六对应1-7
		int last = cal.getActualMaximum(cal.DAY_OF_MONTH); // 获取本月最大天数
		int DAY_OF_YEAR = cal.get(Calendar.DAY_OF_YEAR);// 今年的第几天
		int DAY_OF_MONTH = cal.get(Calendar.DAY_OF_MONTH);// 本月的第几天
		System.out.println("现在是: " + year + " 年 " + month + " 月 " + day + " 日 " + hour + " 时 " + minute + " 分 " + second
				+ " 秒 " + "\nweekday: " + weekday + " 本月天数 :" + last + " 今年的第几天:" + DAY_OF_YEAR + " 本月第几天:"
				+ DAY_OF_MONTH);

		cal.set(2013, 5, 4, 13, 44, 51);// 年月日时分秒（月份0代表1月） ，毫秒不会自动清零
		System.out.println(sdf.format(cal.getTime()));
		cal.set(Calendar.MILLISECOND, 0);// 毫秒清零
		System.out.println(sdf.format(cal.getTime()));
		cal.set(Calendar.YEAR, 2014);// 年
		cal.set(Calendar.MONTH, 7);// 月（月份0代表1月）
		cal.set(Calendar.DATE, 11);// 日
		cal.set(Calendar.HOUR_OF_DAY, 15);// 时
		cal.set(Calendar.MINUTE, 33);// 分
		cal.set(Calendar.SECOND, 32);// 秒
		System.out.println(sdf.format(cal.getTime()));

		cal.setTime(new Date());
		System.out.println(sdf.format(cal.getTime()));

		cal.add(Calendar.YEAR, 1);// 年
		cal.add(Calendar.MONTH, 1);// 月
		cal.add(Calendar.DATE, 1);// 日
		cal.add(Calendar.HOUR_OF_DAY, -1);// 时
		cal.add(Calendar.MINUTE, 1);// 分
		cal.add(Calendar.SECOND, 1);// 秒
		System.out.println(sdf.format(cal.getTime()));

		Calendar calendarNew = Calendar.getInstance();
		calendarNew.add(Calendar.HOUR, -2);
		System.out.println("时间比较：" + calendarNew.compareTo(cal));

		//实践练习
		System.out.println("\n\n\n\n");
		System.out .println("-----------------------------------------------");
		System.out  .println("Calender 练习>>>>>");
		
		SimpleDateFormat test0=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		
		Calendar cal1=Calendar.getInstance();
		System.out.println(test0.format(cal1.getTime()));
		
		int year1=cal.get(Calendar.YEAR);
		int month1=cal1.get(Calendar.MONTH)+1;
		int day1=cal1.get(Calendar.DATE);
		System.out.println("今天是>> "+year1+"-"+month1+"-"+day1);
		
		
	}

}
