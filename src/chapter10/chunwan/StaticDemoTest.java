package chapter10.chunwan;
/**
 * �����������õ��Ķ���ͬһ������
 * @author sunguangyu
 *
 */
public class StaticDemoTest {
	public static void main(String[] args) {
		StaticDemo staticDemo1 = StaticDemo.getInstance();
		System.out.println(staticDemo1.normal_number);
		
		
		StaticDemo staticDemo2 = StaticDemo.getInstance();
		//System.out.println(staticDemo2.normal_number);
		staticDemo2.normal_number = 1024;
		
		
		
		StaticDemo staticDemo3 = StaticDemo.getInstance();
		System.out.println(staticDemo3.normal_number);
		System.out.println(staticDemo1 == staticDemo2);
		
		
		
	}

}
