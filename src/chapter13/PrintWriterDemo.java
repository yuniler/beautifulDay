package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * PrintWriter和PrintStream
 * 1.printWriter用来处理字符流，一次写2个字节：printStream用来处理字节流，一次写入一个字节
 * 建议：处理文本文件时，使用printwriter
 * @author sunguangyu
 *
 */
public class PrintWriterDemo {
	private static final String FilePath = "src/chapter13/FileDemo1.java";

	
	public static void main(String[] args) {
		//补充：关于java中的分隔符windows--\r\n
		String separator = System.getProperty("line.separator");
		String content = "public class FileDemo1{" + separator;
		content += "\tpublic static void main(String[] args){" + separator;
		content += "\t\tSystem.out.println(\"HelloWorld!\")" + separator;
		content += "\t}" + separator;
		content += "}";
		try(PrintWriter writer = new PrintWriter(new File(FilePath))){
			writer.write(content);
			System.out.println("写入成功！");
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
