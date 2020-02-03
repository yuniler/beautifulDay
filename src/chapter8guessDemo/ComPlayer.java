
package chapter8guessDemo;

public class ComPlayer {
	//静态常量：出拳的信息
	public static final int MessageTypeFist = 1;
	
	public static final int MessageTypeWin = 2;
	
	public static final int MessageTypeLose = 3;
	//属性：名称，分数，所出的拳，（角色对应的音效），角色的个性化台词
	private String name;
	private int score;
	private int fist;
	//...........
	//角色出拳时的个性台词
	private String[] fistWords = {
			"给你一脚",
			"叫你敢答应吗",
			"必杀：",
			"你喜欢吃青椒吗？",
			"吃我一拳~",
			
	};
	private String[] winWords = {
			"给你一砖",
			"真相只有一个",
			"在这一刻" + "被灵魂附体，他不是一个人！！！",
			"出击啊",
			"刚刚和我的朋友下棋",
	};
	private String[] loseWords = {
			"修成正果",
			"别逼我",
			"牛逼的不是",
			"我砍。",
			"众人皆醒我独醉，举世皆浊我独清"
	};
	public void sendMessage(int msgType){
		//生成一个0-4之间的随机数字
		int index = ((int)(Math.random() * 1000 )) % 5;
		String message = null;
		switch (msgType){
		case MessageTypeFist:
			message = fistWords[index];
			break;
		case MessageTypeWin:
			message = winWords[index];
			break;
		case MessageTypeLose:
			message = loseWords[index];
			break;
		}
		System.out.println(message);
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getFist() {
		//电脑的出拳是1-3之间生成的随机数字
		fist = ((int)Math.random() * 30000) % 3 + 1;
		return fist;
	}
//	public void setFist(int fist) {
//		this.fist = fist;
//	}
//	
	
	
	//方法：设置和得到名称，分数，（播放音效），说个性化台词，出拳
}

