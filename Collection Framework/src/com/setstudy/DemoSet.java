package com.setstudy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<>();

		hashSet.add("mango");
		hashSet.add("apple");
		hashSet.add("kiwi");
		hashSet.add(null);
		hashSet.add("banana");
		hashSet.add("apple");
		hashSet.add("orange");
		hashSet.add("mango");
		hashSet.add(null);

		System.out.println("HashSet result --> " + hashSet);

		Set<String> linkedHashSet = new LinkedHashSet<>();

		linkedHashSet.add("mango");
		linkedHashSet.add("apple");
		linkedHashSet.add("kiwi");
		linkedHashSet.add("banana");
		linkedHashSet.add("apple");
		linkedHashSet.add(null);
		linkedHashSet.add("orange");
		linkedHashSet.add("mango");
		linkedHashSet.add(null);

		System.out.println("\nLinkedHashSet result --> " + linkedHashSet);

		Set<String> treeSet = new TreeSet<>();

		treeSet.add("mango");
		treeSet.add("apple");
		treeSet.add("kiwi");
		// treeSet.add(null);
		treeSet.add("banana");
		treeSet.add("apple");
		treeSet.add("orange");
		treeSet.add("mango");
		// treeSet.add(null);

		System.out.println("\nTreeSet result --> " + treeSet);

	}

}
