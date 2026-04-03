package com.setstudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.liststudy.Employee;

public class TKA {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Raj", 12345);
		Employee emp2 = new Employee(102, "Neha", 12345);

		WardBoys wb1 = new WardBoys(1, "ramu");
		WardBoys wb2 = new WardBoys(2, "shamu");

		List<Object> employees = new ArrayList<>();
		List<Object> wardboys = new ArrayList<>();

		Map<String, List<Object>> office = new HashMap<>();

		office.put("Employees", employees);
		office.put("WardBoys", wardboys);

		for (Map.Entry<String, List<Object>> data : office.entrySet()) {

			System.out.println("keys --> " + data.getKey() + "  values : " + data.getValue().toString());
		}
	}
}
