package chapter10.chunwan;
/**
 * ��̬
 * @author sunguangyu
 *
 */
public class StaticDemo {
	private static StaticDemo me = null;
	//�����췽��˽�У��Ա�ʵ���ⲿ�޷�ʵ��new����ʵ������Ч��
	private StaticDemo(){
		//�����췽������Ϊ˽��
		me = this;
	}
	/**
	 * Ҫ��õ�ǰ������ʵ����ֻ�ܵ��ñ�����
	 * @return
	 */
	public static StaticDemo getInstance() {
		if(me == null){
			me = new StaticDemo();//Ψһ��һ��ʵ����
		}
		return me;
	}
	
	
	public static int static_number = 1;
	
	public  int normal_number = 1;
	
	public void test(){
		static_number++;
		normal_number++;
	}
//	public static void main(String[] args) {
//		StaticDemo staticDemo1 = new StaticDemo();
//		staticDemo1.test();
//		
//		System.out.println(StaticDemo.static_number);
//		System.out.println(StaticDemo1.normal_number);
//		
//		StaticDemo staticDemo2 = new StaticDemo();
//		staticDemo2.test();
//		
//		System.out.println(StaticDemo.static_number);
//		System.out.println(StaticDemo.normal_number);
//		
//	}

	

}
