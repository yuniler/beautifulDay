package test;

import java.util.Date;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AppMain5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Ұ����Ů����������
		String[] newNameArray = {"���", "��ԲԲ", "��СС", "���", "������"};
		int newNameCount = newNameArray.length;//��ѡ��Ů������
		
		
		String[] nnNameArray = {"��ʩ", "����", "���Ѿ�", "����", "�Է���", "", "", "", "", ""};
		String[] levelNames = {"����", "����", "����", "�ʹ���", "�ʺ�"};
		int[] level = new int[10];
		int[] loves = new int[10];
		
		int nnCount = 5;
		int gameDays = 1;
		
		//�趨Ĭ�Ϻøж�Ϊ100
		for (int i = 0; i < nnCount; i++){
			loves[i] = 100;
		}
		loves[1] = 60;
		loves[2] = 60;
		loves[3] = 60;
		//��Ϸ������
		JOptionPane.showMessageDialog(null, "���£�������", "��ӭ����XXX��ѡ����Ϸ", 0, new ImageIcon("images/title.jpg"));
		
		
		while(gameDays <= 10){
//			System.out.println("��Ϸ���е���" + gameDays + "��");
//			System.out.println("1���ʵ���ּѡ��\t\t�����ӣ�");
//			System.out.println("2�����Ƴ���\t\t���޸�״̬��");
//			System.out.println("3�������乬\t\t��ɾ����");
//			System.out.println("4���޵İ����أ�\t\t�����ҡ��޸�״̬��");
			String strMenu = "1���ʵ���ּѡ��\n";
			strMenu += "2�����Ƴ���\n";
			strMenu += "3�������乬\n��";
			strMenu += "4���޵İ����أ�\n";
			strMenu += "������ѡ��";
			Object objResult = JOptionPane.showInputDialog(null, strMenu, "��Ϸ���е���" + gameDays +"��", 
					0, new ImageIcon("images/����.jpg"), 
					new String[]{"1", "2", "3", "4"}, 
					4
			);
			
			
			
			
//			int choice = input.nextInt();
			
			//���û���ѡ��1-4֮����ַ�����ת��������
			switch (objResult.toString()) {
			case "1"://1���ʵ���ּѡ��\t\t�����ӣ�
				if (nnCount == nnNameArray.length){
					System.out.println("�ʵ۱��£�������Ϊ�����ʵۼ�Ҳû�����¹����������ʧ�ܣ�");
					break;
				}
//				System.out.println("�������½����������:");
//				String newName = input.next();
				objResult = JOptionPane.showInputDialog(null, "��ѡ����Ů", "ѡ��", 0, 
						new ImageIcon("Images/timg.jpg"), 
						newNameArray, 
						null
				);
				
				if(objResult == null){
					continue;//��ѡbreak����continue������
					
				}
				JOptionPane.showMessageDialog(null, objResult.toString(), "ѡ������", 0, new ImageIcon("images/" + objResult.toString() + ".jpg"));
				
				
				
				
				nnNameArray[nnCount] = objResult.toString();
				loves[nnCount] = 100;
				//��������ĺøж�-10
				for (int i = 0; i < nnCount; i++){
					loves[i] -= 10;
				}
				nnCount++;
				break;
			case "2"://2�����Ƴ���\t\t���޸�״̬��"
//				System.out.println("��������������䣺");
//				String name = input.next();
				objResult = JOptionPane.showInputDialog(null, "������ѡ��", "����", 0,
						new ImageIcon("images/ѡ������.jpg"),
						nnNameArray,
						null
						
				);		//����
				if(objResult == null){
					continue;
				}
				
				
				String name = objResult.toString();
				//����
				
				int searchIndex = Integer.MIN_VALUE;
				for (int i = 0; i < nnCount; i++){
					if(name.compareTo(nnNameArray[i]) == 0){
						searchIndex = i;
						break;
					}
				}
				
				if (searchIndex == Integer.MIN_VALUE){
					System.out.println("���£��벻Ҫ�������У�Ҫ�����ʵ��");
					break;
				}
					//�ҵ����������ǰ�ĺøж�+20����һ���������˺øж�-10
					loves[searchIndex] += 20;
					if (searchIndex + 1 == levelNames.length){
						System.out.println(nnNameArray[searchIndex] + "�����Ѿ�ĸ�����£�����ʧ�ܣ�");
						loves[searchIndex] += 10;
						//break;
					}else{level[searchIndex] ++;
					for (int i = 0; i < nnCount; i++){
						if (i == searchIndex){
							continue;
						}
					loves[i] -= 10;
				}
					//System.out.println("����" + nnNameArray[searchIndex] + "���øж�+10������Ϊ" + levelNames[level[searchIndex]]);
					JOptionPane.showMessageDialog(null, "����" + nnNameArray[searchIndex] + "���øж�+10������Ϊ" + levelNames[level[searchIndex]], 
							"���ƵĽ��", 
							0, 
							new ImageIcon("images/ " + nnNameArray[searchIndex] + ".jpg"));
						
					}
//					level[searchIndex] ++;
//					for (int i = 0; i < nnCount; i++){
//						if (i == searchIndex){
//							continue;
//						}
//					loves[i] -= 10;
//				}
//					//System.out.println("����" + nnNameArray[searchIndex] + "���øж�+10������Ϊ" + levelNames[level[searchIndex]]);
//					JOptionPane.showMessageDialog(null, "����" + nnNameArray[searchIndex] + "���øж�+10������Ϊ" + levelNames[level[searchIndex]], 
//							"���ƵĽ��", 
//							0, 
//							new ImageIcon("images/ " + nnNameArray[searchIndex] + ".jpg"));
					break;
			case "3":
			case "4":
			case "5":
			default:
				System.out.println("��������1-4֮���������");
				continue;
			}
			
		
//		System.out.println("����\t����\t�øж�");
//		for (int i = 0; i <nnCount; i++){
//			System.out.println(nnNameArray[i] + "\t" + levelNames[level[i]] + "\t" + loves[i]);
//		}
			//�����3�����ϵ����Ӻøжȵ���60����ô�������ң���Ϸǿ���˳�
			int count = 0;
			for (int i = 0; i < nnCount; i++) {
				if(loves[i] < 60){
					count++;
				}
				
			}
			String reslutValue = "����3�����ϵ�����øжȵ���60����������! \n";
			reslutValue += new Date().toLocaleString();
			if(count >= 3){
				JOptionPane.showMessageDialog(null, "����3�����ϵ�����øжȵ���60����������", "ͻ���¼�����������", 0, new ImageIcon("images/���ϱ���.jpg"));
				System.exit(0);
			}
			
			
			
			
			
			//ÿ�ս���
			String value = "û��û���������ֹ���һ�죬�󹬵�������£�  \n";
			for (int i = 0; i < nnCount; i++) {
				value += String.format("%s   %s   %d\n", nnNameArray[i], levelNames[level[i]], loves[i]);
			}
			JOptionPane.showMessageDialog(null, value, "ÿ�ս���", 0, new ImageIcon("images/��Ϸ.jpg"));
			gameDays++;
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
