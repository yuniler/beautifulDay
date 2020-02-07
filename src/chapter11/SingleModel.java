package chapter11;
/**
 * 单例模式示例 - 套路
 * @author sunguangyu
 *
 */
public class SingleModel {
	/** 用来保存唯一的本类的实例  */
	private static SingleModel me = null;
	public int count = 0;
	private SingleModel(){
		count++;
	}
	/**
	 * 获得本类唯一的一个实例 --- 单例模式的核心方法
	 */
	public static SingleModel getInstance(){
		if(null == me)//只要为空，就是唯一的一次实例化
			me = new SingleModel();//在本类可以new一下
		return me;
	}
}
