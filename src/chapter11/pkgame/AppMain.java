package chapter11.pkgame;
/**
 * 用来模拟游戏核心业务逻辑层的代码
 * @author sunguangyu
 *
 */
public class AppMain {
	public static void main(String[] args) {
		Hero hero1 = new Warrior(1, "曹操", 0, 0);
		Castle castle = new Castle("古堡", 10, 10, 750);
		hero1.PK(castle);
	}
}
