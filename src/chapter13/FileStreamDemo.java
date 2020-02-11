package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * ��ʾ�ļ����롣������Ļ����÷�
 * ע�⣬Ŀǰ�Ķ�д��ʽ�Ƚ�Ԫ�أ���������ϤInputStrean/OutputStream��һЩ����
 * ���и߼������ں���
 * @author sunguangyu
 *
 */
public class FileStreamDemo {
	private static final String FilePath = "src/chapter13/FileDemo.java";
	public static void main(String[] args) throws IOException {
		ReadFile();
	}
	
	public static void writeFile() throws IOException{
		final String FilePath1 = "src/chapter13/FileDemo1.java";
		OutputStream outStream = new FileOutputStream(FilePath1);
		String content = "public static void main(String[] args){\n";
		content += "System.out.println(\"Hello World!\");\n}";
		outStream.write(content.getBytes());//������䣬���ַ���ת�����ֽ����飬д�뵽�ļ���
		//д��һ��Ҫ�ǵùرմ򿪵���Դ
		outStream.close();
	}
	
	
	public static void ReadFile() throws IOException{
		File file = new File(FilePath);
		InputStream inputStream = new FileInputStream(file);
		//inputStream.available()��ȡ���������Զ�ȡ���ļ���С
		//��ȡ�ļ��Ļ�������
		byte[] bytes = new byte[20000];
		int count = 0;
		inputStream.read(bytes);
//		while((bytes[count] = (byte)inputStream.read()) != -1){ 
//			count++;
//		}
		String content = new String(bytes);//����ȡ�����ֽ�����ת�����ַ������Ա��ӡ
		System.out.println(content);
		inputStream.close();
	}
}
