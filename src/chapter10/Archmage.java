package chapter10;
/**
 * �̳з�ʦ��
 * @author sunguangyu
 *
 */
public class Archmage extends Hero{
	
	//սʿ�ྲ̬���ԣ�ÿʵ����һ���µ�չʾ����ID++
	public static int ID = 1;
	
	private int magicAttck;
	
	public Archmage(){//Ĭ�Ϲ���
		setNickName("Ĭ�Ϸ�ʦ" + ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setMagicAttck(99);
		ID++;
	}
	
	
	public Archmage(String nickName){
		this();//���ñ����Ĭ�Ϲ���
		setNickName(nickName);
		
	}
	
	
	
	@Override
	public String toString() {
		//��дtoString��������װ��ӡ��ɫ��Ϣ
		StringBuffer str = new StringBuffer();
		str.append(getLevel());
		str.append("\t");
		str.append(getNickName());
		str.append("\t");
		str.append(getMaxLife());
		str.append("\t\t");
		str.append(getCurrLife());
		str.append("\t");
		str.append(getMagicAttck());		
		return str.toString();
	}
	
	public void biubiubiu(){
		System.out.println("��ʦXXX" +getNickName() + "���ڴ����");
		}

	public int getMagicAttck() {
		return magicAttck;
	}

	public void setMagicAttck(int magicAttck) {
		this.magicAttck = magicAttck;
	}

}
