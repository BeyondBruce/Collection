package www.yonyou.com;

import java.util.ArrayList;
import java.util.List;


//动态数组
public class ArrayListDemo {

	/**
	 * ArrayList：允许插入空值，重复值；性能消耗主要来源于扩容和固定位置的增删
	 * 避免扩容，如：ArrayList<Object> arrayList = new ArrayList<Object>();
	 * 应估算大小：ArrayList<Object> arrayList = new ArrayList<Object>(20);
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("3");
		list.add("4");
		list.add("");

		//转换成数组后输出
		 Object [] array = list.toArray();  
	     for(int i = 0; i < array.length ; i ++){  
	      String str = (String)array[i];  
	      System.out.println( str);        
	     }  
		
	}

}
