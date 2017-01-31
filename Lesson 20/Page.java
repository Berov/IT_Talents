
public class Page {
	private String header = "";
	private String pageText = "";
	// int number;

	Page(String header, String pageText) {
		this.header = header;
		this.pageText = pageText;
	}

	void addTextToPage(String textForAdding) {
		String newText = this.pageText + textForAdding;
		this.pageText = newText;
	}

	void deletePageText() {
		String newText = "";
		pageText = newText; // or null ???
	}

	void viewPage() { // всяка страница ще може да се преглежда(т.е. метод,
						// който връща String със заглавието и текста на нов
						// ред)???

		System.out.println("Заглавие: " + header);
		System.out.println("Съдържание: " + pageText);
	}

	boolean searchWord(String word) {
		return pageText.toLowerCase().contains(word.toLowerCase());
	}

	boolean containsDigits() {

		return (pageText.contains("1") || pageText.contains("2") || pageText.contains("3") || pageText.contains("4")
				|| pageText.contains("5") || pageText.contains("6") || pageText.contains("7") || pageText.contains("8")
				|| pageText.contains("9") || pageText.contains("0"));
	}
}
