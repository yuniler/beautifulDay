package chapter8;

public class Hero {
	private long id;
	private String nickName;
	private int level;
	private long currExp;//当前的经验值

	private long exp;//当前级别升级所需的经验值

	public Hero() {
		super();
	
	}
	public Hero(String nickName){
		this.nickName = nickName;
	}
	public Hero(long id, String nickName, int level, long exp){
		super();
		this.id = id;
		this.nickName =nickName;
		this.level = level;
		this.exp = exp;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		if(id <= 0) id = 1;
		else
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

//	private void setNickName(String nickName) {
//		if(null == nickName){
//			nickName = "未知英雄";
//		}else{
//			this.nickName = nickName;
//		}
//		
//	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level <1 || level > 999){
			this.level = 1;
		}else{
			this.level = level;
		}
	}

	public long getExp() {
		exp = ((long)Math.pow(level - 1, 3) + 60) / 5 * ((level - 1) * 2 + 60);
		return exp;
	}
//固定需要经验值，无需玩家自己输入
//	public void setExp(long exp) {
//		this.exp = exp;
//	}
	public long getCurrExp() {
		return currExp;
	}
	public void setCurrExp(long currExp) {
		this.currExp = currExp;
	}

}
