package notepad.notepad;

class Page {

	private String title = "";
	private String text = "";

	Page(String title, String text) {
		if (title != null && text != null) {
			this.title = title;
			this.text = text;
		} else {
			System.out.println("Inpossible page parameters!");
			this.title = "";
			this.text = "";
		}
	}

	void addPageText(String text) {
		if (!text.isEmpty() && text != null) {
			this.text = this.text + text;
		} else {
			System.out.println("You didn't add any text!");
		}

	}

	void deletePageText() {
		this.text = "";
	}

	void viewPageText() {
		System.out.println("     Title: " + title + "\n" + text);
	}

	String getTitle() {
		return title;
	}

	String getText() {
		return text;
	}

	void setTitle(String title) {
		if (title != null && !title.isEmpty()) {
			this.title = title;
		} else {
			System.out.println("Invalide title!");
		}
	}

	boolean searchWord(String word) {
		if (this.text.contains(word)) {
			return true;
		} else {
			return false;
		}
	}

	boolean containsDigits() {
		if (this.text.matches(".*[0-9].*")) {
			return true;
		} else {
			return false;
		}
	}
}
