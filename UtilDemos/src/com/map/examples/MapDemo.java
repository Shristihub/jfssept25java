package com.map.examples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
//		added by hashcode value  accepts null key
//		Map<Integer,String> map = new HashMap<>(); 
		
//		added by insertion order accepts null key
//		Map<Integer,String> map = new LinkedHashMap<>();  
		
//		sort by keys no null values
		Map<Integer,String> map = new TreeMap<>();
		map.put(45, "Java");
		map.put(20, "css");
		map.put(82, "spring");
//		map.put(null, "html");
		map.put(1, "Java");
		map.put(82, "microservices");
//		map.put(null, "microservices");
		
		System.out.println(map);
		System.out.println();
		System.out.println(map.get(20).toUpperCase()); //css
		System.out.println(map.get(11)); // null
		System.out.println(map.containsKey(11));//false
		System.out.println(map.containsValue("Java"));
		System.out.println(map.getOrDefault(11, "not available"));
		
		
		//returns the keys
		Set<Integer> keys =  map.keySet();
		System.out.println(keys);
		for (Integer key : keys) {
			System.out.println(key+" "+map.get(key));
		}
		
		System.out.println();
		Set<Entry<Integer,String>> entries =   map.entrySet();
		for(Entry<Integer,String>  entry:entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		map.values(); // get the values;
		
				
		
	}

}
