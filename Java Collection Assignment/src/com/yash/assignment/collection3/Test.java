package com.yash.assignment.collection3;

import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Employee> empList = new CopyOnWriteArrayList<>();
		Employee employee1 = new Employee(101, "Vishnavi", 1000, "dev", "Nagpur");
		Employee employee2 = new Employee(102, "Mangesh",  2000, "dev", "Nashik");
		Employee employee3 = new Employee(103, "Pranav",   4000, "dev", "Jalgaon");

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		for (Employee employee : empList) {
			int objectElement = employee.getEid();
			int index = objectElement % 10;
			empList.add(index, employee);
		}
		empList.forEach(System.out::println);
	}

}
