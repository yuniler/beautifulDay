package chapter11.pkgame;

import javax.accessibility.AccessibleStateSet;

/**
 * �ɹ����ӿ�--ֻҪʵ���˱��ӿڣ����൱�ھ߱��˿�ʵʩ��������Ļ�������
 * @author sunguangyu
 *
 */
public interface Assailable {
	String getName();
	int getX();
	void setX(int x);
	int getY();
	void setY(int y);
	int getHp();
	void setHp(int Hp);
	/**
	 * ���ݾ����жϣ��Ƿ��ܹ��ɹ�������һ���߱����������Ķ���
	 */
	
	boolean canFightByDistance(Assailable assa);
	/**
	 * ������һ���߱����������Ķ���
	 * @param assa
	 */
	void fight(Assailable assa);
	

}
