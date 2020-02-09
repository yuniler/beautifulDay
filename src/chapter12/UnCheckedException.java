package chapter12;
/**
 * 免检异常--的父类RunTimeException/Error
 * @author sunguangyu
 *
 */
public class UnCheckedException {
	public static void main(String[] args) {
//		String value = null;
//		System.out.println(value.toString());//空指针即无空间
//		
//		String strValue = "123a";
//		//字符串转换为数字
//		int value1 = Integer.parseInt(strValue);
//		System.out.println(value1);
		
		//Object p = new Person();
		Person p = new Person();
		Student stu = (Student)p;
		
		
		
	}	
}
class Person{
	
}
class Student extends Person{
	
}