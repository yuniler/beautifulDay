package chapter8;

public class Role {
	/**游戏角色的名称属性*/
	public String name;
	//等级
	public int level;
	//默认构造。。。//如果没有写构造方法，则有默认构造，写了构造方法，默认构造则被覆盖 ，需在写，不冲突
	public Role(){
		
	}
	//职业
	/**
	 * 构造方法
	 * 1.没有返回值
	 * 2.方法名和类名一致
	 */
	public Role(String name1, int level1, String job1){
		name = name1;
		level = level1;
		job = job1;
		
	}
	
	
	public String job;
	/**
	 * 释放仅能
	 * 
	 */
	public void show(){
		System.out.print(name + "\t" + level + "\t");
	}
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


