package test;

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
		//��Ϸ������
		JOptionPane.showMessageDialog(null, "���£�������", "��ӭ����XXX��ѡ����Ϸ", 0, new ImageIcon("images/title.jpg"));
		
		
		while(gameDays <= 10){
//			System.out.println("��Ϸ���е���" + gameDays + "��");
//			System.out.println("1���ʵ���ּѡ��\t\t�����ӣ�");
//			System.out.println("2�����Ƴ���\t\t���޸�״̬��");
//			System.out.println("3�������乬\t\t��ɾ����");
//			System.out.println("4���޵İ����أ�\t\t�����ҡ��޸�״̬��");
			String strMenu = "1���ʵ���ּѡ��\t\t�����ӣ�";
			strMenu += "2�����Ƴ���\t\t���޸�״̬��";
			strMenu += "3�������乬\t\t��ɾ����";
			strMenu += "4���޵İ����أ�\t\t�����ҡ��޸�״̬��";
			JOptionPane.showInputDialog(null, strMenu, "��Ϸ���е���" + gameDays +"��", 
					0, new ImageIcon("images/����.jpg"), 
					new String[]{"1", "2", "3", "4",}, 
					4
			);
			
			
			
			
//			int choice = input.nextInt();
			switch (1) {
			case 1://1���ʵ���ּѡ��\t\t�����ӣ�
				if (nnCount == nnNameArray.length){
					System.out.println("�ʵ۱��£�������Ϊ�����ʵۼ�Ҳû�����¹����������ʧ�ܣ�");
					break;
				}
//				System.out.println("�������½����������:");
//				String newName = input.next();
				Object objResult = JOptionPane.showInputDialog(null, "��ѡ����Ů", "ѡ��", 0, 
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
			case 2://2�����Ƴ���\t\t���޸�״̬��"
				System.out.println("��������������䣺");
				String name = input.next();
				//����
				int searchIndex = Integer.MIN_VALUE;
				for (int i = 0; i < nnCount; i++){
					if(name.compareTo(nnNameArray[i]) == 0){
						searchIndex = i;
						break;
					}
				}
					//�ҵ����������ǰ�ĺøж�+20����һ���������˺øж�-10
					loves[searchIndex] += 20;
					if (searchIndex + 1 == levelNames.length){
						System.out.println(nnNameArray[searchIndex] + "�����Ѿ�ĸ�����£�����ʧ�ܣ�");
						loves[searchIndex] += 10;
						break;
					}
					level[searchIndex] ++;
					for (int i = 0; i < nnCount; i++){
						if (i == searchIndex){
							continue;
						}
					loves[i] -= 10;
				}
					System.out.println("����" + nnNameArray[searchIndex] + "���øж�+10������Ϊ" + levelNames[level[searchIndex]]);
				
				break;
			case 3:
			case 4:
			case 5:
			default:
				System.out.println("��������1-4֮���������");
				continue;
			}
			
		
//		System.out.println("����\t����\t�øж�");
//		for (int i = 0; i <nnCount; i++){
//			System.out.println(nnNameArray[i] + "\t" + levelNames[level[i]] + "\t" + loves[i]);
//		}
			String value = "û��û���������ֹ���һ�죬�󹬵�������£�  \n";
			for (int i = 0; i < nnCount; i++) {
				value += String.format("%s   %s   %d\n", nnNameArray[i] + levelNames[level[i]] + loves[i]);
			}
			JOptionPane.showMessageDialog(null, "", "ÿ�ս���", 0, new ImageIcon("��Ϸ.jpg"));
			gameDays++;
	}
	}
}
