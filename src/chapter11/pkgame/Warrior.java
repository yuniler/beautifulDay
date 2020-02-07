package chapter11.pkgame;

public class Warrior extends Hero{
	
	public Warrior(){
		super();
		setName("Ĭ��Ӣ��");
	}
	public Warrior(long id, String name, int x, int y){
		super(id, name);
		setX(x);
		setY(y);
	}
	@Override
	public boolean canFightByDistance(Assailable hero) {
		double distance = getDistance(getX(), getY(), hero.getX(), hero.getY());
		//����սʿ�Ĺ�������̶�Ϊ100
		return distance <= 100;
	}

	@Override
	public void fight(Assailable hero) {
		//1.��������Ĺ�����
		//2.��������Ӣ�۶����hp
		int attack = ((int)(Math.random() * 1000)) % 51 + 20;	//20-70֮��
		setAttack(attack);
		hero.setHp(hero.getHp() - attack);
		System.out.println(getName() + "�ɹ�ʵʩ��һ�ν�ս����");
	}

}
