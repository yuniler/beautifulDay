package chapter7;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * ʹ�÷���ģ��ʵ��������Ϸ�е����纰������
 * @author sunguangyu
 *
 */
public class SendMessageDemo {
	public static void main(String[] args) {
	SendMessage("������", "����Ƶ��", "�������ԣ�40���ţ����пյ�++", 5, 1);
		
	}
	
	/**
	 * ʵ����Ϸ�еĺ���
	 * name 	�����ߵ�����
	 * channelName	������Ƶ������
	 * message 	����������
	 * count 	�����Ĵ���
	 * interval	������ʱ��������λ���룩
	 */
	public static void SendMessage(String name, String channelName, String message, int count, int interval){
		if(interval < 5) interval = 5;
		//ʶ�𷽷��Ķ������Ҫ
		//�����������߼���ƴ���ַ����Ժ��ӡ����
		String value = String.format("��%s�� %s: %s", 
					channelName, name, message
		);
		for (int i = 0; i < count; i++) {
			System.out.println(value);
			try {
				//Thread.sleep(interval * 1000);//���߶�����
				TimeUnit.SECONDS.sleep(interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	

}
