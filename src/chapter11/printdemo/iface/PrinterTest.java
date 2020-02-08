package chapter11.printdemo.iface;

import chapter11.printdemo.printdemo.impl.A4PaperImpl;
import chapter11.printdemo.printdemo.impl.B5PaperImpl;
import chapter11.printdemo.printdemo.impl.ColorInkBoxImpl;

public class PrinterTest {
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		//Ϊ��ӡ����װֽ�ź�ī��
		printer.setInkbox(new ColorInkBoxImpl());
		printer.setPaper(new B5PaperImpl());
		
		
		printer.print("��������");
	}
}
