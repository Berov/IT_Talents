package notepad.notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IЕlectronicDevice {
	private boolean isStarted = false;

	public ElectronicSecuredNotepad(int numberOfPages, String name, String password) {
		super(numberOfPages, name, password);
	}

	@Override
	public void start() {
		System.out.println("Device - ON");
		isStarted = true;
	}

	@Override
	public void stop() {
		System.out.println("Device - OFF");
		isStarted = false;
	}

	@Override
	public boolean isStarted() {
		if (isStarted) {
			return true;
		}
		return false;
	}

	@Override
	public void addTextToPage(String text, int number) {
		if (isStarted) {
			super.addTextToPage(text, number);
		} else {
			System.out.println("Sorry! This device is off! Can't add text...");
		}
	}

	@Override
	public void addTextDeleteOldTextToPage(String text, int number) {
		if (isStarted) {
			super.addTextDeleteOldTextToPage(text, number);
		} else {
			System.out.println("Sorry! This device is off! Can't add text over the old one...");
		}
	}

	@Override
	public void deletePageText(int number) {
		if (isStarted) {
			super.deletePageText(number);
		} else {
			System.out.println("Sorry! This device is off! Can't delete text...");
		}
	}

	@Override
	public void viewAllPages() {
		if (isStarted) {
			super.viewAllPages();
		} else {
			System.out.println("Sorry! This device is off! Can't view all pages...");
		}
	}

	@Override
	public void addTitleToPage(String title, int number) {
		if (isStarted) {
			super.addTitleToPage(title, number);
		} else {
			System.out.println("Sorry! This device is off! Can't add a title...");
		}
	}

	@Override
	public void searchWord(String word) {
		if (isStarted) {
			super.searchWord(word);
		} else {
			System.out.println("Sorry! This device is off! Can't serach word...");
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isStarted) {
			super.printAllPagesWithDigits();
		} else {
			System.out.println("Sorry! This device is off! Can't print the pages with digits...");
		}
	}

}
