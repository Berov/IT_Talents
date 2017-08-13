package notepad.notepad;

import java.util.Scanner;

public class SimpleNotepad implements INotepad {
	private Page[] page;
	String name;
	Scanner sc = new Scanner(System.in);

	public SimpleNotepad(int numberOfPages, String name) {
		if (numberOfPages > 0 && !name.isEmpty() && name != null) {
			this.name = name;
			page = new Page[numberOfPages];
			for (int i = 0; i < numberOfPages; i++) {
				page[i] = new Page("", "");
			}
		} else {
			do {
				System.out.println("Enter a notepad's name:");
				name = sc.nextLine();
			} while (name.isEmpty() || name == null);

			do {
				System.out.println("Enter number of pages >0:");
				numberOfPages = sc.nextInt();
			} while (numberOfPages < 1);

			this.name = name;
			page = new Page[numberOfPages];
			for (int i = 0; i < numberOfPages; i++) {
				page[i] = new Page("", "");
			}
		}
	}

	@Override
	public void addTextToPage(String text, int number) {
		page[realPageNumber(validateNumber(number))].addPageText(text);
	}

	@Override
	public void addTextDeleteOldTextToPage(String text, int number) {
		page[realPageNumber(validateNumber(number))].deletePageText();
		page[realPageNumber(validateNumber(number))].addPageText(text);
	}

	@Override
	public void deletePageText(int number) {
		page[realPageNumber(validateNumber(number))].deletePageText();
	}

	@Override
	public void viewAllPages() {
		System.out.println(this.name);
		for (int i = 0; i < page.length; i++) {
			System.out.println("---------- page " + (i + 1) + " ----------");
			page[i].viewPageText();
		}
		System.out.println("----------------------------\n\n\n");
	}

	public void addTitleToPage(String title, int number) {
		page[realPageNumber(validateNumber(number))].setTitle(title);
	}

	private int realPageNumber(int number) {
		return number - 1;
	}

	private int validateNumber(int number) {
		if (number > 0 && number <= page.length + 1) {
			return number;
		} else {
			do {
				System.out.println("Enter a real page number (1-" + page.length + "):");
				number = sc.nextInt();
			} while (number < 1 || number > page.length);
			return number;
		}
	}

	@Override
	public void searchWord(String word) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printAllPagesWithDigits() {
		System.out.println(this.name + " - pages with digits:");
		for (int i = 0; i < page.length; i++) {
			if (page[i].containsDigits()) {
				System.out.println("---------- page " + (i + 1) + " ----------");
				page[i].viewPageText();
			}
		}
		System.out.println("----------------------------\n\n\n");
	}

}
