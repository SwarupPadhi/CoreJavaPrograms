package com.coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.coreJava.EmployeePojo.Employee;

public class ConvertListToMap {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "A", 20));
		list.add(new Employee(2, "E", 25));
		list.add(new Employee(3, "G", 27));
		list.add(new Employee(4, "Q", 28));
		list.add(new Employee(5, "R", 19));
		list.add(new Employee(6, "B", 29));
		Map map = new HashMap();
		map = list.stream().collect(Collectors.toMap(Employee::getEmpId, Function.identity()));

		map.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
		System.out.println();
		list.stream().forEach(System.out::println);
		System.out.println();

		Comparator<Employee> sortByName = Comparator.comparing(Employee::getEmpName);
		Collections.sort(list, sortByName);
		list.stream().forEach(System.out::println);
		System.out.println();

		Comparator<Employee> sortByAge = Comparator.comparingInt(Employee::getEmpAge);
		Collections.sort(list, sortByAge);
		list.stream().forEach(System.out::println);
		System.out.println();

		list.sort(sortByName);
		list.stream().forEach(System.out::println);
		System.out.println();

		list.sort(sortByAge);
		list.stream().forEach(System.out::println);
		System.out.println();
	}
}