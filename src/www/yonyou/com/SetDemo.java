package www.yonyou.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	/**
	 * ��Ϊhashset���ܲ����ظ�Ԫ�أ����ڷ�װ���Լ�String�඼Ҫ
	 * ��д��equlas() hashcode()����
	 * 
	 * Set:���򣬲����ظ�
	 * HashSet:
	 * TreeSet:
	 */

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(325);
		set.add(326);
		set.add(327);
		System.out.println(set.size());
		set.add(327);
		System.out.println(set.size());
		
		set.remove(327);
		
		Iterator iterator=set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

}
