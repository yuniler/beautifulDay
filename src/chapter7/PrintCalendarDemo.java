package chapter7;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

/**
 * ʹ�÷���ʵ�������Ĵ�ӡ
 * @author sunguangyu
 *
 */
public class PrintCalendarDemo {
	//�û���������
	public static int year = Integer.MIN_VALUE;
	//�û�������·�
	public static int month = Integer.MIN_VALUE;
	//ÿ���·ݵĲ���
	private static int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) {
		PrintCalendar();
		//getSumDayOfYears();
	}

	public static void PrintCalendar() {
		//1.���û�������ݺ��·�
		InputYearAndMonth();
		//2.����1900-1-1���û���������·ݵ���������year = 2017, month = 7, 2017-7-1)
		//	2-1.��������������
		//	2-2.������µ�������
		int sum = getSumDayOfYears();
		sum += getSumDayOfMonth();
		//3.��ӡ������·ݣ�Ӣ�ģ�
		PrintMonthTitle();
		//4.��ӡ�·ݵı��⣨����һ�������죩
		//5.����ĳ��1�������ڼ�����ӡ����������
		PrintCalendarContent(sum % 7);
		
	}
	private static void PrintCalendarContent(int dayOfWeek){
		//ע�⣺dayOfWeek��ȡֵ��Χ��0-6
		int sepCount = 0;
		if(dayOfWeek == 0){	//Ҳ����������ʱ
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
				//����
				System.out.println();
			}else{
				System.out.print("\t");
			}
		}
	}
	
	private static void PrintMonthTitle(){
		String[] monthNames = {"����һ", "���ڶ�", "������", "������", "������", "������", "������"};
		System.out.println(year + "\t" + monthNames[month - 1]);
		String[] weekdays = {"������", "������", "ˮ����", "ľ����", "������", "������", "������"};
		for (int i = 0; i < weekdays.length; i++){
			System.out.print(weekdays[i] + "\t");
		}
		System.out.println();
	}
	
	/**
	 * ���1900-year���������
	 */
	private static int getSumDayOfYears(){
		//��Ҫ�ж��û��Ƿ��Ѿ����������
		if(year == Integer.MIN_VALUE){
			System.out.println("��ݴ���������������ݺ��·ݣ�");
			InputYearAndMonth();
		}
		int sum = 0;
		for(int i = 1900; i < year; i++){
			sum += 365;//ÿһ���ۼƼ�365��
			if(isLeapYear(i)){
				sum++;
			}
		}
		return sum;
	}
	/**
	 * �õ�year��1��1�ŵ�year��month-1�µ����һ���������
	 */
	private static int getSumDayOfMonth(){
		int sum = 0;//�˴��Ź�ȫ��
		for(int i = 0; i < month - 1; i++){
			sum += dayOfMonth[i];

		}
		if(isLeapYear(year) && month >= 3){
			sum++;
		}
		return sum;
	}
	
	/**
	 * �����жϴ����year�����ǲ�������
	 * @param year Ҫ�жϵ����
	 * @param �����꣬����true
	 */
	private static boolean isLeapYear(int year){
		return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}
	
	
	
	private static void InputYearAndMonth(){
		Scanner input = new Scanner(System.in);
		System.out.println("��������ݣ�");
		year = input.nextInt();
		System.out.println("�������·ݣ�");
		month = input.nextInt();
		month = input.nextInt();
		input = null;
	}


}
