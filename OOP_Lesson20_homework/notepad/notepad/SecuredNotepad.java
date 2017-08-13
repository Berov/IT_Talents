package notepad.notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	String password; // must be an array of chars for security reasons!
	Scanner sc = new Scanner(System.in);

	public SecuredNotepad(int numberOfPages, String name, String password) {
		super(numberOfPages, name);
		setPassword(password);
	}

	@Override
	public void addTextToPage(String text, int number) {
		System.out.print("To add the text ");
		if (checkPass()) {
			super.addTextToPage(text, number);
		}
	}

	@Override
	public void addTextDeleteOldTextToPage(String text, int number) {
		System.out.print("To add the text over the old one ");
		if (checkPass()) {
			super.addTextDeleteOldTextToPage(text, number);
		}
	}

	@Override
	public void deletePageText(int number) {
		System.out.print("To delete the text ");
		if (checkPass()) {
			super.deletePageText(number);
		}
	}

	@Override
	public void viewAllPages() {
		System.out.print("To view all pages ");
		if (checkPass()) {
			super.viewAllPages();
		}
	}

	@Override
	public void addTitleToPage(String title, int number) {
		System.out.print("To add a page title ");
		if (checkPass()) {
			super.addTitleToPage(title, number);
		}
	}

	private void setPassword(String password) {
		if (password.length() >= 5 && password.matches(".*[a-z].*") && password.matches(".*[A-Z].*")
				&& password.matches(".*[0-9].*")) {
			this.password = password;
		} else {
			do {
				System.out.println(
						"Enter a better pass - 5 letters and more, capital letters, small letters and numbers...");
				password = sc.nextLine();
			} while (!(password.length() >= 5) || !password.matches(".*[a-z].*")
					|| !password.matches(".*[A-Z].*") || !password.matches(".*[0-9].*"));
			this.password = password;
		}
	}

	@Override
	public void searchWord(String word) {
		System.out.print("To search a word ");
		if (checkPass()) {
		super.searchWord(word);
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		System.out.print("To print all pages with digits ");
		if (checkPass()) {
		super.printAllPagesWithDigits();
		}
	}

	private boolean checkPass() {
		for (int i = 1; i <= 3; i++) { // the number of tries... probably 3
			System.out.println("enter your pass (" + (4 - i) + " tries left)");
			String pass = sc.nextLine();
			if (pass.equals(this.password)) {
				System.out.println("Password accepted!");
				return true;
			}
		}
		System.out.println("May be you are a hacker... but not a good hacker!\nPassword is not accepted!\nSorry!");
		return false;
	}
}
