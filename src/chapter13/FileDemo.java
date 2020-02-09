package chapter13;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;

public class FileDemo {
	//当前操作的文件路径常量，避免重复写出
	//private static final String FilePath = ".";
	public static void main(String[] args) throws IOException {
		
		JFileChooser fileChooser = new JFileChooser(new File("."));//设置文件对话框的根目录
		fileChooser.showOpenDialog(null);//显示选择文件的对话框
//		System.out.println(fileChooser.getSelectedFile());
		
		File file = fileChooser.getSelectedFile();//获得用户选择的文件 
		//当前工程所在的根目录new File(".")
		//File file = new File(FilePath);
		System.out.println("文件/文件夹是否存在：" + file.exists());
		System.out.println("是不是一个文件" + file.isFile());
		System.out.println("是不是一个文件夹：" + file.isDirectory());
		System.out.println("文件名/目录名：" + file.getName());
		System.out.println("绝对路径" + file.getAbsolutePath());
		System.out.println("路径" + file.getPath());
		System.out.println("最后修改时间：" + file.lastModified());
		System.out.println("最后修改时间" + new Date(file.lastModified()).toLocaleString());
		System.out.println("是否隐藏：" + file.isHidden());
		System.out.println("是否可读：" + file.canRead());
		System.out.println("是否可写：" +file.canWrite());
		System.out.println("所占空间" + file.length());//文件大小
		//file.canExecute()
		
//		//使用File类创建文件
//		if(!file.exists()){//不存在就创建
//			if(file.isFile()){
//				file.createNewFile();
//				System.out.println("创建文件");
//			}else{//else if(file.isDirectory()){
//				file.mkdir();//创建目录
//				System.out.println("创建目录");
//			}//}
//			//if(file.createNewFile())
////					System.out.println("文件/文件夹创建成功！");
//		}
//		//删除
//		if(file.exists()){
//			file.delete();//删除文件夹及文件 		立即删除文件或目录
//			file.deleteOnExit();		//在程序结束时，将文件删除
//		}
		
//		//列出当前目录下的所有文件/文件夹
//		String[] fileNames = file.list();
//		for (int i = 0; i < fileNames.length; i++) {
//			System.out.println(fileNames[i]);
//		}
		
		//补充：
		
	}
}
