package chapter12;
/**
 * ����쳣--�ĸ���RunTimeException/Error
 * @author sunguangyu
 *
 */
public class UnCheckedException {
	public static void main(String[] args) {
//		String value = null;
//		System.out.println(value.toString());//��ָ�뼴�޿ռ�
//		
//		String strValue = "123a";
//		//�ַ���ת��Ϊ����
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