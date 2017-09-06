package Employee;

import documents.Document;

public class SeniorEmployee extends MiddleEmployee {
	// private boolean isChief = false;

	public SeniorEmployee(String name, double salary) {
		super(name, salary);
	}

	@Override
	public boolean addDocument(Document document) {
		this.newDocs.add(document);
		return true;
	}

	void removeLazyEmployee() {
		// TO DO
	}
}
