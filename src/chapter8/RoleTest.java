package chapter8;

public class RoleTest {
	public static void main(String[] args) {
		//ʵ����
		Role role1 = new Role();
		role1.name = "����";
		role1.level = 25;
		role1.job = "����Уξ";
		role1.doSkill();
		
		
		Role role2 = null;	//������Role���͵ı�����role2 
		role2 = new Role();
		role2.name = "�����";
		role2.job = "����";
		role2.level = 99;
		role2.doSkill();
		Role role3 = new Role();
		role3.name = "����";
		role3.doSkill();
		
				
	}

}
