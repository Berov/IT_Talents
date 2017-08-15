package notepad.demo;

import notepad.notepad.INotepad;
import notepad.notepad.ElectronicSecuredNotepad;
import notepad.notepad.SecuredNotepad;
import notepad.notepad.SimpleNotepad;

public class NotepadDemo {

	public static void main(String[] args) {

		// simple notepad demo
		INotepad notepad = new SimpleNotepad(3, "Simple Notepad 1");
		System.out.println("Simple notepad demo:");
		notepad.viewAllPages();
		notepad.addTextToPage("Once upon a time ,", 3);
		notepad.addTitleToPage("Proba", 3);
		notepad.addTextToPage("\nin Venice...", 3);
		notepad.viewAllPages();
		notepad.addTextDeleteOldTextToPage("Third try...", 3);
		notepad.viewAllPages();
		notepad.deletePageText(3);
		notepad.viewAllPages();
		System.out.println("\n\n");

		// secured notepad demo
		System.out.println("Secured notepad demo:");
		notepad = new SecuredNotepad(5, "Securitate Notepad", "123");
		notepad.viewAllPages();
		notepad.addTextToPage("Take all my loves, my love, yea, take them all...", 2);
		notepad.viewAllPages();
		notepad.deletePageText(2);
		notepad.viewAllPages();
		System.out.println("\n\n");

		// electronic secured notepad demo
		System.out.println("Electronic secrured notepad demo (password - 123Aa):");
		notepad = new ElectronicSecuredNotepad(4, "IMKO-2", "123Aa");
		notepad.viewAllPages();
		((ElectronicSecuredNotepad) notepad).start(); //
		notepad.addTextToPage("Once upon a time ,", 3);
		notepad.addTitleToPage("Proba", 3);
		notepad.viewAllPages();
		((ElectronicSecuredNotepad) notepad).stop(); //

	}
}
