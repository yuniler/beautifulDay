package chapter8;

public class Role {
	/**��Ϸ��ɫ����������*/
	public String name;
	//�ȼ�
	public int level;
	//Ĭ�Ϲ��졣����//���û��д���췽��������Ĭ�Ϲ��죬д�˹��췽����Ĭ�Ϲ����򱻸��� ������д������ͻ
	public Role(){
		
	}
	//ְҵ
	/**
	 * ���췽��
	 * 1.û�з���ֵ
	 * 2.������������һ��
	 */
	public Role(String name1, int level1, String job1){
		name = name1;
		level = level1;
		job = job1;
		
	}
	
	
	public String job;
	/**
	 * �ͷŽ���
	 * 
	 */
	public void show(){
		System.out.print(name + "\t" + level + "\t");
	}
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


