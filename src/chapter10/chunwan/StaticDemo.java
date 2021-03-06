package chapter10.chunwan;
/**
 * 静态
 * @author sunguangyu
 *
 */
public class StaticDemo {
	private static StaticDemo me = null;
	//将构造方法私有，以便实现外部无法实现new进行实例化的效果
	private StaticDemo(){
		//将构造方法定义为私有
		me = this;
	}
	/**
	 * 要获得当前类对象的实例，只能调用本方法
	 * @return
	 */
	public static StaticDemo getInstance() {
		if(me == null){
			me = new StaticDemo();//唯一的一次实例化
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
