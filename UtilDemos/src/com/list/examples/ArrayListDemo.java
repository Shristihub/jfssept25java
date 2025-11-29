package com.list.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
//		Collections.unmodifiableList(null)
//		List.of()
//		Arrays.asList(null)
		
		List<String> mylist =  new ArrayList<>();
		System.out.println(mylist.size());
		mylist.add("apple");
		mylist.add("100");
		mylist.add("Orange");
		System.out.println(mylist.size());
		System.out.println(mylist);
		mylist.add(1,"Banana");
		System.out.println(mylist);
		mylist.add("kiwi");
		mylist.add("mango");
		mylist.set(3, "Strawberry");
		System.out.println(mylist);
		System.out.println();
		
		Iterator<String> it = mylist.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str.toLowerCase());
		}
		System.out.println(mylist.size());
		
		ListIterator<String> listIterator = mylist.listIterator(mylist.size());
		while(listIterator.hasPrevious()) {
			String str = listIterator.previous();
			System.out.println(str.toLowerCase());
		}
		System.out.println();
		
		Collections.sort(mylist); //elements will be sorted - but not for userdefined
		
		for(String str :mylist) {
			System.out.println(str);
		}
	}
}
