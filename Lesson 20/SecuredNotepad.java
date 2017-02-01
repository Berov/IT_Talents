import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

	private String password;

	SecuredNotepad(String name, int numberOfPages, String password) {
		super(name, numberOfPages);
		this.setPassword(password);
	}

	@Override
	public void addPageText(String text, int pageNumber) {
		System.out.print("За да се добави текст, ");
		if (checkPassword()) {
			super.addPageText(text, pageNumber);
			return;
		}
		System.out.print("Не може да се добави текст - ");
		sorry();

	}

	@Override
	public void deletePageTextAddNewText(String text, int pageNumber) {
		System.out.print("За да се добави текст на мястото на стария, ");
		if (checkPassword()) {
			super.deletePageText(pageNumber);
			super.addPageText(text, pageNumber);
			return;
		}
		System.out.print("Не може да се презапише - ");
		sorry();

	}

	@Override
	public void deletePageText(int pageNumber) {
		System.out.print("За да се итрие текста, ");
		if (checkPassword()) {
			super.deletePageText(pageNumber);
			return;
		}
		System.out.print("Не може да се изтрие - ");
		sorry();

	}

	@Override
	public void viewAllPages() {
		System.out.print("За да видите съдържанието, ");
		if (checkPassword()) {
			super.viewAllPages();
			return;
		}
		System.out.print("Не може да се прегледа - ");
		sorry();
	}

	private void sorry() {
		System.out.println("няма страница с такъв номер!!!");
	}

	private boolean checkPassword() {
		int counter = 3; // брой опити за въвеждане на парола
		Scanner sc = new Scanner(System.in);
		String pass;
		do {
			System.out.println("въведете паролата за " + super.getName());
			pass = sc.nextLine();
			if (this.password.equals(pass)) {
				System.out.println("Паролата е приета!");
				// sc.close();
				return true;
			}
			counter--;
			if (counter > 0) {
				System.out
						.println("Съжаляваме, но паролата е грешна!!! Опитайте пак! Остават Ви " + counter + " опита.");
			}

		} while (counter > 0);

		System.out.println("Съжаляваме, но паролата е грешна! Операцията няма да се изпълни!");
		// sc.close();
		return false;
	}

	@Override
	public boolean searchWord(String word) {
		if (checkPassword()) {
			return super.searchWord(word);
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (checkPassword()) {
			super.printAllPagesWithDigits();
			return;
		}

	}

	private void setPassword(String pass) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			boolean hasSmallLetters = false;
			boolean hasCapitalLetters = false;
			boolean hasDigits = false;

			for (int i = 0; i < pass.length(); i++) {
				if (hasCapitalLetters || Character.isUpperCase(pass.charAt(i))) {
					hasCapitalLetters = true;
				}
				if (hasSmallLetters || Character.isLowerCase(pass.charAt(i))) {
					hasSmallLetters = true;
				}
				if (hasDigits || Character.isDigit(pass.charAt(i))) {
					hasDigits = true;
				}
			}
			if (pass.length() < 5 || !hasCapitalLetters || !hasSmallLetters || !hasDigits) {
				System.out.println("Паролате не е достатъчна сигурна!");
				System.out.println("Трябва да е поне 5 знака и да има малки и главни букви и поне една цифра!");
				System.out.println("Въведете нова парола!");
				pass = null;
				pass = sc.nextLine();
			} else {

				this.password = pass;
				return;
			}
		}

	}

}
