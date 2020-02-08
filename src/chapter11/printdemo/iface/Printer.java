package chapter11.printdemo.iface;
/**
 * ��ӡ����--ʹ�ñ�׼��ī�к�ֽ�Ŵ�ӡ
 * @author sunguangyu
 *
 */
public class Printer {
	private IInkBox inkbox = null;
	private IPaper paper = null;
	
	/**
	 * ��ӡ���Ĵ�ӡ����---ʹ��ī�к�ֽ��
	 * content ���ݸ���ӡ�����ַ�������
	 * @return
	 */
	public void print(String content){
		if(null == inkbox || null == paper){
			System.out.println("ī�к�ֽ�ų��ִ����밲װ��ȷ�����ԣ�");
			return;
		}
		//��ӡ����
		String color = inkbox.getColor();
		String type = paper.getSize();
		System.out.println("����������" + color + "��ɫ�ģ�");
		System.out.println("ʹ��ֽ�ţ�" + type);
		System.out.println("��ӡ����" + content);
		
		
		
	}
	
	
	public IInkBox getInkbox() {
		return inkbox;
	}
	public void setInkbox(IInkBox inkbox) {
		this.inkbox = inkbox;
	}
	public IPaper getPaper() {
		return paper;
	}
	public void setPaper(IPaper paper) {
		this.paper = paper;
	}
	
	
	
}
