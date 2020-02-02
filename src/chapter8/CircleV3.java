package chapter8;

public class CircleV3 {
		//Բ�İ뾶
		private double radius;
		//Բ���ܳ�
		private double perimeter;
		//Բ�����
		private double area;
		
		public double getRadius(){
			return radius;
		}
		
		public void show(){
			System.out.println("�ܳ�Ϊ" + this.getPerimeter());
			System.out.println("���Ϊ" + this.getArea());
		}
		
		
		
		public CircleV3() {}
		public CircleV3(double radius) {
			//super();
			//this.radius = radius;
			this.setRadius(radius);
		}



		public void setRadius(double radius){
			if(radius <= 0){//��װ�ĺô������ԶԴ�������Խ��м򵥵���֤
				radius = 1;
			}else{
				//this->��ָ�� ��/����
				this.radius = radius;
			}
			
		}
		public double getPerimeter() {
			perimeter = 2  * Math.PI * radius;
			return perimeter;
		}

		public double getArea() {
			area = Math.PI * Math.pow(radius, 2);
			return area;
		}



}
