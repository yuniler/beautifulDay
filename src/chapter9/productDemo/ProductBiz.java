package chapter9.productDemo;

import javax.swing.JOptionPane;

/**
 * ��Ʒ������
 * @author sunguangyu
 *
 */
public class ProductBiz {
	public static void main(String[] args) {
		int[] counts = new int[3];//��������ÿ����Ʒ������
		double total = 0;//����֧�����ܽ��
		
		Product[] products = new Product[3];
		//�������ǵ�ַ��û�пռ�
		for (int i = 0; i < counts.length; i++) {
			if(products[i] == null)
			products[i] = new Product();	//���������е�Ԫ��ʹ��֮ǰ��һ���ǵ÷���ռ�
			//Product product = new Product();
			String name = JOptionPane.showInputDialog("��������Ʒ������:");
			products[i].setName(name);
			//�����û��������Ʒ���ۣ�Ҫע�⣬����ֵ���ַ�������!
			String strPrice =  JOptionPane.showInputDialog("��������Ʒ�ĵ���");
			//��Ҫ���ַ�������ת��Ϊdouble���ͣ��ٽ��и�ֵ
			//ת��ǰ��ý�����֤���Ա����쳣
			products[i].setPrice(Double.parseDouble(strPrice));
			
			String strCount = JOptionPane.showInputDialog("�����빺�������:");
			counts[i] = Integer.parseInt(strCount);
			
			
			total += products[i].getPrice() * counts[i];
		}
		System.out.println("������㣺");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName() + "\t" + products[i].getPrice());
			
		}
		System.out.println("��Ʒ���ܽ��Ϊ��" + total);
	}
}
