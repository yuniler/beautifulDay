package chapter10.chunwan;

public class ChunWanTest {
	public static void main(String[] args) {
		Director ����ı = new Director();
		
		
		Singer ����Ӣ = new Singer();
		Dancer ����Ƽ = new Dancer("����Ƽ");
		
		Actor actor = new Actor("������");
		����ı.action(����Ӣ);
		����ı.action(����Ƽ);
		
		
		
	}

}
