
public class SimpleNotepad implements INotepad {

	private Page[] pages;
	private String name;
	private int numberOfPages;

	SimpleNotepad(String name, int numberOfPages) {
		this.name = name;
		this.numberOfPages = numberOfPages; // ?????????????
		pages = new Page[numberOfPages];
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page("Страница " + (i + 1) + "/" + this.numberOfPages + " от бележник - " + this.name, "");

		}

	}

	String getName() {
		return name;
	}

	@Override
	public void addPageText(String text, int pageNumber) {
		if (pageNumber <= numberOfPages && pageNumber > 0) {
			pages[realPageNumber(pageNumber)].addTextToPage(text);
			return;
		}
		System.out.print("Не може да се добави текст - ");
		sorry();

	}

	@Override
	public void deletePageTextAddNewText(String text, int pageNumber) {
		if (pageNumber <= numberOfPages && pageNumber > 0) {
			pages[realPageNumber(pageNumber)].deletePageText();
			pages[realPageNumber(pageNumber)].addTextToPage(text);
			return;
		}
		System.out.print("Не може да се презапише - ");
		sorry();
	}

	@Override
	public void deletePageText(int pageNumber) {
		if (pageNumber <= numberOfPages && pageNumber > 0) {
			pages[realPageNumber(pageNumber)].deletePageText();
			return;
		}
		System.out.print("Не може да се изтрие - ");
		sorry();
	}

	@Override
	public void viewAllPages() {
		System.out.println("**************************************************************");
		System.out.println("Преглед на бележник - " + this.name);
		System.out.println("**************************************************************");
		for (int i = 0; i < pages.length; i++) {
			System.out.println("-----------------------------------------------");
			pages[i].viewPage();
		}
		System.out.println();
	}

	private int realPageNumber(int pageNumber) {
		return pageNumber - 1;
	}

	private void sorry() {
		System.out.println("няма страница с такъв номер!!!");
	}

	@Override
	public boolean searchWord(String word) {

		for (int i = 0; i < pages.length; i++) {
			if (pages[i].searchWord(word)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].containsDigits()) {
				System.out.println("*************");
				System.out.println("Страница " + (i + 1) + " съдържа цифри:");
				System.out.println("*************");
				pages[i].viewPage();

			}
		}

	}
}
