package chapter10;
/**
 * սʿ��--�̳���Hero��
 * @author sunguangyu
 *
 */
public class Warrior extends Hero{
	//սʿ�������ԣ�������
	private int pysicalAttach;
	public Warrior(){
		//super();		//���๹���У�Ĭ�Ͼͻ���ø��๹��
		System.out.println("����Ĭ�Ϲ���");
	}
	
	public Warrior(String nickName, int pysicalAttach){
		setNickName(nickName);
		setPysicalAttach(pysicalAttach);
	}

	
	@Override//ע�⣺��д�������������淶��������ֹд����д����
	public void move() {
		System.out.println("սʿ���ƶ���������");
	}
	//��д������ƶ�����
//	public void move(){
//		System.out.println(getNickName() + "���ƶ��������ȣ�");
//	}
//	
	
	public int getPysicalAttack() {
		return pysicalAttach;
	}

	public void setPysicalAttach(int pysicalAttach) {
		this.pysicalAttach = pysicalAttach;
	}
	
	
	
}
