package chapter7;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * 使用方法模拟实现网络游戏中的世界喊话功能
 * @author sunguangyu
 *
 */
public class SendMessageDemo {
	public static void main(String[] args) {
	SendMessage("王二狗", "世界频道", "公会狩猎（40人团），有空的++", 5, 1);
		
	}
	
	/**
	 * 实现游戏中的喊话
	 * name 	喊话者的名称
	 * channelName	喊话的频道名称
	 * message 	喊话的内容
	 * count 	喊话的次数
	 * interval	喊话的时间间隔（单位：秒）
	 */
	public static void SendMessage(String name, String channelName, String message, int count, int interval){
		if(interval < 5) interval = 5;
		//识别方法的定义很重要
		//喊话的总体逻辑：拼接字符串以后打印出来
		String value = String.format("【%s】 %s: %s", 
					channelName, name, message
		);
		for (int i = 0; i < count; i++) {
			System.out.println(value);
			try {
				//Thread.sleep(interval * 1000);//休眠多少秒
				TimeUnit.SECONDS.sleep(interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	

}
