package chapter10;
/**
 * սʿ��--�̳���Hero��
 * @author sunguangyu
 *
 */
public class Warrior extends Hero{
	public static int ID = 1;//սʿ�ྲ̬���ԣ�ÿʵ����һ���µ�չʾ����ID++
	
	
	
	//սʿ�������ԣ�������
	private int pysicalAttach;
	public Warrior(){
		super();
		setNickName("Ĭ��սʿ" + ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setPysicalAttach(99);
		ID++;
		//super();		//���๹���У�Ĭ�Ͼͻ���ø��๹��
//		System.out.println("����Ĭ�Ϲ���");
	}
	
	public Warrior(String nickName, int pysicalAttach){
		this();//���ñ����Ĭ�Ϲ���
		setNickName(nickName);
		setPysicalAttach(pysicalAttach);
	}

	@Override
	public boolean equals(Object obj){
		if (!(obj instanceof Warrior)){
			return false;
		}
		Warrior newWarrior = (Warrior)obj;
		//�Ƚ���������
		if(getNickName().equals(newWarrior.getNickName()) && getPysicalAttack() == newWarrior.getPysicalAttack()){
			return true;
		}
		return false;
	}
	
@Override
public String toString() {
	
	StringBuffer str = new StringBuffer();
	str.append(getLevel());
	str.append("\t");
	str.append(getNickName());
	str.append("\t");
	str.append(getMaxLife());
	str.append("\t\t");
	str.append(getCurrLife());
	str.append("\t");
	str.append(getPysicalAttack());		
	return str.toString();
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
