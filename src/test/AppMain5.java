package test;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AppMain5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//野生美女的姓名数组
		String[] newNameArray = {"褒姒", "陈圆圆", "苏小小", "甄嬛", "钟无艳"};
		int newNameCount = newNameArray.length;//待选美女的总数
		
		
		String[] nnNameArray = {"西施", "貂蝉", "王昭君", "杨玉环", "赵飞燕", "", "", "", "", ""};
		String[] levelNames = {"贵人", "宾妃", "贵妃", "皇贵妃", "皇后"};
		int[] level = new int[10];
		int[] loves = new int[10];
		
		int nnCount = 5;
		int gameDays = 1;
		
		//设定默认好感度为100
		for (int i = 0; i < nnCount; i++){
			loves[i] = 100;
		}
		//游戏主界面
		JOptionPane.showMessageDialog(null, "陛下，您来了", "欢迎来到XXX后宫选妃游戏", 0, new ImageIcon("images/title.jpg"));
		
		
		while(gameDays <= 10){
//			System.out.println("游戏进行到第" + gameDays + "天");
//			System.out.println("1、皇帝下旨选妃\t\t（增加）");
//			System.out.println("2、翻牌宠幸\t\t（修改状态）");
//			System.out.println("3、打入冷宫\t\t（删除）");
//			System.out.println("4、朕的爱妃呢？\t\t（查找、修改状态）");
			String strMenu = "1、皇帝下旨选妃\t\t（增加）";
			strMenu += "2、翻牌宠幸\t\t（修改状态）";
			strMenu += "3、打入冷宫\t\t（删除）";
			strMenu += "4、朕的爱妃呢？\t\t（查找、修改状态）";
			JOptionPane.showInputDialog(null, strMenu, "游戏进行到第" + gameDays +"天", 
					0, new ImageIcon("images/宝座.jpg"), 
					new String[]{"1", "2", "3", "4",}, 
					4
			);
			
			
			
			
//			int choice = input.nextInt();
			switch (1) {
			case 1://1、皇帝下旨选妃\t\t（增加）
				if (nnCount == nnNameArray.length){
					System.out.println("皇帝陛下，后宫人满为患，皇帝家也没有米下锅啦》》添加失败！");
					break;
				}
//				System.out.println("请输入新进娘娘的名讳:");
//				String newName = input.next();
				Object objResult = JOptionPane.showInputDialog(null, "请选择秀女", "选妃", 0, 
						new ImageIcon("Images/timg.jpg"), 
						newNameArray, 
						null
				);
				
				if(objResult == null){
					continue;//可选break，和continue的区别
					
				}
				JOptionPane.showMessageDialog(null, objResult.toString(), "选中嫔妃", 0, new ImageIcon("images/" + objResult.toString() + ".jpg"));
				
				
				
				
				nnNameArray[nnCount] = objResult.toString();
				loves[nnCount] = 100;
				//其他娘娘的好感度-10
				for (int i = 0; i < nnCount; i++){
					loves[i] -= 10;
				}
				nnCount++;
				break;
			case 2://2、翻牌宠幸\t\t（修改状态）"
				System.out.println("请输入娘娘的名讳：");
				String name = input.next();
				//查找
				int searchIndex = Integer.MIN_VALUE;
				for (int i = 0; i < nnCount; i++){
					if(name.compareTo(nnNameArray[i]) == 0){
						searchIndex = i;
						break;
					}
				}
					//找到的情况：当前的好感度+20并升一级，其他人好感度-10
					loves[searchIndex] += 20;
					if (searchIndex + 1 == levelNames.length){
						System.out.println(nnNameArray[searchIndex] + "娘娘已经母仪天下，升级失败！");
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
					System.out.println("宠幸" + nnNameArray[searchIndex] + "，好感度+10，升级为" + levelNames[level[searchIndex]]);
				
				break;
			case 3:
			case 4:
			case 5:
			default:
				System.out.println("必须输入1-4之间的整数！");
				continue;
			}
			
		
//		System.out.println("姓名\t级别\t好感度");
//		for (int i = 0; i <nnCount; i++){
//			System.out.println(nnNameArray[i] + "\t" + levelNames[level[i]] + "\t" + loves[i]);
//		}
			String value = "没羞没臊的生活又过了一天，后宫的情况如下：  \n";
			for (int i = 0; i < nnCount; i++) {
				value += String.format("%s   %s   %d\n", nnNameArray[i] + levelNames[level[i]] + loves[i]);
			}
			JOptionPane.showMessageDialog(null, "", "每日结算", 0, new ImageIcon("嬉戏.jpg"));
			gameDays++;
	}
	}
}
