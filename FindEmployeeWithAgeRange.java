package com.coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.coreJava.EmployeePojo.Employee;

public class FindEmployeeWithAgeRange {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "A", 2));
		list.add(new Employee(2, "E", 5));
		list.add(new Employee(3, "G", 27));
		list.add(new Employee(4, "Q", 18));
		list.add(new Employee(5, "R", 19));
		list.add(new Employee(6, "B", 29));
		list.add(new Employee(6, "C", 39));
		list.add(new Employee(6, "D", 49));
		
		//Find emp whose age is greater than 20 but less than 40 using Java 8
		list.stream().filter(s-> s.getEmpAge()>20 &&  s.getEmpAge()<40).forEach(System.out::println);
	}

}
