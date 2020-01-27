package test;

public class Student {
	public String name;
	public String age;
	public String id;
	public String sex;
	public Chengji cj;
	//...
	
	public Student(String name,String age) {
		this.name = name;
		this.age = age;
	}
	
	public class Chengji {
		public String yingyu;
		public String shuxue;
		//...
	}
}
