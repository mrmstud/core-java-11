package com.java8learn.functions;

import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8learn.utils.Employee;
import com.java8learn.utils.MyUtility;

public class PredicateFindAdminFromUserList {

	public static void main(String[] args) {
		Set<Employee> employees = MyUtility.getAllEmployees();
		String roleAdmin = "Admin";
		String roleRegular = "Regular";
		Predicate<Employee> adminRolePredicate = e->e.getRole().equals(roleAdmin);
		Predicate<Employee> aregularRolePredicate = e->e.getRole().equals(roleRegular);
		
		//Find Admins from employee list
		Set<Employee> admins = getEmployeeByRole(employees, adminRolePredicate);
		System.out.println("Admin Employees:");
		admins.forEach(System.out::println);
		
		//Find Non-Admins from employee list
		Set<Employee> nonadmins = getEmployeeByRole(employees, aregularRolePredicate);
		System.out.println("Regular Employees:");
		nonadmins.forEach(System.out::println);
		
	}

	private static Set<Employee> getEmployeeByRole(Set<Employee> employees, Predicate<Employee> checkRole) {
				return employees.stream().filter(checkRole).collect(Collectors.toSet());
	}

}

