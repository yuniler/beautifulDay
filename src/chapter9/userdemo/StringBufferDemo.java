package chapter9.userdemo;
/**
 * 加强版字符串,带缓存字符串
 * @author sunguangyu
 *
 */

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer strBuffer = new StringBuffer("你好，成都！");//
		StringBuffer strBuffer1 = new StringBuffer("你好，成都！");
		StringBuffer strBuffer2 = new StringBuffer("你好，成都！");
		
//		System.out.println(strBuffer.reverse());
		System.out.println(strBuffer.reverse());	//反转字符串
		
		strBuffer1.insert(3, 3L);//在规定下标处插入元素
		System.out.println(strBuffer1);
		
		strBuffer2.deleteCharAt(3);
		System.out.println(strBuffer2);
		
		strBuffer2.delete(2, 4);			//删除[2,4)下标之间的元素
		System.out.println(strBuffer2);
		
		strBuffer1.replace(2, 4, "北京");	//替代
		System.out.println(strBuffer1);
		
		strBuffer1.setCharAt(3, '神');
		System.out.println(strBuffer1);
		
		System.out.println("缓存大小：" + strBuffer.capacity());
		
		strBuffer.setLength(0);			//相当于清空字符串对象
		
		strBuffer.trimToSize();		//缓存区
		
		
		
		
		
		
		
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
//		System.out.println("+=用时" + (endTime - startTime) + "毫秒");
//		
//		//使用Stringbuffer进行字符串的拼接
//		startTime = System.currentTimeMillis();
//		StringBuffer str1 = new StringBuffer("*");
//		for (int i = 0; i < N; i++) {
//			str1.append("*");
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("StringBuffer的append用时：" + (endTime - startTime) + "毫秒");
//		//StringBuilder
//		startTime = System.currentTimeMillis();
//		StringBuilder str2 = new StringBuilder("*");
//		for (int i = 0; i < N; i++) {
//			str2.append("*");
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("StringBuilder的append用时：" + (endTime - startTime) + "毫秒");
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
////		//底层实现
////		String str4 = new StringBuffer(String.valueOf(str1)).append(str2).toString();
////		
//	}
//}
