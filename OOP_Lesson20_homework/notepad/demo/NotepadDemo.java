package notepad.demo;

import notepad.notepad.ElectronicSecuredNotepad;
import notepad.notepad.SecuredNotepad;
import notepad.notepad.SimpleNotepad;

public class NotepadDemo {

	public static void main(String[] args) {

		// simple notepad demo
		System.out.println("Simple notepad demo:");
		SimpleNotepad notepad1 = new SimpleNotepad(3, "Simple Notepad 1");
		notepad1.viewAllPages();
		notepad1.addTextToPage("Once upon a time ,", 3);
		notepad1.addTitleToPage("Proba", 3);
		notepad1.addTextToPage("\nin Venice...", 3);
		notepad1.viewAllPages();
		notepad1.addTextDeleteOldTextToPage("Third try...", 3);
		notepad1.viewAllPages();
		notepad1.deletePageText(3);
		notepad1.viewAllPages();
		System.out.println("\n\n");

		// secured notepad demo
		System.out.println("Secured notepad demo:");
		SecuredNotepad notepad2 = new SecuredNotepad(5, "Securitate Notepad", "123");
		notepad1.viewAllPages();
		notepad2.addTextToPage("Take all my loves, my love, yea, take them all...", 2);
		notepad2.viewAllPages();
		notepad2.deletePageText(2);
		notepad2.viewAllPages();
		System.out.println("\n\n");

		// electronic secured notepad demo
		System.out.println("Electronic secrured notepad demo (password - 123Aa):");
		ElectronicSecuredNotepad elka = new ElectronicSecuredNotepad(4, "IMKO-2", "123Aa");
		elka.viewAllPages();
		elka.start();
		elka.addTextToPage("Once upon a time ,", 3);
		elka.addTitleToPage("Proba", 3);
		elka.viewAllPages();
		elka.stop();

	}
}
