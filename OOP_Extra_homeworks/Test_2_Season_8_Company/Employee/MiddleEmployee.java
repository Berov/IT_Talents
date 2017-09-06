package Employee;

import documents.Document;

public class MiddleEmployee extends JuniorEmployee {

	public MiddleEmployee(String name, double salary) {
		super(name, salary);
	}

	@Override
	protected void TransferJobToOtherEmployee(Document document) {
		// TODO Auto-generated method stub
		super.TransferJobToOtherEmployee(document);
	}
}
