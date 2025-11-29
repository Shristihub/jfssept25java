package com.list.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkDemo {

	public static void main(String[] args) {
		LinkedList<String> mylist =  new LinkedList<>();
		System.out.println(mylist.size());
		mylist.add("apple");
		mylist.addLast("kiwi");
		mylist.offerFirst("blueberry");
		mylist.add("Orange");
		mylist.add(1,"Banana");
		System.out.println(mylist);
		System.out.println();
		
		Iterator<String> it = mylist.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str.toLowerCase());
		}
		System.out.println();
		//use methods of deque
		System.out.println(mylist.element());
		System.out.println(mylist);
		System.out.println(mylist.peek());
		System.out.println(mylist);
		System.out.println(mylist.poll());
		System.out.println(mylist);
		System.out.println(mylist.poll());
		System.out.println(mylist);
		System.out.println(mylist.poll());
		System.out.println(mylist);
		System.out.println(mylist.poll());
		System.out.println(mylist);
		System.out.println("hi "+ mylist.poll());
		System.out.println(mylist);
		System.out.println("hiiii "+ mylist.peek());
//		System.out.println("ele "+ mylist.element()); //throws Exception
		System.out.println("ele "+ mylist.remove()); //throws Exception
	}
}











