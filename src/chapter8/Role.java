package chapter8;

public class Role {
	/**游戏角色的名称属性*/
	public String name;
	//等级
	public int level;
	//职业
	public String job;
	/**
	 * 释放仅能
	 * 
	 */
	public void doSkill(){
		if(name.equals("劳拉")){
			System.out.println("劳拉的经典技能双枪老太婆");
		}else if (name.equals("孙悟空")){
			System.out.println("吃俺老孙一棒");
			
		}else{
			System.out.println("name" + "发出了一记必杀！");
		}
			
		}
	}


