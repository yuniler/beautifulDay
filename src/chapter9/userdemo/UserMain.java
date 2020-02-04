package chapter9.userdemo;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
	

		Scanner input = new Scanner(System.in);
		//以下代码实现用户注册
//		System.out.println("请输入用户名：");
//		String userName = input.next();
		System.out.println("请输入密码：");
		String password = input.next();
		System.out.println(StringUtil.vailddatePassword(password));
//		String password = input.next();
//		System.out.println("请输入邮箱：");
//		String email = input.next();
		
		
		
		
		
		}

}
