package chapter11.modeldemo;

public class HeroTest {
	public static void main(String[] args) {
		//����սʿ֮���ս
		Hero hero1 = new Warrior(1, "����", 0, 0);
		Hero hero2 = new Warrior(2, "����", 50, 50);
		hero1.PK(hero2);
		
		hero2.PK(hero1);
	}

}
