package com.compr;

import java.util.Comparator;

import com.entity.Employee;

public class RoleComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getRole().compareTo(o2.getRole());
	}

}
