package chapter12;
/**�������������������
 * 
 * @author sunguangyu
 *
 */
public class ExceptionDemo {
	public static int division(int num1, int num2){
		System.out.println("�������ǰ��");
//		int result = num1 / num2;
		int result = Integer.MIN_VALUE;
		try {
			result = num1 / num2;
		} catch (Exception e) {
			System.err.println("�쳣��Ϣ��" + e.getMessage());
			//��־��¼
		}
		System.out.println("���������");
		return result;
	}
	
	public static void main(String[] args) {
		int result = division(5, 0);
		System.out.println("result = " + result);
	}

}
