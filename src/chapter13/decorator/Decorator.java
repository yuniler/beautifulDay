package chapter13.decorator;
/**
 * װ�������࣬����Ϊ���������ʵ�ֹ��ܵ���չ
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
		//ע�⣺�۲�˭����ʵ����read����
		//������ת����component����ת����Ϳ���ִ��һЩ��չ����
		component.read();
		
	}

}
