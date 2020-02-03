package chapter8guessDemo;

import java.util.Scanner;

/**
 * ��Ϸ��������Է���
 * @author sunguangyu
 *
 */
public class GameRoom {
	//���ԣ��Ƿ��ơ����ߡ�������Ϸ����ҡ�����š��������ơ���������
	private HumanPlayer player1 = null;
	private ComPlayer player2= null;
	private long roomId;
	private String roomName;
	private String roomPass;
	
	
	public GameRoom(String roomName, String roomPass){
		if(!("admin".equals(roomName) && "123".equals(roomPass))){
			System.out.println("�����������ǿ���˳�!");
			return;
		}
		this.setRoomName(roomName);
		initGame();
		startGame();
		endGame();
	}
	
	
	//��������ʼ��Ϸ����ʼ����Ϸ����ʾ�˵���ѡ������ж���Ӯ�����Զ����ڲ����ࣩ
	public void initGame(){
		//1.ʵ������Ϸ��Ҷ���
		player1 = new HumanPlayer();
		player2 = new ComPlayer();
		//2.��ʼ����Ϸ���������ԣ��绨���ݲ�
		for (int i = 0; i < 30; i++) {
			System.out.print("*");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n��Ϸ���سɹ�");
	}
	public void startGame(){
		showMenu();
		choiceRole();
		gaming();
		
	}
/**
 * ��Ϸ��ѭ��
 */

	private void gaming() {
		while (true){
		//˫����ȭ
		System.out.println(player1.getName() + "���ȭ��");
		Scanner input = new Scanner(System.in);
		//ʡ���ж�
		player1.setFist(input.nextInt());
		int fist1 = player1.getFist();
		player2.getFist();
		int fist2 = player2.getFist();
		//�ж���Ӯ
		int result = judge(fist1, fist2);
		if(result == -1){
			System.out.println("��������ʦ����" + player1.getName() + "ʤ����");
			player1.sendMessage(HumanPlayer.MessageTypeWin);
			player2.sendMessage(ComPlayer.MessageTypeLose);
		}else if(result == 0){
			System.out.println("��������ʦ����" + "˫����ƽ");
			player1.sendMessage(HumanPlayer.MessageTypeFist);
			player2.sendMessage(ComPlayer.MessageTypeFist);
		}else{
			System.out.println("��������ʦ����" + player2.getName() + "ʤ����");
			player2.sendMessage(ComPlayer.MessageTypeWin);
			player1.sendMessage(HumanPlayer.MessageTypeLose);
		}
		//�������-1 ���1ʤ��������0����ƽ������1�����ʤ��
		//��ӡ���
		System.out.print("�Ƿ������Ϸ��");
		String answer = new Scanner(System.in).next();
		if(!"y".equalsIgnoreCase(answer)){
			break;
		}
		}
	}
	public void showMenu(){
		System.out.println("��ӭ���롶" + roomName + "����Ϸ����");
		System.out.println("��ȭ����1-������2-����3-ʯͷ");
		
	}
	public void choiceRole(){
		System.out.println("�Է���ɫ��1-��䣻2-���ݣ�3-���ϣ�4-������");
		System.out.println("��ѡ��");
		int choice = new Scanner(System.in).nextInt();
		String[] nameArray = {"���", "����", "����", "����"};
		player2.setName(nameArray[choice - 1]);
		player1.setName("Ұԭ��֮��");
		System.out.println(player1.getName() + "VS" + player2.getName());
		
	}
	public int judge(int fist1, int fist2){
		if(fist1 == fist2) return 0; //ƽ�� 
		if(fist1 == 1 && fist2 == 3 || fist1 == 2 && fist2 == 1 || fist1 == 3 && fist2 == 2){
			//���1�ķ�����1����Ҷ��ķ�����һ
			player1.setScore(player1.getScore() + 1);
			player2.setScore(player2.getScore() - 1);
			return -1; //���1ʤ��
		
		}
		player1.setScore(player1.getScore() - 1);
		player2.setScore(player2.getScore() + 1);
		return 1;
	}
	public void endGame(){
		System.out.println(player1.getName() + "\t" + player2.getName());
		System.out.println(player1.getScore() + "\t\t" + player2.getScore());
		System.out.println("��Ϸ�Խ�������ӭ������");
		
	}
	
	
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomPass() {
		return roomPass;
	}
	public void setRoomPass(String roomPass) {
		this.roomPass = roomPass;
	}
	

}
