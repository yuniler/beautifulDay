package chapter7;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import sun.security.krb5.internal.PAData.SaltAndParams;

/**
 * ʮ�����ƺ�ʮ���Ƶ�֮���ת��
 * @author sunguangyu
 *
 */
public class HexToDecimalDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����������");
		int decNum = input.nextInt();
		//1.���û�����һ��10���Ƶ�����
		System.out.println(decToHex(decNum));
		//2.���÷�����10����ת��Ϊ16����
		//3.�ٽ�16����ת��Ϊ10����
		System.out.println(hexToDec(decToHex(decNum)));
	}
	/**
	 * ʮ������ת��Ϊʮ����
	 * @param hex Ҫת����16�����ַ���
	 * @return ת���ɹ���10���Ƶ��ַ���
	 */
	public static int  hexToDec(String hex){
		int decNum = 0;
		//6E -- 6 * 16 + 14 * 1
		for(int i = 0; i < hex.length(); i++){
			//ȡһ���ַ����е�ÿһ���ַ������ж�
			char tempChar = hex.charAt(i);
			//��������� '0-9' 'A-F'
			//С���ɣ���������е���Ԫ���±�Ϊi����ô���һ��Ԫ�ص��±�Ϊ��len - i - 1;
			if(tempChar >= '0' && tempChar <= '9'){
				decNum += (tempChar - '0') * Math.pow(16, hex.length() - i - 1);	//�˴���16�Ĵη�
			
			}else if(tempChar >= 'A' && tempChar <= 'F'){
				decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1);
			}
		}
		return decNum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String decToHex(int decNum){
		//45/16��ȡ����
		String hex = "";
		while(decNum != 0){
			int temp = decNum % 16; //	ȡ����
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
