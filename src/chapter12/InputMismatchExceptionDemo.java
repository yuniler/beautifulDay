package chapter12;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

/**
 * 输入不匹配异常示例
 * @author sunguangyu
 *
 */
public class InputMismatchExceptionDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年龄（必须是整形数字）！");
		int age = -1;
		
		try {
			age = input.nextInt();
			age = age / 0;
		} catch (ArithmeticException e) {

			e.printStackTrace();//以堆载的方式打印异常
			
		} catch (Exception e){
			e.printStackTrace(System.err);
		}
		
		System.out.println("输入的年龄是：" + age);
		
		
		
	}
}
