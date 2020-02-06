package chapter10.chunwan;
/**
 * 演员父类
 * @author sunguangyu
 *
 */
public abstract class Actor {//当一个抽象类，就不能使用new来实例化，abstract是一个天生的父类
	private String name;

	public Actor(){
		
	}
	
	public void performs(){
		System.out.println("演员" +name + "正在表演的节目");
	}
	
	
	
	public Actor(String name){
		setName(name);
	}
	
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
