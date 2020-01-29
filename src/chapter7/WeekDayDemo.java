package chapter7;

import java.util.Scanner;

/**
 * ��д����������������ת��Ϊ���ְ沢���
 * @author sunguangyu
 *
 */
public class WeekDayDemo {
	public static void main(String[] args) {
		System.out.print("��������������ڼ���");
		int dayOfWeek = new Scanner(System.in).nextInt();
		//����
		ShowWeekDayByChinese(dayOfWeek);
		//����
		ShowWeekDayByJpanese(dayOfWeek);
		//Ӣ��
		ShowWeekDayByEnglish(dayOfWeek);
	}
	/**
	 * �����жϴ���Ĳ����Ƿ���1-7֮��
	 */
	private static boolean isRight(int dayOfWeek){
		if(dayOfWeek < 1 || dayOfWeek > 7){
			return false;
		}
		return true;
	}
	/**
	 * �����ĵķ�ʽ����ӡ���ڼ�
	 */
	public static void ShowWeekDayByChinese(int dayOfWeek){
		if(!isRight(dayOfWeek)){
			System.out.println("��������1-7֮������֣�");
		
		return;
	}
		String[] weekdays = {"����һ", "���ڶ�", "������", "������", "������", "������", "������"};
		System.out.println(weekdays[dayOfWeek]);
	}
	/**
	 * ���ձ��ķ�ʽ����ӡ���ڼ�
	 * @param dayOfWeek
	 */
	static void ShowWeekDayByJpanese(int dayOfWeek){
		if(!isRight(dayOfWeek)){
			System.out.println("��������1-7֮������֣�");
		
		return;
		}
		String[] weekdays = {"������", "������", "ˮ����", "ľ����", "������", "������", "������"};
		System.out.println(weekdays[dayOfWeek]);

	}
	static void ShowWeekDayByEnglish(int dayOfWeek){
		if(!isRight(dayOfWeek)){
			System.out.println("��������1-7֮������֣�");
		
		return;
		}
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		System.out.println(weekdays[dayOfWeek]);

		}
	}


