package chapter13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用字符流对文件进行基本的读写操作
 * @author sunguangyu
 *
 */
public class ReaderAndWriterDemo {
	private static final String FilePath1 = "src/chapter13/FileDemo.java";
	private static final String FilePath2 = "src/chapter13/FileDemo.java";
	
	public static void main(String[] args){
		try {
			BufferedReader bReader = new BufferedReader(new FileReader(FilePath1));
			//
			String line = null;
			while((line = bReader.readLine()) != null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//要写入的字符串
		String content = "src/chapter13/FileDemo.java\n";
		content += "//本类由代码自动生成\n";
		content += "public class FileDemo{\n";
		content += "\tpublic static void main(String[] args){\n";
		content += "System.out.println(\"Hello World!\");\n}";
		BufferedWriter bWriter = null;
		try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(FilePath2))){
			//使用jdk7以后自动关闭资源
			bWriter.write(content);//将字符串写入到缓存中
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			//注意：由于bWriter.close会抛出IOException，这里的异常就被新结构抑制
			//以下的代码用来查看被抑制的异常信息
			if(e.getSuppressed() != null){
				Throwable[] throwables = e.getSuppressed();
				for(Throwable t : throwables){
					System.err.println(t.getMessage() + "cased by" + t.getClass().getSimpleName());
				}
			}
		}finally {
			
		}
		
		
	}
}
