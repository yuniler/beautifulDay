package chapter10;

public class Hero {
	private String nickName;
	private int level;
	private int maxLife;
	private int currLife;
	
	
	
	
	
	public Hero() {
//		System.out.println("����Ĭ�Ϲ��죡");

	}
	public Hero(String nickName, int level, int maxLife, int currLife) {
		super();
		this.nickName = nickName;
		this.level = level;
		this.maxLife = maxLife;
		this.currLife = currLife;
	}
	
	public int compareToByName(Hero hero){
		return getNickName().compareTo(hero.getNickName());
	}
	
	
	
	/**
	 * �Ƚϵ�ǰӢ�۶���ʹ����Ӣ�۶���Ĵ�С���
	 * hero
	 * @param hero
	 * @return
	 */
	
	public int compareTo(Hero hero){
		//����Ƚ�
		if (this.level > hero.getLevel())
			return 1;
		else if(this.level == hero.getLevel())
			return 0;
		else//������ڽ���
			return -1;
	}
	
	
	
	
	
	
	public void move(){
		System.out.println("Hero���move����");
	}
	
	
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	public int getCurrLife() {
		return currLife;
	}
	public void setCurrLife(int currLife) {
		this.currLife = currLife;
	}
	

}
