
public class Demo {

	public static void main(String[] args) {
		//
		// Page page = new Page("Някаква страничка", "Едно дълго съдържание на
		// някаква страничка.Имало едно време...");
		// System.out.println(page.searchWord("има"));
		// System.out.println(page.containsDigits());

		// SimpleNotepad notepad1 = new SimpleNotepad("Обикновен бележник 1",
		// 4);
		//
		// notepad1.addPageText("Пробен текст за съдържание", 1);
		// notepad1.addPageText("Про65765675765т за съдържание", 2);
		// notepad1.addPageText("Пробен текст за съд1ържание", 3);
		// notepad1.addPageText("Пробен текст за съдържание", 4);
		// notepad1.printAllPagesWithDigits();
		// notepad1.viewAllPages();
		// notepad1.addPageText(" Добавен текст", 1);
		// notepad1.viewAllPages();
		// notepad1.deletePageTextAddNewText("Подменен текст :))))))", 1);
		// notepad1.viewAllPages();
		// notepad1.deletePageText(1);
		// notepad1.viewAllPages();

		// SimpleNotepad notepad2 = new SimpleNotepad("Обикновен бележник 2",
		// 5);
		// notepad2.addPageText("някакъв мъничък текст", 5);
		// notepad2.viewAllPages();
		// notepad2.addPageText(" Допълнителен текст", 5);
		// notepad2.viewAllPages();
		// notepad2.deletePageTextAddNewText("Съвсем друг текст", 5);
		// notepad2.viewAllPages();
		// notepad2.deletePageText(5);
		// notepad2.viewAllPages();

		// SecuredNotepad notepad3s = new SecuredNotepad("Хакерски бележник", 4,
		// "qwerty");
		// notepad3s.addPageText("някакъв мъничък текст", 1);
		// notepad3s.addPageText("някакъв мъни3чък текст", 2);
		// notepad3s.addPageText("някакъв мъничък текст", 3);
		// notepad3s.addPageText("някакъв мъничък текст 55", 4);
		// notepad3s.printAllPagesWithDigits();

		// notepad3s.viewAllPages();
		// notepad3s.addPageText("някакъв мъничък текст", 1);
		// notepad3s.viewAllPages();
		// notepad3s.deletePageTextAddNewText("Съвсем друг текст", 1);
		// notepad3s.viewAllPages();
		// notepad3s.deletePageText(1);
		// notepad3s.viewAllPages();

		ElectronicSecuredNotepad pad1 = new ElectronicSecuredNotepad("ИМКО-2", 4, "123");

		pad1.start();
		pad1.addPageText("някакъв мъничък текст", 1);
		pad1.addPageText("някакъв мъни3чък текст", 2);
		pad1.addPageText("някакъв мъничък текст", 3);
		pad1.addPageText("някакъв мъничък текст 55", 4);
		pad1.printAllPagesWithDigits();

		// pad1.viewAllPages();
		// pad1.addPageText("някакъв мъничък текст", 1);
		// pad1.viewAllPages();
		// pad1.deletePageTextAddNewText("Съвсем друг текст", 1);
		// pad1.viewAllPages();
		// pad1.deletePageText(1);
		// pad1.stop();
		// pad1.viewAllPages();

	}

}
