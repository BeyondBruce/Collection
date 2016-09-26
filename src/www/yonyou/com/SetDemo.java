package www.yonyou.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	/**
	 * 因为hashset不能插入重复元素，对于封装类以及String类都要
	 * 重写过equlas() hashcode()方法
	 * 
	 * Set:无序，不可重复
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
