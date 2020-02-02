package chapter8;

import java.util.Scanner;

public class CircleV2 {
	//Բ�İ뾶
	public double radius;
	//Բ���ܳ�
	public double perimeter;
	//Բ�����
	public double area;
	
	
	public CircleV2(){
		inputRadius();
	}
	
	public CircleV2(double radius1){
		if(radius1 > 0){
			radius = radius1;
		}else{
			inputRadius();
		}
	}
	
	
	private void inputRadius(){
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