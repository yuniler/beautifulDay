package chapter13;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;

public class FileDemo {
	//��ǰ�������ļ�·�������������ظ�д��
	//private static final String FilePath = ".";
	public static void main(String[] args) throws IOException {
		
		JFileChooser fileChooser = new JFileChooser(new File("."));//�����ļ��Ի���ĸ�Ŀ¼
		fileChooser.showOpenDialog(null);//��ʾѡ���ļ��ĶԻ���
//		System.out.println(fileChooser.getSelectedFile());
		
		File file = fileChooser.getSelectedFile();//����û�ѡ����ļ� 
		//��ǰ�������ڵĸ�Ŀ¼new File(".")
		//File file = new File(FilePath);
		System.out.println("�ļ�/�ļ����Ƿ���ڣ�" + file.exists());
		System.out.println("�ǲ���һ���ļ�" + file.isFile());
		System.out.println("�ǲ���һ���ļ��У�" + file.isDirectory());
		System.out.println("�ļ���/Ŀ¼����" + file.getName());
		System.out.println("����·��" + file.getAbsolutePath());
		System.out.println("·��" + file.getPath());
		System.out.println("����޸�ʱ�䣺" + file.lastModified());
		System.out.println("����޸�ʱ��" + new Date(file.lastModified()).toLocaleString());
		System.out.println("�Ƿ����أ�" + file.isHidden());
		System.out.println("�Ƿ�ɶ���" + file.canRead());
		System.out.println("�Ƿ��д��" +file.canWrite());
		System.out.println("��ռ�ռ�" + file.length());//�ļ���С
		//file.canExecute()
		
//		//ʹ��File�ഴ���ļ�
//		if(!file.exists()){//�����ھʹ���
//			if(file.isFile()){
//				file.createNewFile();
//				System.out.println("�����ļ�");
//			}else{//else if(file.isDirectory()){
//				file.mkdir();//����Ŀ¼
//				System.out.println("����Ŀ¼");
//			}//}
//			//if(file.createNewFile())
////					System.out.println("�ļ�/�ļ��д����ɹ���");
//		}
//		//ɾ��
//		if(file.exists()){
//			file.delete();//ɾ���ļ��м��ļ� 		����ɾ���ļ���Ŀ¼
//			file.deleteOnExit();		//�ڳ������ʱ�����ļ�ɾ��
//		}
		
//		//�г���ǰĿ¼�µ������ļ�/�ļ���
//		String[] fileNames = file.list();
//		for (int i = 0; i < fileNames.length; i++) {
//			System.out.println(fileNames[i]);
//		}
		
		//���䣺
		
	}
}
