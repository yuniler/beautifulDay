package chapter13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ʹ���ַ������ļ����л����Ķ�д����
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
		//Ҫд����ַ���
		String content = "src/chapter13/FileDemo.java\n";
		content += "//�����ɴ����Զ�����\n";
		content += "public class FileDemo{\n";
		content += "\tpublic static void main(String[] args){\n";
		content += "System.out.println(\"Hello World!\");\n}";
		BufferedWriter bWriter = null;
		try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(FilePath2))){
			//ʹ��jdk7�Ժ��Զ��ر���Դ
			bWriter.write(content);//���ַ���д�뵽������
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			//ע�⣺����bWriter.close���׳�IOException��������쳣�ͱ��½ṹ����
			//���µĴ��������鿴�����Ƶ��쳣��Ϣ
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
