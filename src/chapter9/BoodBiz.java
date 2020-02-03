package chapter9;
/**
 * 图书的业务类，封装了对图书数组的增删改查
 * @author sunguangyu
 *
 */
public class BoodBiz {
	public void test(int num){
		num++;
	}
	/**
	 * 销售书籍
	 * book 	要销售的图书对象
	 * 如果销售成功，返回销售的数量；销售失败，返回-1
	 */
	public int sellBook(Book book){
		//1.判断图书的库存是否大于1
		//2.图书的库存-1
		//3.返回销售的数量
		if((book.getCount() > 1)){
			return -1;
		}
		book.setCount(book.getCount() - 1);
		return 1;
	}

}
