package chapter12;
/**
 * 自定义异常-- 小于零时触发
 * @author sunguangyu
 *
 */
public class LessThanZeroException extends Exception{
	//在exception里最重要 ，重写父类的两个构造方法
	
	private int value;
	
	
	public LessThanZeroException(){
		super("数字不能小于零！");
	}
	
	public LessThanZeroException(int value){
		super("输入的数字为：" + value + "不能小于零！");
	}
	
}
