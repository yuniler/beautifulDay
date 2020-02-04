package chapter9.userdemo;
/**
 * �ַ����Ĺ����࣬��װ�����ַ������жϷ������жϵ������д���
 * @author sunguangyu
 *
 */
public class StringUtil {
	
	public static boolean isCorrenctUserName(String userName){
		boolean isCorrect = true;
		String sql = "select * from users where id ='%s' and password='' or '1' = '1'";
		
		//sql��ע��©��
		//password = "' or '1' = '1";
		if(userName == null) return false;
		if(userName.length() > 25) return false;
		//�Ƿ����ַ�����
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
	//�������ֵΪ"",��ô�������֤ʧ�ܣ���֤�ɹ����򷵻��Ǻű�ʾ�����ǿ��
	public static String vailddatePassword(String password){
		String power = "";//�����ǿ��
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
		//�ж�����ǿ��
		if(isDigit(password) || isLetter(password)){
			power = "�������";
		}else if(isDigitAndLetter(password)){
			power = "�������";
			
		}else if(isContainsSymble(password)){
			power = "�������";
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
	 * �ַ����а�����ĸ���ַ���
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
	
	
	
	
	
	
	
	
	//�ж��Ƿ�һ��������
	private static boolean isDigit(String value){
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isDigit(value.charAt(i))){
				return false;
			}
		}
		return true;
	}
	//�ж��Ƿ�һ������ĸ
	private static boolean isLetter(String value){
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isDigit(value.charAt(i))){
				return false;
			}
		}
		return true;
	}
	//�ж��Ƿ�һ���������
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
