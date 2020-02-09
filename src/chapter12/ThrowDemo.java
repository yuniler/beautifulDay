package chapter12;
/**
 * 演示手动抛出异常
 * @author sunguangyu
 *
 */
public class ThrowDemo {
	public static void main(String[] args) {
		Hero hero = new Hero("貂蝉");
		try {
			hero.setExp(1000);
			hero.setHealth(40);
			hero.rideHoure();
		} catch (Exception e) {
			//System.out.println("在设置经验值时出现异常：" + e.getMessage());
			e.printStackTrace();//开发时，这个较好
		}
		System.out.println("当前英雄的经验值：" + hero.getExp());
	}
	
	
	
}
class Hero{
	private String name;
	private long exp;
	private int health;
	
	public Hero(String name){
		setName(name);
	}
	
	/**
	 * 英雄的骑马方法--当英雄的健康值低于50时，不允许骑马
	 * @throws LessThanZeroException 
	 */
	public void rideHoure() throws RideHorseException{
		if(health >= 50)
		System.out.println(name + "正在快乐的骑马");
		else
			throw new RideHorseException(health);
	}
	
	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getExp() {
		return exp;
	}
	public void setExp(long exp) throws Exception {
		if(exp >= 0)
			this.exp = exp;
		else//当exp为负数时，强制抛出异常
			throw new LessThanZeroException((int)exp);
	}
	
}