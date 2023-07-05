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

		int N;

		System.out.print("Report how many employees will be registered: ");
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			System.out.println("Employee " + (i + 1) + ":");

			System.out.print("Id: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee employee = new Employee(id, name, salary);

			list.add(employee);
		}

		sc.close();

	}

}
