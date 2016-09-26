package www.yonyou.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	/**
	 *    : ===>TreeMap：是有序的，通过comparator接口我们可以对TreeMap的内部排序进行精密的控制
	 * Map:
	 *    : ===>HashMap:允许使用null值，null键；不保证映射顺序；不能包含重复的键
	 * @param args
	 */
	
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "11");
		map.put(2, "12");
		map.put(3, "13");
		

//        for(Integer key: map.keySet()){
//        	System.out.println(key);
//        }
//        
//        for(String value: map.values()){
//        	System.out.println(value);
//        }
		//每个 Map.Entry 其实就是一个 key-value 对
		Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<Integer, String> entry=iterator.next();
			
			System.out.println("key:"+entry.getKey()+" "+"value:"+entry.getValue());
		}

	}

}
