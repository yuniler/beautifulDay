package chapter8;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
//		Circle circle = new Circle();
//		circle.inputRadius();
//		circle.showPerimeter();
//		circle.showArea();
//		CircleV2 circle = new CircleV2();
//		circle.showArea();

		Scanner input = new Scanner(System.in);
		System.out.println("������Բ�İ뾶");
		double radius = input.nextDouble();
		CircleV3 circle = new CircleV3();
		circle.show();
		
	}

}
