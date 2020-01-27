package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 * Collection 就是列表。就是多个数据或者对象的时候需要用到。
 * 是数组的补充
 * @author sunguangyu
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		whatIsSet();
	}
	
	/**
	 一般用不到Set,只用Set的子类
	 Collection 里都要用到泛型，防止存错
	 目标：会增删改查
	 */
	public static void whatIsSet(){
		/**
		 HashMap 存键值对(Key,Value)
		 泛型指定类型
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
	 一般用不到List,只用List的子类
	 Collection 里都要用到泛型，防止存错
	 目标：会增删改查
	 */
	public static void whatIsList(){
		
		/**
		 * List l1 = new List();
		 * 泛型-->规范类型
		 * 不需要声明Size，不需要管size，自动扩容!!!。
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
		//list.add(1);  泛型错误false
		list.add("0");//增
		list.add("1");
		list.add("2");
		list.add("3");
		//[0,1,2,3]
		//remove index为2的元素（第3个索引）。就是2
		//list.remove(2);//删
		
		//改，删 --需要用到迭代器Iterator
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
		 * 数组对比
		 * 需要声明Size,操作需要知道index索引位置
		 * 如果超出size.需要重新扩容new String[100].数据搞过来
		 */
		
		String[] shuzu = new String[10];
		shuzu[0] = "1";
		//shuzu[11] = "11";//crash
	}
	
	public static void printList(ArrayList<String> sss){
		//集合：List长度size()
		for(int i = 0;i < sss.size();i++){
			//这样remove不对。遍历过程中remove是错误。
//			if(i == 1){
//				sss.remove(i);
//			}
			System.out.print("--"+ sss.get(i));
		}
		
	}
	
	public static void printList(HashMap<String,String>  eee){
		// set 跟list 一样，但是是无序
		Set<String> set = eee.keySet();

		for (String key : set) {
			System.out.print("--"+ eee.get(key));
		 
		}
	}
}
