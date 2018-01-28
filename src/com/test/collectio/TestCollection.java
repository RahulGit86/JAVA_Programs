package com.test.collectio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
		//integerTest();
		stringTest();
	}
	public static void integerTest(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(16);
		list.add(18);
		list.add(10);
		/*Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		for(int i=0;i<list.size();i++){
			Integer obj =  list.get(i);
			if(obj == 16){
				list.remove(i);
				list.add(i, 26);
			}
			System.out.println(list.get(i));
		}
		if(list.contains(26)){
			System.out.println("26 exists");
		}
		/*for(int i=0;i<list.size();i++){			
			System.out.println(list.get(i));
		}*/
	}
	public static void stringTest(){
		List<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("rahul12");
		list.add("rahul11");
		list.add("rahul10");
		list.add("rahul88");
		list.add("rahul54");
		/*Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		/*for(int i=0;i<list.size();i++){
			String obj =  list.get(i);
			if(obj.equals("rahul11")){
				list.remove(i);
				list.add(i, "rahul1111");
			}
			System.out.println(list.get(i));
		}*/
		for(int i=0;i<list.size();i++){
			String obj =  list.get(i);
			if(obj.equals("rahul11")){
				list.remove(obj);
				list.add( "rahul1111");
			}
			System.out.println(list.get(i));
		}
		//Below code will throw error
		/*for(String str : list){
			if(str.equals("rahul11")){
				list.remove(str);
				list.add("rahul1111");
			}
			System.out.println(str);
		}*/
		if(list.contains("rahul1111")){
			System.out.println("rahul1111 exists");
		}
		System.out.println("Before clear::"+list.size());
		list.clear();
		System.out.println("After clear::"+list.size());
		/*for(int i=0;i<list.size();i++){			
			System.out.println(list.get(i));
		}*/
	}
}
