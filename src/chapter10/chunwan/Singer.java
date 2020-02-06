package chapter10.chunwan;
/**
 * 歌唱演员
 * @author sunguangyu
 *
 */
public class Singer extends Actor {

	public Singer() {
		super();
		
	}

	public Singer(String name) {
		super(name);
		
	}
	@Override
	public void performs() {
		System.out.println("歌唱演员" + getName() + "正在表演歌唱节目。。。");
	}
}
