package demo;

import java.util.Random;
import company.Company;
import documents.Document;

public class Demo {

	public static void main(String[] args) {

		// create company
		Company company = new Company("Happy Java Developement-2017");

		// create random 20 employees
		for (int i = 0; i < 20; i++) {
			company.addNewEmployee(Util.nameGenerator(),
					Company.Departements.values()[new Random().nextInt(Company.Departements.values().length)]);
		}

		// create 50 random documents
		for (int i = 0; i < 50; i++) {
			company.addTask(new Document(Util.documentGenerator(), (new Random().nextInt(20) + 1), new Random().nextBoolean()));
		}
		company.work();
		
		
		// System.out.println(company.company);
	}

}
