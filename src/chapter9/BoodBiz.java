package chapter9;
/**
 * ͼ���ҵ���࣬��װ�˶�ͼ���������ɾ�Ĳ�
 * @author sunguangyu
 *
 */
public class BoodBiz {
	public void test(int num){
		num++;
	}
	/**
	 * �����鼮
	 * book 	Ҫ���۵�ͼ�����
	 * ������۳ɹ����������۵�����������ʧ�ܣ�����-1
	 */
	public int sellBook(Book book){
		//1.�ж�ͼ��Ŀ���Ƿ����1
		//2.ͼ��Ŀ��-1
		//3.�������۵�����
		if((book.getCount() > 1)){
			return -1;
		}
		book.setCount(book.getCount() - 1);
		return 1;
	}

}
