package chapter11.pkgame;
/**
 * 城堡类--城堡不是英雄！
 * @author sunguangyu
 *
 */
public class Castle implements Assailable{
	private String name;
	private int x;
	private int y;
	private int maxHp;
	private int hp;
	private int attackRange;
	
	public Castle(String name, int x, int y, int attackRange){
		setName(name);
		setX(x);
		setY(y);
		setAttackRange(attackRange);
		setMaxHp(100);
		setHp(100);
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttackRange() {
		return attackRange;
	}
	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
	@Override
	public boolean canFightByDistance(Assailable assa) {
		//1.计算与另一个可攻击对象之间的距离
		//2.如果攻击距离合法，就进行攻击
		return false;
	}
	@Override
	public void fight(Assailable assa) {
		//假设城堡攻击力固定
		int attack = 15;
		assa.setHp(assa.getHp() - attack);
		
	}
	
	
	
}
