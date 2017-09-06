package Employee;

import java.util.Collections;
import java.util.HashSet;
import company.Company;
import documents.Document;

public abstract class Employee {
	private static int ID = 0;
	protected int personalID;
	protected String name;
	protected double salary;
	protected int errorPossibility = Company.JUNIOR_RISK;
	protected HashSet<Document> finishedDocs = new HashSet();
	protected HashSet<Document> wrongDocs = new HashSet();
	protected HashSet<Document> newDocs = new HashSet();

	public Employee(String name, double salary) {
		// TO DO validate!!!
		this.name = name;
		this.salary = salary;
		this.personalID += ID++;
		if (this instanceof MiddleEmployee) {
			this.errorPossibility = Company.MIDDLE_RISK;
		}
		if (this instanceof SeniorEmployee) {
			this.errorPossibility = Company.SENIOR_RISK;
		}
	}

	@Override
	public String toString() {
		return "Emp [ID=" + personalID + ", name=" + name + ", salary=" + salary + "]\n";
	}

	public int getPersonalID() {
		return personalID;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public HashSet<Document> getFinishedDocs() {
		return (HashSet<Document>) Collections.unmodifiableSet(this.finishedDocs);
	}

	public HashSet<Document> getWrongDocs() {
		return (HashSet<Document>) Collections.unmodifiableSet(this.wrongDocs);
	}

	public HashSet<Document> getNewDocs() {
		return (HashSet<Document>) Collections.unmodifiableSet(this.newDocs);
	}

	public void doWork() {
		// TO DO
	}

	private void printReport() {
		// TO DO
	}

	public boolean addDocument(Document document) {
		if (!document.isSecret()) {
			this.newDocs.add(document);
			return true;
		}
		return false;
	}

	protected abstract void TransferJobToOtherEmployee(Document document);
}
