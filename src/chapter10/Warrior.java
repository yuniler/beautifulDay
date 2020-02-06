package chapter10;
/**
 * 战士类--继承了Hero类
 * @author sunguangyu
 *
 */
public class Warrior extends Hero{
	public static int ID = 1;//战士类静态属性，每实例化一个新的展示对象，ID++
	
	
	
	//战士特有属性，物理攻击
	private int pysicalAttach;
	public Warrior(){
		super();
		setNickName("默认战士" + ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setPysicalAttach(99);
		ID++;
		//super();		//子类构造中，默认就会调用父类构造
//		System.out.println("子类默认构造");
	}
	
	public Warrior(String nickName, int pysicalAttach){
		this();//调用本类的默认构造
		setNickName(nickName);
		setPysicalAttach(pysicalAttach);
	}

	@Override
	public boolean equals(Object obj){
		if (!(obj instanceof Warrior)){
			return false;
		}
		Warrior newWarrior = (Warrior)obj;
		//比较两个属性
		if(getNickName().equals(newWarrior.getNickName()) && getPysicalAttack() == newWarrior.getPysicalAttack()){
			return true;
		}
		return false;
	}
	
@Override
public String toString() {
	
	StringBuffer str = new StringBuffer();
	str.append(getLevel());
	str.append("\t");
	str.append(getNickName());
	str.append("\t");
	str.append(getMaxLife());
	str.append("\t\t");
	str.append(getCurrLife());
	str.append("\t");
	str.append(getPysicalAttack());		
	return str.toString();
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
