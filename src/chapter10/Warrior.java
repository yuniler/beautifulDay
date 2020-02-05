package chapter10;
/**
 * 战士类--继承了Hero类
 * @author sunguangyu
 *
 */
public class Warrior extends Hero{
	//战士特有属性，物理攻击
	private int pysicalAttach;
	public Warrior(){
		//super();		//子类构造中，默认就会调用父类构造
		System.out.println("子类默认构造");
	}
	
	public Warrior(String nickName, int pysicalAttach){
		setNickName(nickName);
		setPysicalAttach(pysicalAttach);
	}

	
	@Override//注解：重写。。。。帮助规范后名，防止写错，重写错误
	public void move() {
		System.out.println("战士的移动基本靠走");
	}
	//重写父类的移动方法
//	public void move(){
//		System.out.println(getNickName() + "：移动基本靠腿！");
//	}
//	
	
	public int getPysicalAttack() {
		return pysicalAttach;
	}

	public void setPysicalAttach(int pysicalAttach) {
		this.pysicalAttach = pysicalAttach;
	}
	
	
	
}
