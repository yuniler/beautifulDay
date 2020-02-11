package chapter13.decorator;
/**
 * 装饰器父类，用来为基本的组件实现功能的扩展
 * @author sunguangyu
 *
 */
public class Decorator extends Component{
	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void read() {
		//注意：观察谁真正实现了read功能
		//将请求转发给component对象，转发后就可以执行一些扩展操作
		component.read();
		
	}

}
