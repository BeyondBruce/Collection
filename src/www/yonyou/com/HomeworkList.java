package www.yonyou.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeworkList {

	/*
	 * 参数为2个字符串List 写3个方法，返回类型是list：1.取交集；2.取并集 3. 参数1有的但是参数2没有的
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

	// 取交集
	public static void Intersection(List<String> list,List<String> list2) {
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		list3.addAll(list);
		list4.addAll(list2);
		list3.retainAll(list4);
		for(Object object : list3){  
	        System.out.println("交集:"+object);  
	    }  
		
	}

	// 取并集
	public static void Union(List<String> list,List<String> list2) {
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		list3.addAll(list);
		list3.removeAll(list2);
		list3.addAll(list2);		
		System.out.println("并集："+list3);
		
	}

	// 参数1有的但是参数2没有的
	public static void Complementaryset(List<String> list,List<String> list2) {
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		list3.addAll(list);
		list4.addAll(list2);
		list3.removeAll(list4);
		System.out.println("list有的list2没有的："+list3);
	}

}
