package chapter9.userdemo;
/**
 * ��ǿ���ַ���,�������ַ���
 * @author sunguangyu
 *
 */

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer strBuffer = new StringBuffer("��ã��ɶ���");//
		StringBuffer strBuffer1 = new StringBuffer("��ã��ɶ���");
		StringBuffer strBuffer2 = new StringBuffer("��ã��ɶ���");
		
//		System.out.println(strBuffer.reverse());
		System.out.println(strBuffer.reverse());	//��ת�ַ���
		
		strBuffer1.insert(3, 3L);//�ڹ涨�±괦����Ԫ��
		System.out.println(strBuffer1);
		
		strBuffer2.deleteCharAt(3);
		System.out.println(strBuffer2);
		
		strBuffer2.delete(2, 4);			//ɾ��[2,4)�±�֮���Ԫ��
		System.out.println(strBuffer2);
		
		strBuffer1.replace(2, 4, "����");	//���
		System.out.println(strBuffer1);
		
		strBuffer1.setCharAt(3, '��');
		System.out.println(strBuffer1);
		
		System.out.println("�����С��" + strBuffer.capacity());
		
		strBuffer.setLength(0);			//�൱������ַ�������
		
		strBuffer.trimToSize();		//������
		
		
		
		
		
		
		
//		strBuffer.append('a');
//		strBuffer.append(123L);
//		
		
		}	
	}
//		System.out.println(strBuffer.toString().equals(strBuffer1.toString()));
////		
//		final int N = 100000;
//		long startTime = System.currentTimeMillis();
//		String str = "*";
//		for (int i = 0; i < N; i++) {
//			str += "*";
//			
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("+=��ʱ" + (endTime - startTime) + "����");
//		
//		//ʹ��Stringbuffer�����ַ�����ƴ��
//		startTime = System.currentTimeMillis();
//		StringBuffer str1 = new StringBuffer("*");
//		for (int i = 0; i < N; i++) {
//			str1.append("*");
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("StringBuffer��append��ʱ��" + (endTime - startTime) + "����");
//		//StringBuilder
//		startTime = System.currentTimeMillis();
//		StringBuilder str2 = new StringBuilder("*");
//		for (int i = 0; i < N; i++) {
//			str2.append("*");
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("StringBuilder��append��ʱ��" + (endTime - startTime) + "����");
//		
//		
//		
//		
//		
//		
//		
////		String str1 = "a";
////		String str2 = "b";
////		String str3 = str1 + str2;
////		//�ײ�ʵ��
////		String str4 = new StringBuffer(String.valueOf(str1)).append(str2).toString();
////		
//	}
//}
