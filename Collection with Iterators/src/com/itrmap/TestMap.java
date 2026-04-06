package com.itrmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		// key : value

		Map<String, Integer> marks = new HashMap<>();

		// key : student_name , value : marks

		marks.put("raj", 82);
		marks.put("tina", 98);
		marks.put("jay", 87);
		marks.put("neha", 76);
		marks.put("raj", 74);
		marks.put("sam", null);

		System.out.println("--- Iterating using keyset() ---");

		for (String key : marks.keySet()) {

			System.out.println("Key: " + key + ", value: " + marks.get(key));
		}

		System.out.println("\n--- Iterating using values() ---");

		for (Integer allvalues : marks.values()) {

			System.out.println("value: " + allvalues);
		}
		System.out.println("\n--- Iterating using entrySet() ---");

		for (Map.Entry<String, Integer> kv : marks.entrySet()) {

			System.out.println("Key: " + kv.getKey() + ", value: " + kv.getValue());
		}

		System.out.println("\n--- Iterating using forEach Lambda ---");

		marks.forEach((k, v) -> System.out.println("Key: " + k + ", value: " + v));

		System.out.println("\n--- Iterating using Iterator ---");

		Iterator<Map.Entry<String, Integer>> itr = marks.entrySet().iterator();

		while (itr.hasNext()) {

			Map.Entry<String, Integer> entry = itr.next();

			if (entry.getValue() == null) {
				itr.remove();
			} else {

				System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
			}

		}

	}
}
