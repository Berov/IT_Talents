package Employee;

import documents.Document;

public class JuniorEmployee extends Employee {

	public JuniorEmployee(String name, double salary) {
		super(name, salary);
	}

	@Override
	protected void TransferJobToOtherEmployee(Document document) {
		System.out.println(
				this.getName() + " is a junior employee! He can't to transfer documents to other employee! :(");

	}

}
