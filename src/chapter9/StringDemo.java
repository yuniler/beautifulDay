package chapter9;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringDemo {
	/**
	 * �жϴ�����ַ����Ƿ���һ����ȷ��ʽ��С��
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static boolean isDecimal(String str){
		boolean isDecimal = true;
		for (int i = 0; i < str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))){
				if(str.charAt(i) == '.'){
					if(i == 0 || i == str.length() - 1){
						isDecimal = false;
						break;
					}
				}else{
				isDecimal = false;
				break;
			}
			}
		}
		//�ж��ַ���ֻ����һ��С����
		
		//1.����С���㡣2.��ǰ�������±�ʹӺ���ǰ�������±�պ����
		if(!(str.contains(".") && str.indexOf(".") == str.lastIndexOf("."))){
			return false;
		}
		
		//1.�ж��ַ����е�ÿһ��Ԫ�ر��������ֻ�С����
		//2.�����С���㣬��ôС���㲻���ڵ�һλ�����һλ������ֻ����һ��С����
//		if(str.indexOf('.') == 0 || str.indexOf(".") == str.length() - 1);
		return isDecimal;
	}
	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner input = new Scanner(System.in);
		//indexOf����
		String password = "123456abc";
//		System.out.println(passWord.indexOf("a"));//�����ַ����±�
//		
		//���⣺�ж��ַ�����ֻ����һ��С���㣬С���㲻���ڵ�һλ��Ҳ���������λ
		
		
		//substring [beginIndex, endIndex)		[1, 3)����ҿ�
		System.out.println(password.substring(1, 3));
		System.out.println(password.substring(3));
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//trim������ȥ���ַ�����������Ŀո�
//		//���飺���û������û�����ʹ��
//		System.out.println("�������û���");
//		String uName = input.nextLine().trim();
//		System.out.println("--" + uName + "--");
		
		
//		String a = "abc";
//		String b = "234";
//		String c = a + b;
//		
//		System.out.println("abc".equals("abc"));
//		System.out.println("abcdefg".compareTo("abcd"));
//		System.out.println("abc".startsWith("b"));
//		System.out.println("abcdefg".endsWith("fg"));
//		System.out.println("abcdefg".contains("de"));
//		
		
		
		
		
//		
//		String str1 = "��ã�����";
//		String str2 = new String();
//		String str3 = new String (str1);
//		
//		char[] chArray = {'a', 'b', 'c'};
//		//���ַ�����ת����String����
//		String str4 = new String(chArray);
//		chArray = str4.toCharArray();
//		
//		
//		//�ַ��������ַ�����ת����-128��127֮��
//		byte[] byteArray = {104, 101, 108, 108, 111};
//		String str5 = new String(byteArray);
//		System.out.println(str5);
//		
//		//�ַ�ת��
//		String str6 = new String(str1.getBytes(), "UTF-8");
//		System.out.println(str6);
//		
//		
		
//		String value = "Hello World";
//		value += "Good";//�൱�ڵ���value.
//		String value2 = "HelloWorldGood";
//		System.out.println("value == value2");
	}

}
