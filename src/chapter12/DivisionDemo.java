package chapter12;

public class DivisionDemo {
	/**
	 * ���������ַ������ֵĳ�������Ҫ����ת����
	 * @param strNum1
	 * @param strNum2
	 */
	public static void division(String strNum1, String strNum2) throws ArithmeticException{
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 / num2;
		System.out.println("result = " + result);
	}
	public static void main(String[] args) {
		try {
			//˭���ã�˭����
			division("123", "abc");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("��������������");
	}
}
