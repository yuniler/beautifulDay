package chapter10.chunwan;
/**
 * ��Ա����
 * @author sunguangyu
 *
 */
public abstract class Actor {//��һ�������࣬�Ͳ���ʹ��new��ʵ������abstract��һ�������ĸ���
	private String name;

	public Actor(){
		
	}
	
	public void performs(){
		System.out.println("��Ա" +name + "���ڱ��ݵĽ�Ŀ");
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
