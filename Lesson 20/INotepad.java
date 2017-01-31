
public interface INotepad {

	void addPageText(String text, int pageNumber);

	void deletePageTextAddNewText(String text, int pageNumber);

	void deletePageText(int pageNumber);

	void viewAllPages();

	boolean searchWord(String word);

	void printAllPagesWithDigits();

}
