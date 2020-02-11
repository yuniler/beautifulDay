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
//文件流，缓存流
public class BufferedStreamDemo {
	/**
	 * 注意：本文件路径是自己的路径
	 */
	private static final String FilePath1 = "";
	private static final String FilePath2 = "复制";
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {

//		//使用缓存流，装饰系统的输入对象
//		BufferedInputStream inStream = new BufferedInputStream(System.in);//buff可以做到scanner
//		byte[] bytes = new byte[200];
//		System.out.println("请输入字符串：");
//		inStream.read(bytes);
//		System.out.println("用户输入的字符串是：" + new String(bytes));//字节数组转换为字符串
//		
		
	}
	/**
	 * 用缓存流拷贝文件
	 * 拷贝过程的用时（毫秒）
	 * @return
	 */
	private static long CopyFileByBufferedStream(){
		File file = new File(FilePath1);//要复制的文件
		if(!file.exists()){
			System.out.println("文件不存在，复制失败！");
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
			int i = -1;//读取出的临时变量
			while((i = bInStream.read()) != -1){
				bOutStream.write(i);
			}//读取一个字节，就写入到缓存中！需要最后，将缓存最中的内容写入到文件中！
			//及，需要清空缓冲区，将缓冲区的内容写到文件中--flush（）
			System.out.println("文件复制成功！");
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
//			bOutStream.write("今天天气很好！".getBytes("utf-8"));
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
