package chapter9;

import java.util.Scanner;

public class BoxingDemo {
	public static boolean isDigit(char ch){
		return ch >= '0' && ch <= '9';
	}
	public static void main(String[] args) {
		//�����ַ�����װ��-  ��װ����
//		Character.isLetter(ch);
//		Character.isLetterOrDigit(ch);
//		Character.isJavaIdentifierPart(ch);//�����ж϶���java�����ĵ����У������ַ��⣬�����ַ��Ƿ��ǺϷ��ַ�
//		Character.isJavaIdentifierStart(ch);//�ж�java�����У���һ���ַ��Ƿ��ǺϷ��ַ�
//		Character.isUpperCase(ch);//�ж��Ƿ��Ǵ�д��ĸ
//		
		//Character.isDigit(ch)
		boolean isDigit = true;//�ж��Ƿ��Ǵ�����
		System.out.println("������һ���ַ����������ж��Ƿ���һ�������֣�");
		String value = new Scanner(System.in).next();
		for (int i = 0; i < value.length(); i++) {
			//if(!isDigit(value.charAt(i))){�������
			if(!Character.isDigit(value.charAt(i))){//�ж��Ƿ��Ǵ�����
				isDigit = false;
				break;
			}
		}
		if(!isDigit){
			System.out.println("����һ�������֣�");
		}else{
			System.out.println("��һ�������֣�");
		}
		
		
		
		//String str = "123";
		//Integer.parseInt(str);
		
		
		
		
		
		
		
		
		
		
		
		
//		Book book1 = new Book("̸java", "123-321", 98.8, 5);
//		Book book2 = new Book("̸java", "123-321", 98.8, 5);
//		//System.out.println(book1 == book2);
//	
//		//��ʵ�ǵ�ַ�ıȽ�
		
		
		
//		Integer num1 = Integer.valueOf(200);
//		Integer num2 = 200;
//		//System.out.println(num1 == num2);
//		System.out.println(num1.compareTo(num2));//���ԱȽ�
//		
//		
		
//		double num1 = 3.14;
//		Double dNum1 = new Double("3.14");
//		Double dNum1_1 = Double.valueOf(num1);
//		Double dNum1_2 = 3.14;//�Զ�װ��
//		
//		num1 = dNum1;	//�Զ�����
//		num1 = dNum1_1.doubleValue();
		
//		System.out.println(num1 + "\t" + dNum1);
	
}
}
