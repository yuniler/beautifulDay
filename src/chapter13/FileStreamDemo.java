package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * 演示文件输入。输出流的基本用法
 * 注意，目前的读写方式比较元素，在这里熟悉InputStrean/OutputStream的一些方法
 * 会有高级方法在后面
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
		outStream.write(content.getBytes());//核心语句，将字符串转换成字节数组，写入到文件中
		//写完一定要记得关闭打开的资源
		outStream.close();
	}
	
	
	public static void ReadFile() throws IOException{
		File file = new File(FilePath);
		InputStream inputStream = new FileInputStream(file);
		//inputStream.available()获取输入流可以读取的文件大小
		//读取文件的基本操作
		byte[] bytes = new byte[20000];
		int count = 0;
		inputStream.read(bytes);
//		while((bytes[count] = (byte)inputStream.read()) != -1){ 
//			count++;
//		}
		String content = new String(bytes);//将读取出的字节数组转换成字符串，以便打印
		System.out.println(content);
		inputStream.close();
	}
}
