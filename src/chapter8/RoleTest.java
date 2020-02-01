package chapter8;

public class RoleTest {
	public static void main(String[] args) {
		//实例化
		Role role1 = new Role();
		role1.name = "劳拉";
		role1.level = 25;
		role1.job = "摸金校尉";
		role1.doSkill();
		
		
		Role role2 = null;	//声明了Role类型的变量，role2 
		role2 = new Role();
		role2.name = "孙悟空";
		role2.job = "神仙";
		role2.level = 99;
		role2.doSkill();
		Role role3 = new Role();
		role3.name = "至尊宝";
		role3.doSkill();
		
				
	}

}
