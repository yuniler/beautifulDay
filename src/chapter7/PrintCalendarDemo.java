package chapter7;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

/**
 * 使用方法实现月历的打印
 * @author sunguangyu
 *
 */
public class PrintCalendarDemo {
	//用户输入的年份
	public static int year = Integer.MIN_VALUE;
	//用户输入的月份
	public static int month = Integer.MIN_VALUE;
	//每个月份的参数
	private static int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) {
		PrintCalendar();
		//getSumDayOfYears();
	}

	public static void PrintCalendar() {
		//1.让用户输入年份和月份
		InputYearAndMonth();
		//2.计算1900-1-1到用户输入年份月份的总天数（year = 2017, month = 7, 2017-7-1)
		//	2-1.计算各年的总天数
		//	2-2.计算各月的总天数
		int sum = getSumDayOfYears();
		sum += getSumDayOfMonth();
		//3.打印年份与月份（英文）
		PrintMonthTitle();
		//4.打印月份的标题（星期一到星期天）
		//5.根据某月1日是星期几，打印月历的内容
		PrintCalendarContent(sum % 7);
		
	}
	private static void PrintCalendarContent(int dayOfWeek){
		//注意：dayOfWeek的取值范围是0-6
		int sepCount = 0;
		if(dayOfWeek == 0){	//也就是星期天时
			sepCount = 6;
		}else{
			sepCount = dayOfWeek - 1;
		}
		for(int i = 0; i < sepCount; i++){
			System.out.print("\t");
		}
		for(int i = 0; i < dayOfMonth[month - 1]; i++){
			System.out.print(i + 1);
			if((dayOfWeek + i) % 7 == 0){
				//周日
				System.out.println();
			}else{
				System.out.print("\t");
			}
		}
	}
	
	private static void PrintMonthTitle(){
		String[] monthNames = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
		System.out.println(year + "\t" + monthNames[month - 1]);
		String[] weekdays = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};
		for (int i = 0; i < weekdays.length; i++){
			System.out.print(weekdays[i] + "\t");
		}
		System.out.println();
	}
	
	/**
	 * 获得1900-year年的总天数
	 */
	private static int getSumDayOfYears(){
		//需要判断用户是否已经输入了年份
		if(year == Integer.MIN_VALUE){
			System.out.println("年份错误！请重新输入年份和月份！");
			InputYearAndMonth();
		}
		int sum = 0;
		for(int i = 1900; i < year; i++){
			sum += 365;//每一年累计加365天
			if(isLeapYear(i)){
				sum++;
			}
		}
		return sum;
	}
	/**
	 * 得到year年1月1号到year年month-1月的最后一天的总天数
	 */
	private static int getSumDayOfMonth(){
		int sum = 0;//此处放过全局
		for(int i = 0; i < month - 1; i++){
			sum += dayOfMonth[i];

		}
		if(isLeapYear(year) && month >= 3){
			sum++;
		}
		return sum;
	}
	
	/**
	 * 用来判断传入的year变量是不是闰年
	 * @param year 要判断的年份
	 * @param 是闰年，返回true
	 */
	private static boolean isLeapYear(int year){
		return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}
	
	
	
	private static void InputYearAndMonth(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份：");
		year = input.nextInt();
		System.out.println("请输入月份：");
		month = input.nextInt();
		month = input.nextInt();
		input = null;
	}


}
