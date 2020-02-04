package chapter9.userdemo;
/**
 * 字符串的工具类，封装常用字符串的判断方法，判断单独进行此类
 * @author sunguangyu
 *
 */
public class StringUtil {
	
	public static boolean isCorrenctUserName(String userName){
		boolean isCorrect = true;
		String sql = "select * from users where id ='%s' and password='' or '1' = '1'";
		
		//sql的注入漏洞
		//password = "' or '1' = '1";
		if(userName == null) return false;
		if(userName.length() > 25) return false;
		//非法的字符数组
		char[] unValidChar = {' ', '\'', '"', '?', '<', '>', ','};
		for(char ch : unValidChar){
			if(userName.contains(Character.toString(ch))){
				isCorrect = false;
				break;
			}
		}
		
		return isCorrect;
		
		
	}
	
	
	//2.
	//如果返回值为"",那么密码的验证失败；验证成功，则返回星号表示密码的强度
	public static String vailddatePassword(String password){
		String power = "";//密码的强度
		if(password == null) return power;
		if(password.length() < 6 || password.length() > 18) return power;
		//String[] correctPart = {"_", "@", "#", "$", "!"};
		String part = "_@#$!";
		for (int i = 0; i < password.length(); i++) {
			if(!Character.isLetterOrDigit(password.charAt(i))){
				if(!part.contains(Character.toString(password.charAt(i)))){
					return power;
				}
			}
			
		}
		//判断密码强度
		if(isDigit(password) || isLetter(password)){
			power = "★★☆☆☆☆";
		}else if(isDigitAndLetter(password)){
			power = "★★★★☆☆";
			
		}else if(isContainsSymble(password)){
			power = "★★★★★★";
		}
		return power;
	}
	private static boolean isDigitAndLetterAndSymble(String value){
		for (int i = 0; i < value.length(); i++) {
			if(!(Character.isDigit(value.charAt(i)) || 
					Character.isLetter(value.charAt(i)) || 
					"_@#$!".contains(Character.toString(value.charAt(i))))){
				return false;
			}
		}
		return true;
	}
	/**
	 * 字符串中包含字母和字符串
	 * @param value
	 * @return
	 */
	private static boolean isDigitAndLetter(String value){
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isLetterOrDigit(value.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	//判断是否一个纯数字
	private static boolean isDigit(String value){
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isDigit(value.charAt(i))){
				return false;
			}
		}
		return true;
	}
	//判断是否一个纯字母
	private static boolean isLetter(String value){
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isDigit(value.charAt(i))){
				return false;
			}
		}
		return true;
	}
	//判断是否一个特殊符号
	private static boolean isContainsSymble(String value){
		String part = "_@#$!";
		for (int i = 0; i < value.length(); i++) {
			if(part.contains(Character.toString(value.charAt(i)))){
				return true;
			}
			
		}
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
