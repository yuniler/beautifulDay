package chapter12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 必检异常--除了RunTimeException和Error的其他类的子类
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
		}//文件的写入器抛出异常
		//判断这个文件是否存在
		System.out.println(file.exists());
		
	}
}
