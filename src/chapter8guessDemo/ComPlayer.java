
package chapter8guessDemo;

public class ComPlayer {
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
			"����һ��",
			"����Ҵ�Ӧ��",
			"��ɱ��",
			"��ϲ�����ཷ��",
			"����һȭ~",
			
	};
	private String[] winWords = {
			"����һש",
			"����ֻ��һ��",
			"����һ��" + "����긽�壬������һ���ˣ�����",
			"������",
			"�ոպ��ҵ���������",
	};
	private String[] loseWords = {
			"�޳�����",
			"�����",
			"ţ�ƵĲ���",
			"�ҿ���",
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
		//���Եĳ�ȭ��1-3֮�����ɵ��������
		fist = ((int)Math.random() * 30000) % 3 + 1;
		return fist;
	}
//	public void setFist(int fist) {
//		this.fist = fist;
//	}
//	
	
	
	//���������ú͵õ����ƣ���������������Ч����˵���Ի�̨�ʣ���ȭ
}

