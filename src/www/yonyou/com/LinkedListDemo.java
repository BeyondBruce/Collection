package www.yonyou.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	/*
	 * LinkedList:���Է����ظ���ֵ��Ҳ���Է����ֵ
	 */
	public static void main(String[] args) {
		List<String> link = new LinkedList<String>();

		// �������
		link.add("1");
		link.add("2");
		link.add("3");
		link.add("4");

		// link.removeFirst();
		// link.removeLast();
		// link.subList(2, 3).clear();
		//link.indexOf("2");
		
		// ��ȡ����Ԫ��
		for (String str : link) {
			System.out.println(str);
		}

		//
		List list = link.subList(1, 2);
		System.out.println(list);

		// ��LinkedListת����ArrayList
		ArrayList<String> arrayList = new ArrayList<String>(link);
		for (String string : arrayList) {
			System.out.println(string);
		}

		//��LinkedListת��Ϊ����
		String[] str = link.toArray(new String[link.size()]);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
