package chapter12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ؼ��쳣--����RunTimeException��Error�������������
 * @author sunguangyu
 *
 */
public class CheckedException {
	public static void main(String[] args) {
		File file = new File("c:/test.txt");
		try {
			FileWriter Writer = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//�ļ���д�����׳��쳣
		//�ж�����ļ��Ƿ����
		System.out.println(file.exists());
		
	}
}
