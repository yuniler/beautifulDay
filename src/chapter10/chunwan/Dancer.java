package chapter10.chunwan;

public class Dancer extends Actor{

	public Dancer() {
		super();
		
	}

	public Dancer(String name) {
		super(name);
		
	}
	@Override
	public void performs() {
		System.out.println("舞蹈演员" + getName() + "正在表演。。。");
	}
}
