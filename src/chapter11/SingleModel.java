package chapter11;
/**
 * ����ģʽʾ�� - ��·
 * @author sunguangyu
 *
 */
public class SingleModel {
	/** ��������Ψһ�ı����ʵ��  */
	private static SingleModel me = null;
	public int count = 0;
	private SingleModel(){
		count++;
	}
	/**
	 * ��ñ���Ψһ��һ��ʵ�� --- ����ģʽ�ĺ��ķ���
	 */
	public static SingleModel getInstance(){
		if(null == me)//ֻҪΪ�գ�����Ψһ��һ��ʵ����
			me = new SingleModel();//�ڱ������newһ��
		return me;
	}
}
