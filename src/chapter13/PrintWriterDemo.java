package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * PrintWriter��PrintStream
 * 1.printWriter���������ַ�����һ��д2���ֽڣ�printStream���������ֽ�����һ��д��һ���ֽ�
 * ���飺�����ı��ļ�ʱ��ʹ��printwriter
 * @author sunguangyu
 *
 */
public class PrintWriterDemo {
	private static final String FilePath = "src/chapter13/FileDemo1.java";

	
	public static void main(String[] args) {
		//���䣺����java�еķָ���windows--\r\n
		String separator = System.getProperty("line.separator");
		String content = "public class FileDemo1{" + separator;
		content += "\tpublic static void main(String[] args){" + separator;
		content += "\t\tSystem.out.println(\"HelloWorld!\")" + separator;
		content += "\t}" + separator;
		content += "}";
		try(PrintWriter writer = new PrintWriter(new File(FilePath))){
			writer.write(content);
			System.out.println("д��ɹ���");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try(Scanner input = new Scanner(new File(FilePath))){
			StringBuffer value = new StringBuffer();
			String line = null;
			while(line)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
