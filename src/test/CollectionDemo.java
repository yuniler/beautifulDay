package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 * Collection �����б����Ƕ�����ݻ��߶����ʱ����Ҫ�õ���
 * ������Ĳ���
 * @author sunguangyu
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		whatIsSet();
	}
	
	/**
	 һ���ò���Set,ֻ��Set������
	 Collection �ﶼҪ�õ����ͣ���ֹ���
	 Ŀ�꣺����ɾ�Ĳ�
	 */
	public static void whatIsSet(){
		/**
		 HashMap ���ֵ��(Key,Value)
		 ����ָ������
		 */
		HashMap<String,String> set = new HashMap<>();
		set.put("sun1guangyu", "111");
		set.put("sun2guangyu", "222");
		set.put("sun3guangyu", "333");
		set.put("sun4guangyu", "444");
		
		//System.out.print("set--"+ set.get("sun1guangyu"));
		//set.remove("sun1guangyu");
		set.put("sun1guangyu","100");
		printList(set);
	}
	
	
	
	
	
	/**
	 һ���ò���List,ֻ��List������
	 Collection �ﶼҪ�õ����ͣ���ֹ���
	 Ŀ�꣺����ɾ�Ĳ�
	 */
	public static void whatIsList(){
		
		/**
		 * List l1 = new List();
		 * ����-->�淶����
		 * ����Ҫ����Size������Ҫ��size���Զ�����!!!��
		 */
		ArrayList<Student> students = new ArrayList<>();
		Student s1 = new Student("s1","1");
		Student s2 = new Student("s2","2");
		Student s3 = new Student("s3","3");

		students.add(s1);
		students.add(s2);
		students.add(s3);
		System.out.print("--"+ students.get(1).cj.shuxue);
		
		
		ArrayList<String> list = new ArrayList<>();
		//list.add(1);  ���ʹ���false
		list.add("0");//��
		list.add("1");
		list.add("2");
		list.add("3");
		//[0,1,2,3]
		//remove indexΪ2��Ԫ�أ���3��������������2
		//list.remove(2);//ɾ
		
		//�ģ�ɾ --��Ҫ�õ�������Iterator
		ListIterator<String> it = (ListIterator<String>) list.listIterator();
		while(it.hasNext()){
			String currentString =it.next();
			if(currentString.equals("2")){
//				it.remove();  delete
				it.set("8"); 
			}
			System.out.print("--"+ currentString);
			
		}
		System.out.print("\n");
		printList(list);
		
		
		/**
		 * ����Ա�
		 * ��Ҫ����Size,������Ҫ֪��index����λ��
		 * �������size.��Ҫ��������new String[100].���ݸ����
		 */
		
		String[] shuzu = new String[10];
		shuzu[0] = "1";
		//shuzu[11] = "11";//crash
	}
	
	public static void printList(ArrayList<String> sss){
		//���ϣ�List����size()
		for(int i = 0;i < sss.size();i++){
			//����remove���ԡ�����������remove�Ǵ���
//			if(i == 1){
//				sss.remove(i);
//			}
			System.out.print("--"+ sss.get(i));
		}
		
	}
	
	public static void printList(HashMap<String,String>  eee){
		// set ��list һ��������������
		Set<String> set = eee.keySet();

		for (String key : set) {
			System.out.print("--"+ eee.get(key));
		 
		}
	}
}
