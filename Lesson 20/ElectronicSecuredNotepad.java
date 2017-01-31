
public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	boolean started;

	ElectronicSecuredNotepad(String name, int numberOfPages, String password) {
		super(name, numberOfPages, password);
	}

	@Override
	public void start() {
		started = true;
		System.out.println(super.getName()+ " се стартира!");

	}

	@Override
	public void stop() {
		System.out.println(super.getName()+ " се изключва!");
		started = false;

	}

	@Override
	public boolean isStarted() {
		return started;
	}

	@Override
	public void addPageText(String text, int pageNumber) {
		if (started) {
			super.addPageText(text, pageNumber);
			return;
		}
		System.out.println("Устройството не е включено!");
	}

	@Override
	public void deletePageTextAddNewText(String text, int pageNumber) {
		if (started) {
			super.deletePageTextAddNewText(text, pageNumber);
			return;
		}
		System.out.println("Устройството не е включено!");
	}

	@Override
	public void deletePageText(int pageNumber) {
		if (started) {
			super.deletePageText(pageNumber);
			return;
		}
		System.out.println("Устройството не е включено!");
	}

	@Override
	public void viewAllPages() {
		if (started) {
			super.viewAllPages();
			return;
		}
		System.out.println("Устройството не е включено!");
	}

	@Override
	public void printAllPagesWithDigits() {
		if (started) {
			super.printAllPagesWithDigits();
			return;
		}
		System.out.println("Устройството не е включено!");

	}

	@Override
	public boolean searchWord(String word) {
		if (started) {
			return super.searchWord(word);

		}
		System.out.println("Устройството не е включено и не може да се провери!");
		return false;
	}

}
