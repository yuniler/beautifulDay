package chapter8guessDemo;

public class HumanPlayer {
	//��̬��������ȭ����Ϣ
	public static final int MessageTypeFist = 1;
	
	public static final int MessageTypeWin = 2;
	
	public static final int MessageTypeLose = 3;
	//���ԣ����ƣ�������������ȭ������ɫ��Ӧ����Ч������ɫ�ĸ��Ի�̨��
	private String name;
	private int score;
	private int fist;
	//...........
	//��ɫ��ȭʱ�ĸ���̨��
	private String[] fistWords = {
			"���йⲨ~biubiubiu~",
			"���������ı���Ϊʲô��ô��",
			"��ɱ��¶pp��������",
			"������ϲ�����ཷ��",
			"�ز�����ŷ��ɣ������һȭ~",
			
	};
	private String[] winWords = {
			"����˭",
			"��ȭ",
			"����",
			"ȫ������",
			"���Ż�����Ÿ�",
	};
	private String[] loseWords = {
			"ͨ���ɹ���·����ʩ��������",
			"�ȵ���ˮ��ȥ����֪��˭����Ӿ",
			"������ǲ��ã����ʱ�����������綼û�ú�",
			"���������ˣ���QQ���ϣ�����̡��ú�����һ�������ܴ�̫����QQ����",
			"���˽����Ҷ������������Ҷ���"
	};
	public void sendMessage(int msgType){
		//����һ��0-4֮����������
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
		return fist;
	}
	public void setFist(int fist) {
		this.fist = fist;
	}
	
	
	
	//���������ú͵õ����ƣ���������������Ч����˵���Ի�̨�ʣ���ȭ
}
