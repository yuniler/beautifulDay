package chapter10;
/**
 * 继承法师类
 * @author sunguangyu
 *
 */
public class Archmage extends Hero{
	
	//战士类静态属性，每实例化一个新的展示对象，ID++
	public static int ID = 1;
	
	private int magicAttck;
	
	public Archmage(){//默认构造
		setNickName("默认法师" + ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setMagicAttck(99);
		ID++;
	}
	
	
	public Archmage(String nickName){
		this();//调用本类的默认构造
		setNickName(nickName);
		
	}
	
	
	
	@Override
	public String toString() {
		//重写toString方法，封装打印角色信息
		StringBuffer str = new StringBuffer();
		str.append(getLevel());
		str.append("\t");
		str.append(getNickName());
		str.append("\t");
		str.append(getMaxLife());
		str.append("\t\t");
		str.append(getCurrLife());
		str.append("\t");
		str.append(getMagicAttck());		
		return str.toString();
	}
	
	public void biubiubiu(){
		System.out.println("大法师XXX" +getNickName() + "正在搓火球！");
		}

	public int getMagicAttck() {
		return magicAttck;
	}

	public void setMagicAttck(int magicAttck) {
		this.magicAttck = magicAttck;
	}

}
