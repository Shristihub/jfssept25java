package com.set.examples;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> myset =  new HashSet<>();
//		Set<String> myset =  new LinkedHashSet<>();
//		Set<String> myset =  new TreeSet<>();
		myset.add("apple");
		myset.add("Orange");
		System.out.println(myset.size());
		System.out.println(myset);
		myset.add("kiwi");
		myset.add("kiwi");
		myset.add("mango");
		myset.add(null);
		myset.add("pineapple");
		myset.add("papaya");
		System.out.println(myset);
		System.out.println();
		
		for (String str : myset) {
			System.out.println(str);
		}
	}
}
