package chapter11.pkgame;
/**
 * ����ģ����Ϸ����ҵ���߼���Ĵ���
 * @author sunguangyu
 *
 */
public class AppMain {
	public static void main(String[] args) {
		Hero hero1 = new Warrior(1, "�ܲ�", 0, 0);
		Castle castle = new Castle("�ű�", 10, 10, 750);
		hero1.PK(castle);
	}
}
