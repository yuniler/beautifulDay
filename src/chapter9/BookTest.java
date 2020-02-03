package chapter9;

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("谈java", "123-321", 98.8, 5);
		//实例化图书业务对象
		BoodBiz bookBiz = new BoodBiz();
		int num = 1234;
		
		bookBiz.sellBook(book);
		bookBiz.test(num);
		
		System.out.println(num);
	}
}
