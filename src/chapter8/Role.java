package chapter8;

public class Role {
	/**��Ϸ��ɫ����������*/
	public String name;
	//�ȼ�
	public int level;
	//ְҵ
	public String job;
	/**
	 * �ͷŽ���
	 * 
	 */
	public void doSkill(){
		if(name.equals("����")){
			System.out.println("�����ľ��似��˫ǹ��̫��");
		}else if (name.equals("�����")){
			System.out.println("�԰�����һ��");
			
		}else{
			System.out.println("name" + "������һ�Ǳ�ɱ��");
		}
			
		}
	}


