package chapter7;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import sun.security.krb5.internal.PAData.SaltAndParams;

/**
 * 十六进制和十进制的之间的转换
 * @author sunguangyu
 *
 */
public class HexToDecimalDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整形数字");
		int decNum = input.nextInt();
		//1.让用户输入一个10进制的数字
		System.out.println(decToHex(decNum));
		//2.调用方法将10进制转换为16进制
		//3.再将16进制转换为10进制
		System.out.println(hexToDec(decToHex(decNum)));
	}
	/**
	 * 十六进制转换为十进制
	 * @param hex 要转换的16进制字符串
	 * @return 转换成功的10进制的字符串
	 */
	public static int  hexToDec(String hex){
		int decNum = 0;
		//6E -- 6 * 16 + 14 * 1
		for(int i = 0; i < hex.length(); i++){
			//取一个字符串中的每一个字符进行判断
			char tempChar = hex.charAt(i);
			//两种情况： '0-9' 'A-F'
			//小规律，如果数组中的首元素下标为i，那么最后一个元素的下标为：len - i - 1;
			if(tempChar >= '0' && tempChar <= '9'){
				decNum += (tempChar - '0') * Math.pow(16, hex.length() - i - 1);	//此处是16的次方
			
			}else if(tempChar >= 'A' && tempChar <= 'F'){
				decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1);
			}
		}
		return decNum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String decToHex(int decNum){
		//45/16反取余数
		String hex = "";
		while(decNum != 0){
			int temp = decNum % 16; //	取余数
			if(temp >= 0 && temp <= 9){
				hex = temp + hex;
			}else if(temp >= 10 && temp <= 15){
				hex = (char)(temp - 10 + 'A') + hex;
			}
			decNum /= 16;
		}
		return hex;
		
	}

}
