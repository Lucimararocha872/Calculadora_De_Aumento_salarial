package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		int N, idForIncrease;
		double percent;

		System.out.print("Report how many employees will be registered: ");
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			
			System.out.println();
			System.out.println("Employee " + (i + 1) + ":");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("This Id already taken, please, try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee employee = new Employee(id, name, salary);

			list.add(employee);
		}

		System.out.println();
		System.out.print("Enter the employee Id that will have salary increase: ");
		idForIncrease = sc.nextInt();

		Integer position = positionId(list, idForIncrease);

		if (position == null) {
			System.out.println("This id does not exist!!!");
		} else {
			System.out.println("Enter the percentage: ");
			percent = sc.nextDouble();
			list.get(position).increaseSalary(percent);
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (Employee employee : list) {
			System.out.println(employee);
		}

		sc.close();

	}

	public static Integer positionId(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee employee = list.stream().filter( x -> x.getId() == id).findFirst().orElse(null);
		return employee != null;
	}

}
