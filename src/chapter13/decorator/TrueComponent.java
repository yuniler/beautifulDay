package chapter13.decorator;
/**
 * 真正干活的组件类
 * 实现了基本的read方法
 * @author sunguangyu
 *
 */
public class TrueComponent extends Component{

	@Override
	public void read() {
		System.out.println("TrueComponent实现的read方法");
		
	}
	

}
