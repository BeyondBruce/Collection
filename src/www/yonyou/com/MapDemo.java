package www.yonyou.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	/**
	 *    : ===>TreeMap��������ģ�ͨ��comparator�ӿ����ǿ��Զ�TreeMap���ڲ�������о��ܵĿ���
	 * Map:
	 *    : ===>HashMap:����ʹ��nullֵ��null��������֤ӳ��˳�򣻲��ܰ����ظ��ļ�
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
		//ÿ�� Map.Entry ��ʵ����һ�� key-value ��
		Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<Integer, String> entry=iterator.next();
			
			System.out.println("key:"+entry.getKey()+" "+"value:"+entry.getValue());
		}

	}

}
