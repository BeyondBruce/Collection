package www.yonyou.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeworkList {

	/*
	 * ����Ϊ2���ַ���List д3������������������list��1.ȡ������2.ȡ���� 3. ����1�еĵ��ǲ���2û�е�
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list2.add("1");
		list2.add("5");
		list2.add("6");
		list2.add("7");

		Intersection(list,list2);
		Union(list,list2);
		Complementaryset(list,list2);
		
	}

	// ȡ����
	public static void Intersection(List<String> list,List<String> list2) {
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		list3.addAll(list);
		list4.addAll(list2);
		list3.retainAll(list4);
		for(Object object : list3){  
	        System.out.println("����:"+object);  
	    }  
		
	}

	// ȡ����
	public static void Union(List<String> list,List<String> list2) {
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		list3.addAll(list);
		list3.removeAll(list2);
		list3.addAll(list2);		
		System.out.println("������"+list3);
		
	}

	// ����1�еĵ��ǲ���2û�е�
	public static void Complementaryset(List<String> list,List<String> list2) {
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		list3.addAll(list);
		list4.addAll(list2);
		list3.removeAll(list4);
		System.out.println("list�е�list2û�еģ�"+list3);
	}

}
