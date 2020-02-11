package chapter13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.sun.istack.internal.FinalArrayList;
//�ļ�����������
public class BufferedStreamDemo {
	/**
	 * ע�⣺���ļ�·�����Լ���·��
	 */
	private static final String FilePath1 = "";
	private static final String FilePath2 = "����";
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {

//		//ʹ�û�������װ��ϵͳ���������
//		BufferedInputStream inStream = new BufferedInputStream(System.in);//buff��������scanner
//		byte[] bytes = new byte[200];
//		System.out.println("�������ַ�����");
//		inStream.read(bytes);
//		System.out.println("�û�������ַ����ǣ�" + new String(bytes));//�ֽ�����ת��Ϊ�ַ���
//		
		
	}
	/**
	 * �û����������ļ�
	 * �������̵���ʱ�����룩
	 * @return
	 */
	private static long CopyFileByBufferedStream(){
		File file = new File(FilePath1);//Ҫ���Ƶ��ļ�
		if(!file.exists()){
			System.out.println("�ļ������ڣ�����ʧ�ܣ�");
			return 0;
		}
		long startTime = System.currentTimeMillis();
		InputStream inStream = null;
		BufferedInputStream bInStream = null;
		OutputStream outStream = null;
		BufferedInputStream bOutStream = null;
		try {
			inStream = new FileInputStream(file);
			bInStream = new BufferedInputStream(inStream);
			outStream = new FileInputStream(FilePath2);
			bOutStream = new BufferedInputStream(bOutStream);
			int i = -1;//��ȡ������ʱ����
			while((i = bInStream.read()) != -1){
				bOutStream.write(i);
			}//��ȡһ���ֽڣ���д�뵽�����У���Ҫ��󣬽��������е�����д�뵽�ļ��У�
			//������Ҫ��ջ���������������������д���ļ���--flush����
			System.out.println("�ļ����Ƴɹ���");
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bOutStream.close();
				outStrean.close();
				bInStream.close();
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
		
		
	}
	
	
	
	
	
//	static final String FilePath1 = "src/chapter13/FileStreamDemo.java";
//	static final String FilePath2 = "src/chapter13/BufferedTest.java";
//	public static void main(String[] args) {
//		FileInputStream fInputStream = null;
//		BufferedInputStream bInputStream = null;
//		try {
//			fInputStream = new FileInputStream(FilePath1);
//			bInputStream = new BufferedInputStream(fInputStream);
//			byte[] bytes = new byte[bInputStream.available()];
//			bInputStream.read(bytes);
//			System.out.println(new String(bytes));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//			}
//		}
//
//		BufferedOutputStream bOutStream = null;
//		try {
//			bOutStream = new BufferedOutputStream(new FileOutputStream(FilePath2), 10240);
//			bOutStream.write("���������ܺã�".getBytes("utf-8"));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}finally{
//			try {
//				bOutStream.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		
//		
//	}

}
