package www.yonyou.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	/**
	 * List:�������ݿ��ظ�
     * ArrayList:Ҫ���в�ѯ����ArrayList
     * linkedlist:���������Ҫ���룬ɾ����linkedlist
                  �̰߳�ȫ����˵���̷߳���ͬһ���룬���������ȷ���Ľ��
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
