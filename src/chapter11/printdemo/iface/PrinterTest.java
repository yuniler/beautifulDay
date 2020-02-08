package chapter11.printdemo.iface;

import chapter11.printdemo.printdemo.impl.A4PaperImpl;
import chapter11.printdemo.printdemo.impl.B5PaperImpl;
import chapter11.printdemo.printdemo.impl.ColorInkBoxImpl;

public class PrinterTest {
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		//为打印机安装纸张和墨盒
		printer.setInkbox(new ColorInkBoxImpl());
		printer.setPaper(new B5PaperImpl());
		
		
		printer.print("测试内容");
	}
}
