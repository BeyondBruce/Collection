package www.yonyou.com;

import java.util.ArrayList;
import java.util.List;


//��̬����
public class ArrayListDemo {

	/**
	 * ArrayList����������ֵ���ظ�ֵ������������Ҫ��Դ�����ݺ͹̶�λ�õ���ɾ
	 * �������ݣ��磺ArrayList<Object> arrayList = new ArrayList<Object>();
	 * Ӧ�����С��ArrayList<Object> arrayList = new ArrayList<Object>(20);
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

		//ת������������
		 Object [] array = list.toArray();  
	     for(int i = 0; i < array.length ; i ++){  
	      String str = (String)array[i];  
	      System.out.println( str);        
	     }  
		
	}

}
