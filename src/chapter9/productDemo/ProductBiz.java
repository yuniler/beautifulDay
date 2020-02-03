package chapter9.productDemo;

import javax.swing.JOptionPane;

/**
 * 商品管理类
 * @author sunguangyu
 *
 */
public class ProductBiz {
	public static void main(String[] args) {
		int[] counts = new int[3];//用来保存每种商品的总量
		double total = 0;//最终支付的总金额
		
		Product[] products = new Product[3];
		//对象存的是地址，没有空间
		for (int i = 0; i < counts.length; i++) {
			if(products[i] == null)
			products[i] = new Product();	//对象数组中的元素使用之前，一定记得分配空间
			//Product product = new Product();
			String name = JOptionPane.showInputDialog("请输入商品的名称:");
			products[i].setName(name);
			//接收用户输入的商品单价，要注意，返回值是字符串类型!
			String strPrice =  JOptionPane.showInputDialog("请输入商品的单价");
			//需要将字符串类型转换为double类型，再进行赋值
			//转换前最好进行验证，以避免异常
			products[i].setPrice(Double.parseDouble(strPrice));
			
			String strCount = JOptionPane.showInputDialog("请输入购买的数量:");
			counts[i] = Integer.parseInt(strCount);
			
			
			total += products[i].getPrice() * counts[i];
		}
		System.out.println("购物结算：");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName() + "\t" + products[i].getPrice());
			
		}
		System.out.println("商品的总金额为：" + total);
	}
}
