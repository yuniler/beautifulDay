package chapter9;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringDemo {
	/**
	 * 判断传入的字符串是否是一个正确格式的小数
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
		//判断字符串只能有一个小数点
		
		//1.存在小数点。2.从前搜索的下标和从后往前搜索的下标刚好相等
		if(!(str.contains(".") && str.indexOf(".") == str.lastIndexOf("."))){
			return false;
		}
		
		//1.判断字符串中的每一个元素必须是数字或小数点
		//2.如果有小数点，那么小数点不能在第一位和最后一位，并且只能有一个小数点
//		if(str.indexOf('.') == 0 || str.indexOf(".") == str.length() - 1);
		return isDecimal;
	}
	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner input = new Scanner(System.in);
		//indexOf方法
		String password = "123456abc";
//		System.out.println(passWord.indexOf("a"));//返回字符串下标
//		
		//问题：判断字符串中只能有一个小数点，小数点不能在第一位，也不能在最后位
		
		
		//substring [beginIndex, endIndex)		[1, 3)左闭右开
		System.out.println(password.substring(1, 3));
		System.out.println(password.substring(3));
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//trim方法：去掉字符串左右两侧的空格
//		//建议：在用户输入用户名后使用
//		System.out.println("请输入用户名");
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
//		String str1 = "你好，世界";
//		String str2 = new String();
//		String str3 = new String (str1);
//		
//		char[] chArray = {'a', 'b', 'c'};
//		//将字符数组转换成String对象
//		String str4 = new String(chArray);
//		chArray = str4.toCharArray();
//		
//		
//		//字符数组与字符串的转换：-128到127之间
//		byte[] byteArray = {104, 101, 108, 108, 111};
//		String str5 = new String(byteArray);
//		System.out.println(str5);
//		
//		//字符转码
//		String str6 = new String(str1.getBytes(), "UTF-8");
//		System.out.println(str6);
//		
//		
		
//		String value = "Hello World";
//		value += "Good";//相当于调用value.
//		String value2 = "HelloWorldGood";
//		System.out.println("value == value2");
	}

}
