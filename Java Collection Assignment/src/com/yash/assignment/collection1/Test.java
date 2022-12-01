package com.yash.assignment.collection1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		List<Student> studentList = Arrays.asList(new Student(101, "Aishwarya", 45), new Student(102, "Akshay", 40),
				new Student(103, "Shantanu", 70), new Student(104, "Payal", 75));
		List<Double> collect2 = studentList.stream().map(Student::getAvg).collect(Collectors.toList());
		List<Double> firstThreeNumbers = collect2.stream().sorted().collect(Collectors.toList());
		firstThreeNumbers.forEach(System.out::println);
		List<Student> nameBelowFiftyMarks = studentList.stream().filter(s -> s.getAvg() < 50)
				.collect(Collectors.toList());
		nameBelowFiftyMarks.forEach(System.out::println);
		List<Student> nameBelowThirtyfive = studentList.stream().filter(s -> s.getAvg() < 35)
				.collect(Collectors.toList());
		nameBelowThirtyfive.forEach(System.out::println);
		List<String> byName = studentList.stream().map(Student::getSname).collect(Collectors.toList());
		byName.forEach(System.out::println);
	}

}
