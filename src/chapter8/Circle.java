package chapter8;

import java.util.Scanner;

public class Circle {
	//Բ�İ뾶
	public double radius;
	//Բ���ܳ�
	public double perimeter;
	//Բ�����
	public double area;
	
	public void inputRadius(){
		Scanner input = new Scanner(System.in);
		System.out.println("������Բ�İ뾶: ");
		radius = input.nextDouble();
		input.close();
	}
	public void showPerimeter(){
		if(radius <= 0){
			inputRadius();//����û�û������뾶�����÷���ǿ�����û�����뾶
		}
		perimeter = 2* Math.PI * radius;
		System.out.println("�ܳ�Ϊ��" + perimeter);
		
	}
	public void showArea(){
		if(radius <= 0){
			inputRadius();//����û�û������뾶�����÷���ǿ�����û�����뾶
		}
		area = Math.PI * Math.pow(radius, 2);
		System.out.println("���Ϊ��" + area);
		
	}
} 
