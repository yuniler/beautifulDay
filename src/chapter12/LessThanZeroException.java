package chapter12;
/**
 * �Զ����쳣-- С����ʱ����
 * @author sunguangyu
 *
 */
public class LessThanZeroException extends Exception{
	//��exception������Ҫ ����д������������췽��
	
	private int value;
	
	
	public LessThanZeroException(){
		super("���ֲ���С���㣡");
	}
	
	public LessThanZeroException(int value){
		super("���������Ϊ��" + value + "����С���㣡");
	}
	
}
