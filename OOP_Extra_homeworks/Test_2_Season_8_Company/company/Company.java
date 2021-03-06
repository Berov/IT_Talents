package company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import Employee.Employee;
import Employee.JuniorEmployee;
import Employee.MiddleEmployee;
import Employee.SeniorEmployee;
import documents.Document;

public class Company {

	public enum Departements {
		IT, RESEARCH, COUNTING, WORKING, REPAIRING // Departements
	}

	public static final int SENIOR_RISK = 4;
	public static final int MIDDLE_RISK = 3;
	public static final int JUNIOR_RISK = 2;
	public static final double SENIOR_SALARY = 3125; // lv
	public static final double MIDDLE_SALARY = 2000; // lv
	public static final double JUNIOR_SALARY = 1450; // lv
	private String name;
	private HashMap<Departements, LinkedHashMap<Integer, Employee>> company = new HashMap<Departements, LinkedHashMap<Integer, Employee>>(); // MAKE IT PRIVATE!!!
	private LinkedList<Document> newDocuments = new LinkedList<Document>(); // MAKE  IT PRIVATE!!!
	Scanner sc = new Scanner(System.in);

	public Company(String name) {
		while (name.isEmpty() || name == null) {
			System.out.println("Enter a valid company name please!");
			name = sc.nextLine();
		}
		this.name = name;
		System.out.println("There is a new company - " + this.name);
		// creating departements in the company map
		// for (Departements d : Departements.values()) {
		// company.put(d, new HashMap<Integer, Employee>());
		// }
	}

	public void addNewEmployee(String name, Departements departement) {
		Employee theNewOne;
		if (!company.containsKey(departement)) {
			company.put(departement, new LinkedHashMap<Integer, Employee>());
			theNewOne = new SeniorEmployee(name, Company.SENIOR_SALARY);
			company.get(departement).put(theNewOne.getPersonalID(), new SeniorEmployee(name, Company.SENIOR_SALARY));
			return;
		} else {
			switch (new Random().nextInt(3)) {
			case 0:
				theNewOne = new SeniorEmployee(name, Company.SENIOR_SALARY);
				company.get(departement).put(theNewOne.getPersonalID(), theNewOne);
				break;
			case 1:
				theNewOne = new MiddleEmployee(name, Company.MIDDLE_SALARY);
				company.get(departement).put(theNewOne.getPersonalID(), theNewOne);
				break;
			case 2:
				theNewOne = new JuniorEmployee(name, Company.JUNIOR_SALARY);
				company.get(departement).put(theNewOne.getPersonalID(), theNewOne);
				break;
			}
		}
	}

	public void addTask(Document newDocumnet) {
		newDocuments.add(newDocumnet);
	}

	public void work() {
		// puts documents to employees
		while (newDocuments.size() > 0) {
			for (Entry<Departements, LinkedHashMap<Integer, Employee>> e : company.entrySet()) {
				for (Entry<Integer, Employee> e2 : e.getValue().entrySet()) {
					if (newDocuments.size() > 0) {
						if (e2.getValue().addDocument(newDocuments.getLast())) {
							System.out.println("Big Boss gives to " + e2.getValue().getName() + " the task - "
									+ newDocuments.getLast().getName() + "!");
							newDocuments.removeLast();
						}
					}
				}
			}
		}
		
		System.out.println("\nLet's work!");

		// let's work
		for (Entry<Departements, LinkedHashMap<Integer, Employee>> e : company.entrySet()) {
			for (Entry<Integer, Employee> e2 : e.getValue().entrySet()) {
				e2.getValue().doWork();
			}
		}
	}

	public void printFinishedTasks() {
		// TO DO
	}

	public void printSalary() {
		// TO DO
	}

	public void printBestEmployee() {
		// TO DO
	}

	public void printWorstDepartement() {
		// TO DO
	}

	public void increaseSalary() {
		// to best 3-th
		// TO DO
	}

}
