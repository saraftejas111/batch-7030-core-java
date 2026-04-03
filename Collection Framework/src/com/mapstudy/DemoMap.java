package com.mapstudy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
	
	public static void main(String[] args) {
		//   key     value 
		Map<String , Integer> hashMap = new HashMap<>();
		
		hashMap.put("virat", 99) ; 
		
		hashMap.put("sachin", 10) ; 
		
		hashMap.put("rohit", 45) ; 
		
		hashMap.put("virat", 18) ;
		
		hashMap.put(null, 15) ; 
		
		hashMap.put("dhoni", 7) ; 
		
		hashMap.put(null, 13) ; 
		
		hashMap.put("sehwag", null) ; 
		
		hashMap.put("raina", null) ; 
		
		System.out.println("HashMap result : ");
		
		System.out.println(hashMap);
		
		//   key     value 
		Map<String , Integer> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("virat", 99) ; 
		
		linkedHashMap.put("sachin", 10) ; 
		
		linkedHashMap.put("rohit", 45) ; 
		
		linkedHashMap.put("virat", 18) ;
		
		linkedHashMap.put(null, 15) ; 
		
		linkedHashMap.put("dhoni", 7) ; 
		
		linkedHashMap.put(null, 13) ; 
		
		linkedHashMap.put("sehwag", null) ; 
		
		linkedHashMap.put("raina", null) ; 
		
		System.out.println("\nLinkedHashMap result : ");
		
		System.out.println(linkedHashMap);
		
		//   key     value 
		Map<String , Integer> treeMap = new TreeMap<>();
		
		treeMap.put("virat", 99) ; 
		
		treeMap.put("sachin", 10) ; 
		
		treeMap.put("rohit", 45) ; 
		
		treeMap.put("virat", 18) ;
		
		//treeMap.put(null, 15) ; 
		
		treeMap.put("dhoni", 7) ; 
		
		//treeMap.put(null, 13) ; 
		
		treeMap.put("sehwag", null) ; 
		
		treeMap.put("raina", null) ; 
		
		System.out.println("\nTreeMap result : ");
		
		System.out.println(treeMap);
		
		
		
		
		
	}

}
