package notepad.notepad;

interface INotepad {

	void addTextToPage(String text, int number);

	void addTextDeleteOldTextToPage(String text, int number);

	void addTitleToPage(String title, int number);

	void deletePageText(int number);

	void viewAllPages();

	void searchWord(String word);

	void printAllPagesWithDigits();
}
