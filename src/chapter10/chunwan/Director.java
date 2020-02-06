package chapter10.chunwan;
/**
 * 导演类-- 相当于我们项目中的核心业务类
 * 功能，让演员就位，开始表演
 * @author sunguangyu
 *
 */
public class Director {
	//导演的Action方法，让演员就位开始表演
	public void action(Actor actor){
		actor.performs();
	}
}
