package test;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




public class DialogDemo {
	/**
	 * 对话框示列
	 * 
	 */
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "提示信息");
		//参数1：对话框的夫窗体
		//JOptionPane.showMessageDialog(null, "提示信息");
		//JOptionPane.showMessageDialog(null, "今天你吃了吗？", "嘘寒问暖", JOptionPane.WARNING_MESSAGE);
		//参数5：对话框中显示的图片对象
		//JOptionPane.showMessageDialog(null, "今天你吃了吗？", "嘘寒问暖", JOptionPane.WARNING_MESSAGE, new ImageIcon("images/timg.jpg"));
		
		//JOptionPane.showInputDialog(null, "吃了没", "吃鸡", 0, new ImageIcon("images/timg.jpg"), null, "默认值");
		
		
//		JOptionPane.showInputDialog(null, "吃了没", "吃鸡", 0, new ImageIcon("images/timg.jpg"), 
//				new String[]{"1.吃了吗", "2.管你p事", "3.今天一起吃1"}, 
//				"默认值"
//				);
//		
		JOptionPane.showConfirmDialog(null, "到底去不去吃饭!");
	}


		
	}


