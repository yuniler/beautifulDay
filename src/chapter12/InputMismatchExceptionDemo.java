package chapter12;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

/**
 * ���벻ƥ���쳣ʾ��
 * @author sunguangyu
 *
 */
public class InputMismatchExceptionDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������䣨�������������֣���");
		int age = -1;
		
		try {
			age = input.nextInt();
			age = age / 0;
		} catch (ArithmeticException e) {

			e.printStackTrace();//�Զ��صķ�ʽ��ӡ�쳣
			
		} catch (Exception e){
			e.printStackTrace(System.err);
		}
		
		System.out.println("����������ǣ�" + age);
		
		
		
	}
}
