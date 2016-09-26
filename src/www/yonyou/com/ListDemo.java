package www.yonyou.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	/**
	 * List:有序，数据可重复
     * ArrayList:要进行查询，用ArrayList
     * linkedlist:如果对数据要插入，删除用linkedlist
                  线程安全就是说多线程访问同一代码，不会产生不确定的结果
	 * @param args
	 */
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(45);
		
		list.add(0, 34);
		System.out.println(list.get(0));
		
		Iterator iterator =list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}

}
